package javalearning;

public class DoWhileLoop {
  public static void main(String[] args) {
    /*
    do {
    statement(s)
    } while (condition);
     */
    int i = 1;
    do {
      System.out.println(i);
      i++;
    } while (i<10);
    //if while condition will be false then only it will not go inside the code otherwise for false condition it will print
    //one time i
  }
}
