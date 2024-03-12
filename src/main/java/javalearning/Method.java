package javalearning;

public class Method {

  public static void main(String[] args) {

    Method md = new Method();
    md.doLogin();
    md.doLogout();

  }
  public void doLogin()
  {
    // login code
    System.out.println("login successfully");
  }
  public void doLogout()
  {
    doLogin();
    // logout code
    System.out.println("logout successfully");
  }
}
