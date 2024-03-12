package javalearning;

public class SingleDimensionalArray {

  public static void main(String[] args) {
    int myArray[] = new int[5];
    myArray[0]=10;
      myArray[1]=20;
    myArray[2]=30;
      myArray[3]=40;
    myArray[4]=50;
    System.out.println(myArray[4]);
    System.out.println(myArray.length);
   int[] myArray1 = {10,20,30,40,50};
   System.out.println(myArray1[1]);
    System.out.println(myArray1.length);
    String[] myStringArray = new String[5];
    String[] myStringArray1 = {"Pi", "Ji"};
    System.out.println(myStringArray1[1]);
    int[] multiArray = {1, 2, 3, 4, 5, 6};
    for (int i = 0; i < multiArray.length; i++) {
      System.out.println(multiArray[i]);
    }


  }

}
