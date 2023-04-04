package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(6, 12);
        System.out.println("The Area of your rectangle is: " + myShape.getArea());
        System.out.println("The Perimeter of your rectangle is: " + myShape.getPerimeter());








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
