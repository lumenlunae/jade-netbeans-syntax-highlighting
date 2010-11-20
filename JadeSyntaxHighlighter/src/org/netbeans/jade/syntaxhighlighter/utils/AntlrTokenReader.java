/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.netbeans.jade.syntaxhighlighter.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.netbeans.jade.syntaxhighlighter.JadeTokenId;
import org.openide.util.Exceptions;

/**
 *
 * @author James Reid
 */
public class AntlrTokenReader {

    private HashMap<String, String> tokenTypes = new HashMap<String, String>();
    private ArrayList<JadeTokenId> tokens = new ArrayList<JadeTokenId>();

    public AntlrTokenReader() {
        init();
    }

    /**
     * Initializes the map to include any keywords in the Hop Programming language.
     */
    private void init() {

        tokenTypes.put("CLASS", "class");
        tokenTypes.put("ID", "id");
        tokenTypes.put("NAME", "name");
        tokenTypes.put("CODE", "code");
        tokenTypes.put("LEFTPAREN", "brace");
        tokenTypes.put("RIGHTPAREN", "brace");
        tokenTypes.put("LEFTVAR", "brace");
        tokenTypes.put("RIGHTBRACE", "brace");
        tokenTypes.put("STRING", "value");
        tokenTypes.put("DOCTYPE", "doctype");
        tokenTypes.put("COMMENT", "comment");
        tokenTypes.put("SERVERCOMMENT", "servercomment");
        tokenTypes.put("KEY", "key");
        tokenTypes.put("PIPETEXT", "pipetext");
        tokenTypes.put("DATA", "data");
        tokenTypes.put("VARIABLE", "variable");
    }

    /**
     * Reads the token file from the ANTLR parser and generates
     * appropriate tokens.
     *
     * @return
     */
    public List<JadeTokenId> readTokenFile() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inp = classLoader.getResourceAsStream("org/netbeans/jade/syntaxhighlighter/utils/Jade.tokens");
        BufferedReader input = new BufferedReader(new InputStreamReader(inp));
        readTokenFile(input);
        return tokens;
    }

    /**
     * Reads in the token file.
     *
     * @param buff
     */
    private void readTokenFile(BufferedReader buff) {
        String line = null;
        try {
            while ((line = buff.readLine()) != null) {
                String[] splLine = line.split("=");
                String name = splLine[0];
                int tok = Integer.parseInt(splLine[1].trim());
                JadeTokenId id;
                String tokenCategory = tokenTypes.get(name);
                if (tokenCategory != null) {
                    //if the value exists, put it in the correct category
                    id = new JadeTokenId(name, tokenCategory, tok);
                } else {
                    //if we don't recognize the token, consider it to a separator
                    id = new JadeTokenId(name, "separator", tok);
                }
                //add it into the vector of tokens
                tokens.add(id);
            }
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
