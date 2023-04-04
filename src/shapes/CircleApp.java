package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter a circle radius ");
        double radius = input.getDouble();
        Circle circle = new Circle(radius);

        double circumference = circle.getCircumference();
        double area = circle.getArea();
        System.out.printf("Circumference = %f | Area = %f\n", circumference, area);
    }
}
