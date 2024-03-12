package javalearning;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkdList {

  public static void main(String args[]){
    LinkedList<String> al=new LinkedList<String>();
    al.add("Ravi");
    al.add("Vijay");
    al.add("Ravi1");
    al.add("Ajay2");
    Iterator<String> itr=al.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
  }
}
