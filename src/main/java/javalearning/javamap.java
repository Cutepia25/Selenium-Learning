package javalearning;

import java.util.HashMap;
import java.util.Map;

public class javamap {

  public static void main(String args[])
  {

    // Creating object for a Map.
    Map<String, Integer> map
      = new HashMap< String, Integer>();

    // Adding Elements using Map.
    map.put( "Rajat", 101);
    map.put("Shyam", 102);
    map.put("Rahul", 103);
    map.put("Krishna", 104);
    // here, elements may traverse in any order
    for (Map.Entry m : map.entrySet()) {
      System.out.println(m.getKey() + " "
                           + m.getValue());
    }
  }
}
