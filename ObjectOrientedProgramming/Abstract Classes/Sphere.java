package lab6task2;
public class Sphere extends Shape {
    private double radius;
    
    public Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    public double getSurfaceArea() {
        return 4*Math.PI*radius*radius;
    }
    @Override
    public double getVolume() {
        return 4*(Math.PI*radius*radius*radius)/3;
    }
    @Override
    public String getShapeType() {
        return "Sphere";
    }
    public double getRadius() {
        return radius;
    }
    public String toString() {
        return "Shape: " + getShapeType() + " , Volume: " + getVolume() + " , Surface Area: " + getSurfaceArea();
    }
}
