package Abstraction;

public abstract class Shapes { // for abstract methods class should also be abstract

  public abstract void drawShapes();//abstract methods dont have body at all

  public void colorShapes() {// non abstract methods have body
    System.out.println("colorshape");
  }

  public abstract  void  moveShapes();

}
