package javalearning;

import static javalearning.Parameters.doLogin;

public class Main {
  public static void main(String[] args) {

    Method md = new Method();
    md.doLogin();
    doLogin();
    // if we want to use methods of different class in this class from same package then we need to create the object of that particular
    // class and then call the method.
    // if we are calling the method directly we need to import the class

    System.out.println("Hello world!");
  }
}