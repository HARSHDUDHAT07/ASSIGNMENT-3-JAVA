/*   Id   : 21CE026 
     Name : HARSH RAJESHBHAI DUDHAT
     Aim  : Create an abstract class GeometricObject as the superclass for Circle and Rectangle. GeometricObject models common features of geometric objects. Both Circle and Rectangle contain the getArea() and getPerimeter() methods for computing the area and perimeter of a circle and a rectangle. Since you can compute areas and perimeters for all geometric objects, so define the getArea() and getPerimeter() methods in the 
GeometricObject class. Give implementation in the specific type of geometric object. Create TestGeometricObject class to */ 
interface Prac_2_Interface {
    public int x = 7;

    void display1();

    default void show1() {
        System.out.println("This is default in interface");
    }
}

interface Iscanner {
    public int y = 7;

    void display2();

    default void show2() {
        System.out.println("This is default in interface");
    }
}

class Concrete implements Prac_2_Interface, Iscanner {
    public void display1() {

        System.out.println("Display1");
    }

    public void display2() {
        System.out.println("Display2");
    }

}
