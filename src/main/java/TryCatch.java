public class TryCatch {
  public static void main(String[] args) {
    try {
      int i = 10;
      System.out.println("Before Division");
      System.out.println(i / 0);
    }
    catch (Throwable t)// throwable is the parent class that catches tye exception. t is the object
    {
      System.out.println(t.getMessage());
      System.out.println(t.getCause());
      t.printStackTrace();
    }
    finally {

      System.out.println("This will gets execute finally");

    }

    System.out.println("After Division");

  }
}
