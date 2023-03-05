import java.util.Iterator;
import java.util.ArrayList;

public class Lab6Task2 {
    public static void main(String[] args) {
        ArrayList<Shape> s = new ArrayList<Shape>();
        s.add(new Sphere(2.0));
        s.add(new Cuboid(2.0, 2.0, 2.0));
        s.add(new Cube(3.0));
        s.add(new Cylinder(3.0, 4.5));
        
        Iterator iter = s.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println();
        }
    }
}
