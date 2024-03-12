package Encapsulation;

public class createBox {

  public static void main(String[] args) {

    common cm = new common();
   int h=  cm.setheight(10);
   int b = cm.setwidth(20);
    int l =cm.setLlength(30);
    cm.setBoxDimension( l, b, h);
    System.out.println(cm.getLength());


  }
}
