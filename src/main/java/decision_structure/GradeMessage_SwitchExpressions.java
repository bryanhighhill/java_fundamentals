package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {

    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Good job!";
            case "C" -> "You could use a little more studying";
            case "D" -> "Not good";
            case "F" -> "TERRIBLE";
            default -> "Error. Invalid grade";
        };

        //if executing multiple statements example:
        // case "C" {
        //    statements here
        //    yield "Good job!";    end with yield
        // }

        System.out.println(message);
    }
}
