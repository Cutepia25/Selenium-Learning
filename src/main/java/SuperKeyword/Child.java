package SuperKeyword;

public class Child extends Parent {

  public Child() {
    super(3);
  }

    String empName = "Harry";
    int empNo = 12;

    public static void main(String[] args) {
      Child c = new Child();
      c.getData();
    }
      public void getData(){
//      super.getData();// get data from parent class
        System.out.println(super.empName);
        System.out.println(super.empNo);
        System.out.println(empName);// get data from child class
        System.out.println(empNo);
  }
}
