package org.netbeans.jade.syntaxhighlighter;


import org.netbeans.api.lexer.TokenId;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sei
 */
public class JadeTokenId implements TokenId {

  private final String name;
  private final String primaryCategory;
  private final int id;

  public JadeTokenId(
          String name,
          String primaryCategory,
          int id) {
    this.name = name;
    this.primaryCategory = primaryCategory;
    this.id = id;
  }
  @Override
  public String name() {
    return this.name;
  }

  @Override
  public int ordinal() {
    return this.id;
  }

  @Override
  public String primaryCategory() {
    return this.primaryCategory;
  }

}
