package FinalKeyword;

public class ChildFinal extends ParentFinal { // if parent class is final child class cannot inhert its property
 public final int i =10;// value of i cannot be changed
  public static void main(String[] args){
    ChildFinal c = new ChildFinal();
    System.out.println(c.i);
//    c.i=20;// assigning new value to variable i
    System.out.println(c.i);
    c.setData();
  }
//  public void setData(){
//    System.out.println(i);
  }
