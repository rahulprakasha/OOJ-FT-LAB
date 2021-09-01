import java.util.*;
import java.lang.Math.*;

abstract class Shape {
  public int a;
  public int b;

  abstract public void printArea();

  Scanner s = new Scanner(System.in);
}

class rectangle extends Shape {
  public void printArea() {
    System.out.print("Please enter length and breadth of rectangle: ");
    float a = s.nextFloat();
    float b = s.nextFloat();
    float area = a * b;
    System.out.println("Area=" + area + "sq.units");
  }
}

class triangle extends Shape {
  public void printArea() {
    System.out.print("Please enter three sides of triangle: ");
    float a = s.nextFloat();
    float b = s.nextFloat();
    float c = s.nextFloat();
    float d = (a + b + c) / 2;
    double area = Math.sqrt(d * (d - a) * (d - b) * (d - c));
    System.out.println("Area=" + area + "sq.units");
  }
}

class circle extends Shape {
  public void printArea() {
    System.out.print("Please enter radius of circle: ");
    float a = s.nextFloat();
    float area = 22 / 7 * a * a;
    System.out.println("Area=" + area + "sq.units");
  }
}

class Shapedemo {
  public static void main(String args[]) {
    Shape r = new rectangle();
    Shape t = new triangle();
    Shape c = new circle();
    for (int i = 0; i < 100; i++) {
      System.out.println("\n1)Triangle\n2)Rectangle\n3)Circle\n");
      System.out.println("Enter your choice: ");
      Scanner s = new Scanner(System.in);
      int ch = s.nextInt();
      switch (ch) {
        case 1:
          t.printArea();
          break;
        case 2:
          r.printArea();
          break;
        case 3:
          c.printArea();
          break;
        default:
          System.out.println("Invalid choice");
      }
    }
  }
}