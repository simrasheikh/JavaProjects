package lab6task2;
public abstract class Shape {
    
    private static int numShapes;
    private int id;
    
    public Shape() {
        
    }
    public int getNumShapes() {
        return numShapes;
    }
    public int getId() {
        return id;
    }
    
    public String toString() {
        return "Number of Shapes: " + getNumShapes() + "\nID: " + id;
    }
    public abstract double getVolume();
    public abstract double getSurfaceArea();
    public abstract String getShapeType();
}
