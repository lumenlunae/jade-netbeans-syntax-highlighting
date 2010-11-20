package org.netbeans.jade.syntaxhighlighter;


import org.netbeans.api.lexer.Token;
import org.netbeans.jade.syntaxhighlighter.utils.AntlrCharStream;
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
public class JadeEditorLexer implements Lexer<JadeTokenId> {
  
  private LexerRestartInfo<JadeTokenId> info;
  private JadeLexer lexer;
  
  public JadeEditorLexer(LexerRestartInfo<JadeTokenId> info) {
    this.info = info;
    AntlrCharStream charStream = new AntlrCharStream(info.input(), "JadeEditor", true);
    lexer = new JadeLexer(charStream);
  }
  @Override
  public org.netbeans.api.lexer.Token<JadeTokenId> nextToken() {
    org.antlr.runtime.Token token = lexer.nextToken();
    Token<JadeTokenId> createdToken = null;
    if (token.getType() != -1) {
      JadeTokenId tokenId = JadeLanguageHierarchy.getToken(token.getType());
      createdToken = info.tokenFactory().createToken(tokenId);
    } else if(info.input().readLength() > 0) {
      JadeTokenId tokenId = JadeLanguageHierarchy.getToken(JadeLexer.WS);
      createdToken = info.tokenFactory().createToken(tokenId);
    }
    return createdToken;
  }

  @Override
  public Object state() {
    return null;
  }

  @Override
  public void release() {
  }

}
