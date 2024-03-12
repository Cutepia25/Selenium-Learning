package Encapsulation;

public class common {

  private int length;
  public int width;
  private int height;

  public void setBoxDimension(int l, int b, int h) {
    if (l > 1 && b > 1 && h > 1) {
      System.out.println("Box created with dimension " + l + ", " + b + " " + h + " ");
    } else {
      System.out.println("Invalid values for box");
    }
  }

  public int setLlength(int l) {
    if(l>1) {
      length = l;
    }
    else {
      System.out.println("Invalid Length");
    }
    return length;
  }
  public int setwidth(int w) {
    width = w;
    return width;
  }

  public int setheight(int h) {
    height = h;
    return height;
  }

  public int getLength() {
    return length;
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }
}
