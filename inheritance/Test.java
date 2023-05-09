import java.util.Scanner;

public class Test {
    public static void main(String[] args){

    Shape shape1 = new Circle(10,10,10);
    Shape shape2 = new triangle(5,5,5,7,8);

    System.out.println("The Area of Circle "+shape1.CalculateArea());
    System.out.println("The Area of triangle "+shape2.CalculateArea());

    }
}
