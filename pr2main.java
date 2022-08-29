
/*   Id   : 21CE026 
     Name : HARSH RAJESHBHAI DUDHAT
     Aim  : Create an abstract class GeometricObject as the superclass for Circle and Rectangle. GeometricObject models common features of geometric objects. Both Circle and Rectangle contain the getArea() and getPerimeter() methods for computing the area and perimeter of a circle and a rectangle. Since you can compute areas and perimeters for all geometric objects, so define the getArea() and getPerimeter() methods in the 
GeometricObject class. Give implementation in the specific type of geometric object. Create TestGeometricObject class to*/
import java.util.Vector;

public class pr2main {
    public static void main(String[] args) {
        Vector<Concrete> obj = new Vector<Concrete>(5);
        Concrete c[] = new Concrete[5];
        for (int i = 0; i < 5; i++) {
            c[i] = new Concrete();
        }
        for (int i = 0; i < 5; i++) {
            obj.add(c[i]);
        }
        for (int i = 0; i < 5; i++) {
            obj.elementAt(i).show1();
            obj.elementAt(i).show2();
            obj.elementAt(i).display1();
            obj.elementAt(i).display2();
        }
    }
}
