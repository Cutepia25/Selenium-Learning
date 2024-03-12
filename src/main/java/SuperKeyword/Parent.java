package SuperKeyword;

public class Parent {

  public Parent(){
    System.out.println("parent constructor");
  }

  public Parent(int i){
    System.out.println("parametrized constructor");
  }
  String empName = "tom";
  int empNo = 10;
  public void getData(){
    System.out.println(empName);
    System.out.println(empNo);
  }
}
