package javalearning;

public class SwitchCase {
  public static void main (String[]args) {
    /*
    * switch(expression){
    * case 1 :
    * statements
    * break;
    *  case 2:
    * statements
    * break;
    *
    * default:
    * statements
    * break;
     */
    int day= 0;
    switch (day) {
      case 1 :
        System.out.println("Monday");
        break;
      case 2 :
        System.out.println("Tuesday");
        break;
      case 3 :
        System.out.println("Wednesday");
        break;
      case 4 :
        System.out.println("Thursday");
        break;
      default:
        System.out.println("None of the cases matched");

    }
  }
}
