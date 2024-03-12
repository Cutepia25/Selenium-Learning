package accessModifier2;

//import accessModifier1.ClassA;

import accessModifier1.ClassA;
import accessModifier1.ClassAA;
//import accessModifier1.ClassAA;

public class ClassB extends ClassA {
  public static void main(String[] args) {
    ClassA cl = new ClassA();
    cl.publicMethod();
    ClassAA cl1= new ClassAA();
    cl1.privateMethod1();
    ClassB cl2 = new ClassB();
    cl2.protectedMethod();//protected method can be used in diff packasge if the class is a sub class[inhertnce]
  }
}
