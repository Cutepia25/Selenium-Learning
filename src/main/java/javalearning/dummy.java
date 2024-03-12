package javalearning;

import java.util.*;

public class dummy {
  public static void main(String[] args) {
    // Creating a HashMap
    HashMap<Integer, String> hashMap = new HashMap<>();
    hashMap.put(4, "Banana");
    hashMap.put(2, "Apple");
    hashMap.put(1, "Orange");
    hashMap.put(3, "Grapes");

    // Sorting the HashMap by keys
    List<Map.Entry<Integer, String>> entryList = new ArrayList<>(hashMap.entrySet());
    Collections.sort(entryList, Map.Entry.comparingByKey());

    // Displaying the sorted HashMap by keys
    System.out.println("Sorted HashMap by keys:");
    for (Map.Entry<Integer, String> entry : entryList) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    // Sorting the HashMap by values
    Collections.sort(entryList, Map.Entry.comparingByValue());

    // Displaying the sorted HashMap by values
    System.out.println("\nSorted HashMap by values:");
    for (Map.Entry<Integer, String> entry : entryList) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
