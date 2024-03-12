package javalearning;

public class switches {

  public static void main(String[] args) {
      // Assuming the initial state of the switches is all off (false)
      boolean[] switches = new boolean[15];

      // Simulating employees switching the lights
      for (int employee = 1; employee <= 100; employee++) {
        for (int switchIndex = 0; switchIndex < switches.length; switchIndex++) {
          if ((switchIndex + 1) % employee == 0) {
            // Toggle the state of the switch
            switches[switchIndex] = !switches[switchIndex];
          }
        }
      }

      // Displaying the final status of each switch
      System.out.println("Final status of switches:");
      for (int i = 0; i < switches.length; i++) {
        System.out.println("Switch " + (i + 1) + ": " + (switches[i] ? "ON" : "OFF"));
      }

      // Displaying the status of the 15th switch
      System.out.println("\nStatus of the 15th switch: " + (switches[14] ? "ON" : "OFF"));
    }
  }
