package inheritance;

import objects.Rectangle;

public class InheritanceTester {

    public static void main(String[] args) {
        //Person person = new Person();
//        Employee employee = new Employee();

        Square square = new Square();
        square.setLength(25);
        System.out.println(square.calculatePerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.print(); //one print method available

        square.print("square"); //two print methods available
    }
}
