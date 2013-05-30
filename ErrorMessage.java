/*
    ErrorMessage.java
    Programmer: Ka Son Chan KaSonChan@my.unt.edu
    Class: CSCE 3650, Spring 2013
    Due: Mar 20, 2013
    cse01.cse.unt.edu
*/

public class ErrorMessage 
{

  public static void print (int position, String message) 
  {
    System . out . println ("");
    for (int i = 0; i < position; i++) 
      System . out . print (" ");
    System . out . println ("^");
    System . out . println ("***** Error: " + message + " *****");
    System . exit (0);
  }
}