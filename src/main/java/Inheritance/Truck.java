package Inheritance;

public class Truck extends VehicleCommon {

  public static void main(String[] args) {
    Truck tk = new Truck();
    tk.start();
    tk.stop();//single inheritance

  }
  public void loadCapacity()
  {
    System.out.println("capacity of truck is good");
  }
}
