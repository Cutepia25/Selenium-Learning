package javalearning;

public class BreakAndContinue {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 7) {
//        break;
        // when i == 7 is there , it breaks the code and exit out of the loop and prints the statement outside the for loop.
        continue;
        // when i ==7 is true it continues further and dont print 7  and go again in the for loop.
      }

      System.out.println(i);
    }
      System.out.println("Final Statement prints");
    }
  }
