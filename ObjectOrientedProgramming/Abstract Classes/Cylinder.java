package lab6task2;
public class Cylinder extends Shape{
    
    private double height;
    private double radius;
    
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    @Override
    public double getVolume() {
        return 2*Math.PI*radius*(radius + height);
    }
    @Override
    public double getSurfaceArea() {
        return height*Math.PI*radius*radius;
    }
    @Override
    public String getShapeType() {
        return "Cylinder";
    }
    public double getHeight() {
        return height;
    }
    public double getRadius() {
        return radius;
    }
    public String toString() {
        return "Shape: " + getShapeType() + " , Volume: " + getVolume() + " , Surface Area: " + getSurfaceArea();
    }
}
