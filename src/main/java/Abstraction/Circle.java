package Abstraction;

public class Circle extends Shapes{
  public static void main(String[] args) {
    Circle c = new Circle();
    c.drawShapes();
    c.moveShapes();
    c.colorShapes();
  }

  @Override
  public void drawShapes() {
System.out.println("draw circle");
  }

  @Override
  public void moveShapes() {
    System.out.println("move circle");
  }

//  @Override
//  public void colorShapes() {
//    System.out.println("color circle");
//  }
}