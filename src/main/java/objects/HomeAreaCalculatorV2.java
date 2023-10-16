package objects;

import java.util.Scanner;

public class HomeAreaCalculatorV2 {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorV2 calculator = new HomeAreaCalculatorV2();
        Rectangle room1 = calculator.getRoom();
        Rectangle room2 = calculator.getRoom();
        double totalArea = calculator.calculateAreaOfRoom(room1, room2);
        System.out.println("area of both rooms: " + totalArea);
    }

    public Rectangle getRoom() {
        System.out.println("enter the length of the room");
        double length = scanner.nextDouble();
        System.out.println("enter the width of the room");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateAreaOfRoom(Rectangle room1, Rectangle room2){
        return room1.calculateArea() + room2.calculateArea();
    }
}
