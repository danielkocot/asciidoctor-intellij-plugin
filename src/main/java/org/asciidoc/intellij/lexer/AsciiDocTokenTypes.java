package org.asciidoc.intellij.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

/**
 * @author yole
 */
public interface AsciiDocTokenTypes {
  IElementType TEXT = new AsciiDocElementType("TEXT");
  IElementType BULLET = new AsciiDocElementType("BULLET");
  IElementType LINE_BREAK = new AsciiDocElementType("LINE_BREAK");
  IElementType LINE_COMMENT = new AsciiDocElementType("LINE_COMMENT");
  IElementType BLOCK_COMMENT = new AsciiDocElementType("BLOCK_COMMENT");
  IElementType PASSTRHOUGH_BLOCK_DELIMITER = new AsciiDocElementType("PASSTRHOUGH_BLOCK_DELIMITER");
  IElementType PASSTRHOUGH_BLOCK = new AsciiDocElementType("PASSTRHOUGH_BLOCK");
  IElementType QUOTE_BLOCK_DELIMITER = new AsciiDocElementType("QUOTE_BLOCK_DELIMITER");
  IElementType QUOTE_BLOCK = new AsciiDocElementType("QUOTE_BLOCK");
  IElementType LISTING_BLOCK_DELIMITER = new AsciiDocElementType("LISTING_BLOCK_DELIMITER");
  IElementType COMMENT_BLOCK_DELIMITER = new AsciiDocElementType("COMMENT_BLOCK_DELIMITER");
  IElementType LISTING_TEXT = new AsciiDocElementType("LISTING_TEXT");
  IElementType HEADING = new AsciiDocElementType("HEADING");
  IElementType HEADING_OLDSTYLE = new AsciiDocElementType("HEADING_OLDSTYLE");
  IElementType TITLE = new AsciiDocElementType("TITLE");
  IElementType BLOCK_MACRO_ID = new AsciiDocElementType("BLOCK_MACRO_ID");
  IElementType BLOCK_MACRO_BODY = new AsciiDocElementType("BLOCK_MACRO_BODY");
  IElementType BLOCK_MACRO_ATTRIBUTES = new AsciiDocElementType("BLOCK_MACRO_ATTRIBUTES");
  IElementType EXAMPLE_BLOCK_DELIMITER = new AsciiDocElementType("EXAMPLE_BLOCK_DELIMITER");
  IElementType EXAMPLE_BLOCK = new AsciiDocElementType("EXAMPLE_BLOCK");
  IElementType SIDEBAR_BLOCK_DELIMITER = new AsciiDocElementType("SIDEBAR_BLOCK_DELIMITER");
  IElementType SIDEBAR_BLOCK = new AsciiDocElementType("SIDEBAR_BLOCK");
  IElementType BLOCK_ATTRS_START = new AsciiDocElementType("BLOCK_ATTRS_START");
  IElementType BLOCK_ATTR_NAME = new AsciiDocElementType("BLOCK_ATTR_NAME");
  IElementType BLOCK_ATTRS_END = new AsciiDocElementType("BLOCK_ATTRS_END");
  IElementType BOLD_START = new AsciiDocElementType("BOLD_START");
  IElementType BOLD_END = new AsciiDocElementType("BOLD_END");
  IElementType BOLD = new AsciiDocElementType("BOLD");
  IElementType ITALIC_START = new AsciiDocElementType("ITALIC_START");
  IElementType ITALIC_END = new AsciiDocElementType("ITALIC_END");
  IElementType MONO_START = new AsciiDocElementType("MONO_START");
  IElementType MONO_END = new AsciiDocElementType("MONO_END");
  IElementType ITALIC = new AsciiDocElementType("ITALIC");
  IElementType BOLDITALIC = new AsciiDocElementType("BOLDITALIC");
  IElementType MONO = new AsciiDocElementType("MONO");
  IElementType LPAREN = new AsciiDocElementType("LPAREN");
  IElementType RPAREN = new AsciiDocElementType("RPAREN");
  IElementType LBRACKET = new AsciiDocElementType("LBRACKET");
  IElementType RBRACKET = new AsciiDocElementType("RBRACKET");
  IElementType MONOBOLD = new AsciiDocElementType("MONOBOLD");
  IElementType MONOITALIC = new AsciiDocElementType("MONOITALIC");
  IElementType MONOBOLDITALIC = new AsciiDocElementType("MONOBOLDITALIC");
  IElementType LT = new AsciiDocElementType("LT");
  IElementType GT = new AsciiDocElementType("GT");
  IElementType DOUBLE_QUOTE = new AsciiDocElementType("DOUBLE_QUOTE");
  IElementType SINGLE_QUOTE = new AsciiDocElementType("SINGLE_QUOTE");

  TokenSet TOKENS_TO_MERGE = TokenSet.create(TEXT, LISTING_TEXT, HEADING, TITLE, BLOCK_COMMENT,
      BLOCK_ATTR_NAME, BLOCK_MACRO_BODY, BLOCK_MACRO_ATTRIBUTES, EXAMPLE_BLOCK, PASSTRHOUGH_BLOCK,
      QUOTE_BLOCK, SIDEBAR_BLOCK, BOLD_START, BOLD_END, BOLD, ITALIC, ITALIC_END, ITALIC_START, BOLDITALIC,
      MONO_START, MONO_END, MONO, MONOBOLD, MONOBOLDITALIC);
}

