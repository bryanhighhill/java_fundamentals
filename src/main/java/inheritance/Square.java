package inheritance;

import objects.Rectangle;

/*
inheriting from rectangle class in objects package
 */
public class Square extends Rectangle {

    /*
    override rectangle method for perimeter calculation
    by copying over signature and changing body
     */
    @Override
    public double calculatePerimeter() {
        return sides * length;
    }
}
