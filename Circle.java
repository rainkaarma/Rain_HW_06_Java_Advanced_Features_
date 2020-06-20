package InherShape;

public class Circle extends Shape{
    private double radius;

    public Circle (double area, Integer numberOfCorners, double radius){
        super(area= Math.PI*radius*radius, 0);
    }
}
