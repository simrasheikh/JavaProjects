package lab6task2;
public class Cuboid extends Shape{
    
    private double length;
    private double breadth;
    private double height;
    
    public Cuboid(double length, double breadth, double height) {
        this.breadth = breadth;
        this.length = length;
        this.height = height;
    }
    @Override
    public double getSurfaceArea() {
        return 2*(length*length*height*height*breadth*breadth);
    }
    @Override
    public double getVolume() {
        return length*height*breadth;
    }
    @Override
    public String getShapeType() {
        return "cuboid";
    }
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }
    public double getHeight() {
        return height;
    }
    public String toString() {
        return "Shape: " + getShapeType() + " , Volume: " + getVolume() + " , Surface Area: " + getSurfaceArea();
    }
}
