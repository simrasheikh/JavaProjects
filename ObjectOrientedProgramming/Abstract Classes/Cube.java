package lab6task2;
public class Cube extends Cuboid{
    
    public Cube(double edge) {
        super(edge,edge,edge);
    }
    @Override
    public String getShapeType() {
        return "Cube";
    }
    public String toString() {
        return "Shape: " + getShapeType() + " , Volume: " + getVolume() + " , Surface Area: " + getSurfaceArea();
    }
}
