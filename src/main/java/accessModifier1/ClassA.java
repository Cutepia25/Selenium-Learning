package accessModifier1;

public class ClassA {


  public int publicvaraible=1;
  int defaultvariable=2;
  private int privatevariable=3;

  protected int protectedvariable=4;

  public void publicMethod(){
    System.out.println("public");
  }
  void defaultMethod(){
    System.out.println("default");
  }
  private void privateMethod(){
    System.out.println("private");
  }
  protected void protectedMethod(){
    System.out.println("protected");
  }
}
