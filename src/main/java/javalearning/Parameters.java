package javalearning;

public class Parameters {
  public static void main(String[] args) {
    doLogin();
    doLogout();
    System.out.println(add(5,10));//arguments(values)
    diffParameters(2, "pic", 9F);


  }

  public static void doLogin() {
    // login code
    System.out.println("login successfully");
  }

  public static void doLogout() {
    doLogin();
    // logout code
    System.out.println("logout successfully");
  }

  public static int add(int x, int y) {
    //paramerters
//    int z = x + y;
//    return z;
    return x+y;
  }

  public static void diffParameters(int a, String b, Float c) {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
