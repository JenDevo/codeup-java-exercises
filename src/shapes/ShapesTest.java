package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5, 11);
        System.out.println("Rectangle");
        System.out.println("The Area of your rectangle is: " + myShape.getArea());
        System.out.println("The Perimeter of your rectangle is: " + myShape.getPerimeter() + "\n");


        Measurable myShape2 = new Square(3);
        System.out.println("Square");
        System.out.println("The Area of your square is: " + myShape2.getArea());
        System.out.println("The Perimeter of your square is: " + myShape2.getPerimeter());







        /* From inheritance and polymorphism exercises */
//       Rectangle box1 = new Rectangle(4, 5);
//
//       System.out.println(box1.getPerimeter());
//       System.out.println(box1.getArea());
//
//        Square box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

    }
}
