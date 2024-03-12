public class ConstructorExamples {
  public ConstructorExamples(){ // no return type and name same as the class name
System.out.println("no arguments constructor");
  }

  public ConstructorExamples(int i){
    System.out.println(" Integer constructor");
  }

  public ConstructorExamples(int i, int y){
    System.out.println("2 Integer constructor");
  }

  public ConstructorExamples(String s){
    System.out.println("string constructor");
  }
  public static void main(String[] args) {
    ConstructorExamples ce = new ConstructorExamples();
  }
}
