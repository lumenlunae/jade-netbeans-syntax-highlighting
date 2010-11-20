package org.netbeans.jade.syntaxhighlighter;


import org.netbeans.api.lexer.InputAttributes;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.LanguagePath;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.LanguageEmbedding;
import org.netbeans.spi.lexer.LanguageProvider;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sei
 */
@org.openide.util.lookup.ServiceProvider(service=org.netbeans.spi.lexer.LanguageProvider.class)
public class JadeLanguageProvider extends LanguageProvider {

  @Override
  public Language<?> findLanguage(String mimeType) {
    if ("text/x-jade".equals(mimeType)) {
      return new JadeLanguageHierarchy().language();
    }
    return null;
  }

  @Override
  public LanguageEmbedding<?> findLanguageEmbedding(Token<?> token, LanguagePath lp, InputAttributes ia) {
    return null;
  }




}
