package org.netbeans.jade.syntaxhighlighter;


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.api.lexer.Language;
import org.netbeans.jade.syntaxhighlighter.utils.AntlrTokenReader;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sei
 */
public class JadeLanguageHierarchy  extends LanguageHierarchy<JadeTokenId> {

  private static List<JadeTokenId> tokens;
  private static Map<Integer, JadeTokenId> idToToken;
  
  private static final Language<JadeTokenId> language = new JadeLanguageHierarchy().language();
  
  public static Language<JadeTokenId> getLanguage() {
    return language;
  }
  private static void init() {
      AntlrTokenReader reader = new AntlrTokenReader();
      tokens = reader.readTokenFile();
      idToToken = new  HashMap<Integer, JadeTokenId>();
      for (JadeTokenId token : tokens) {
        idToToken.put(token.ordinal(), token);
      }
  }
  
  static synchronized JadeTokenId getToken(int id) {
    if (idToToken == null) {
      init();
    }
    return idToToken.get(id);
  }
  
  @Override
  protected synchronized Collection<JadeTokenId> createTokenIds() {
    if (tokens == null) {
      init();
    }
    return tokens;
  }

  @Override
  protected synchronized Lexer<JadeTokenId> createLexer(LexerRestartInfo<JadeTokenId> info) {
    return new JadeEditorLexer(info);
  }

  @Override
  protected String mimeType() {
    return "text/x-jade";
  }

}
