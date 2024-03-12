package javalearning;

import java.util.HashSet;
import java.util.Set;

public class set {

  public static void main(String[] args)
  {
    // Set demonstration via using HashSet
    Set<String> Set = new HashSet<String>();

    // Adding some Elements
    Set.add("Java");
    Set.add("Python");
    Set.add("DBMS");
    Set.add("Operating System");
    Set.add("Machine Learning");
    Set.add("Operating System");

    // Here Set follows unordered way.
    System.out.println(Set);
  }
}
