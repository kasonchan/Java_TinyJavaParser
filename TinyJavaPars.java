/*
    TinyJavaPars.java
    Programmer: Ka Son Chan KaSonChan@my.unt.edu
    Class: CSCE 3650, Spring 2013
    Due: Mar 20, 2013
    cse01.cse.unt.edu
*/

import java_cup . runtime . *;

public class TinyJavaPars {

  public static void main (String args []) throws java.io.IOException {
    System . out . println ("Source Program");
    System . out . println ("--------------");
    System . out . println ("");

    try {
      SymbolFactory symbolFactory = new ComplexSymbolFactory ();
      TinyJavaParser parser = 
        new TinyJavaParser (new TinyJavaLexer (System . in, symbolFactory));
      parser . parse ();
    }
    catch (Exception e) {
      System . out . println ("Error in invoking parser/lexer");
    }
  }
}