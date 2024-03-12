package ThisKeyword;

public class ThisDemo {
  int x= 10;
  int y=20;
  String z= "rcv";
  public ThisDemo(){
    System.out.println("default");
  }
  public ThisDemo(int x, int y){
    System.out.println(x+y);
    System.out.println("parameter");
  }
  public static void main(String[] args){
ThisDemo de = new ThisDemo(5,9);
de.getData();
  }

  public void getData() {
    int x =50;
    int y =40;
    System.out.println(this.x+this.y);// insatnce variable will be given prefernce
    System.out.println(x+y);// local variable is given prefernce
    this.getData1();//this or without this it works same as java implicitly calls the this keyword
  }
  public void getData1() {
    int x =50;
    int y =40;
    System.out.println(this.x+this.y);// insatnce variable will be given prefernce
    System.out.println(x+y);// local variable is given prefernce
  }
}
