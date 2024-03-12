package Interface;

public class Circle implements Shapes { // implements is used when interface class is extended
  public static void main(String[] args) {
    Abstraction.Circle c = new Abstraction.Circle();
    c.drawShapes();
    c.moveShapes();
    c.colorShapes();
  }
  @Override
  public void drawShapes() {
    System.out.println("draw circle");
  }

  @Override
  public void colorShapes() {
    System.out.println("color circle");
  }

//  @Override
//  public void moveShapes() {
//    System.out.println("move circle");
//  }
}
