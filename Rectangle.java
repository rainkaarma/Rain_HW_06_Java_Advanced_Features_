package InherShape;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle (double area, Integer numberofCorners, double sideA, double sideB) {
        super(area= sideA*sideB, 4);
    }

}
