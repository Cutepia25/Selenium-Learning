package Polymorphism;

public class MethodOverloading {
  public static void main(String[] args) {
    MethodOverloading mo = new MethodOverloading();
    mo.login(1,"abc");
  }
    public void login(String s, String p){
      System.out.println("Login successfully using username and password");
    }

    public void login(int i, String p)
    {
      System.out.println("Login successfully using phone number and password");
    }

  public void login(int i, String p, int t)
  {
    System.out.println("Login successfully using phone number,password and token");
    // same method name but different signature(parameters, parameters data types)
  }

  }
