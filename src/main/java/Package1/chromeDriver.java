package Package1;

import javalearning.Method;

public class chromeDriver {

  public static void main(String[] args) {

    Method md = new Method();
    md.doLogin();
    // if we are calling the method in different package then we need to create the object and also use the import
  }
}
