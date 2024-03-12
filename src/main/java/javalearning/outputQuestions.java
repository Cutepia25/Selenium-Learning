package javalearning;

class outputQuestions {
  public static void main(String[] args) {
    try {
      int x = 5 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Exception");
    } catch (Exception e) {
      System.out.println("Arithmetic Exception");
    }
    System.out.print("Last Lone");
  }
}