/* Generated By:JJTree&JavaCC: Do not edit this line. ParserConstants.java */
package org.apache.velocity.runtime.parser;

public interface ParserConstants {

  int EOF = 0;
  int ESCAPE_SEQUENCE = 1;
  int TEXT = 2;
  int LPAREN = 3;
  int RPAREN = 4;
  int LBRACKET = 5;
  int RBRACKET = 6;
  int STRING_LITERAL = 7;
  int COMMA = 8;
  int TRUE = 9;
  int FALSE = 10;
  int DOLLAR = 11;
  int HASH = 15;
  int SINGLE_LINE_COMMENT = 16;
  int FORMAL_COMMENT = 17;
  int MULTI_LINE_COMMENT = 18;
  int NEWLINE = 22;
  int MINUS = 23;
  int PLUS = 24;
  int MULTIPLY = 25;
  int DIVIDE = 26;
  int MODULUS = 27;
  int LOGICAL_AND = 28;
  int LOGICAL_OR = 29;
  int LOGICAL_LT = 30;
  int LOGICAL_LE = 31;
  int LOGICAL_GT = 32;
  int LOGICAL_GE = 33;
  int LOGICAL_EQUALS = 34;
  int LOGICAL_NOT_EQUALS = 35;
  int LOGICAL_NOT = 36;
  int EQUALS = 37;
  int END = 38;
  int INCLUDE_DIRECTIVE = 39;
  int IF_DIRECTIVE = 40;
  int ELSEIF_DIRECTIVE = 41;
  int ELSE_DIRECTIVE = 42;
  int SET_DIRECTIVE = 43;
  int STOP_DIRECTIVE = 44;
  int DIGIT = 45;
  int NUMBER_LITERAL = 46;
  int LETTER = 47;
  int WORD = 48;
  int ALPHA_CHAR = 49;
  int ALPHANUM_CHAR = 50;
  int IDENTIFIER_CHAR = 51;
  int IDENTIFIER = 52;
  int DOT = 53;
  int SHORTHAND = 54;
  int LCURLY = 55;
  int RCURLY = 56;
  int REFERENCE_TERMINATOR = 57;

  int DEFAULT = 0;
  int REFERENCE = 1;
  int DIRECTIVE = 2;
  int IN_MULTI_LINE_COMMENT = 3;
  int IN_FORMAL_COMMENT = 4;
  int IN_SINGLE_LINE_COMMENT = 5;

  String[] tokenImage = {
    "<EOF>",
    "<ESCAPE_SEQUENCE>",
    "<TEXT>",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "<STRING_LITERAL>",
    "\",\"",
    "\"true\"",
    "\"false\"",
    "\"$\"",
    "\"##\"",
    "<token of kind 13>",
    "\"#*\"",
    "\"#\"",
    "<SINGLE_LINE_COMMENT>",
    "\"*#\"",
    "\"*#\"",
    "<token of kind 19>",
    "\" \"",
    "\"\\t\"",
    "<NEWLINE>",
    "\"-\"",
    "\"+\"",
    "\"*\"",
    "\"/\"",
    "\"%\"",
    "\"&&\"",
    "\"||\"",
    "\"<\"",
    "\"<=\"",
    "\">\"",
    "\">=\"",
    "\"==\"",
    "\"!=\"",
    "\"!\"",
    "\"=\"",
    "\"end\"",
    "\"include\"",
    "\"if\"",
    "\"elseif\"",
    "\"else\"",
    "\"set\"",
    "\"stop\"",
    "<DIGIT>",
    "<NUMBER_LITERAL>",
    "<LETTER>",
    "<WORD>",
    "<ALPHA_CHAR>",
    "<ALPHANUM_CHAR>",
    "<IDENTIFIER_CHAR>",
    "<IDENTIFIER>",
    "\".\"",
    "\"!\"",
    "\"{\"",
    "\"}\"",
    "<REFERENCE_TERMINATOR>",
  };

}
