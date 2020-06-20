package InherShape;

public class Shape {
    private double area;
    private Integer numberOfCorners;

    public Shape(double area, Integer numberOfCorners) {
        this.area = area;
        this.numberOfCorners = numberOfCorners;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Integer getNumberOfCorners() {
        return numberOfCorners;
    }

    public void setNumberOfCorners(Integer numberOfCorners) {
        this.numberOfCorners = numberOfCorners;
    }
}
