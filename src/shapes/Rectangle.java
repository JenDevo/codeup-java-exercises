package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double getArea(){
       return length * width;
    }

    double getPerimeter(){
       return (2 * length) + (2 * width);
    }
}
