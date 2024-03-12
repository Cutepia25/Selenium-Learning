package Interface;

interface Shapes {

  public void drawShapes();

  public void colorShapes();

//  public void moveShapes();
}

class cycle implements Shapes {

 public void drawShapes() {
    System.out.println("Shape1");
  }

   public void  colorShapes() {
    System.out.println("cOLOOR1");
  }
}


