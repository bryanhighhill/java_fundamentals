package loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        //do while loop - something to run at least once, run again based on a condition
        do{
            System.out.println("Enter your first number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter your second number");
            double num2 = scanner.nextDouble();

            System.out.println("Sum: " + (num1 + num2));

            System.out.println("Would you like to run again? false for no, true for yes");
            again = scanner.nextBoolean();
        }while(again);
    }
}
