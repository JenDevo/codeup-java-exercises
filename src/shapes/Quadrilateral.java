package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

   protected double length;
   protected double width;


   /* Constructor */
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /* Getter method for Length */
    public double getLength() {
        return length;
    }

    /* Abstract method for setting Length */
    public abstract void setLength(double length);

    /* Getter method for Width */
    public double getWidth() {
        return width;
    }

    /* Abstract method for setting Width */
    public abstract void setWidth(double width);
}
