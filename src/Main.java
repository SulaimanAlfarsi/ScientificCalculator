import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // absolute function
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        int number2 = input.nextInt();

        if (number1 < 0) {
            number1 = -number1;
        }
        if (number2 < 0) {
            number2 = -number2;
        }

        System.out.println("Result of the First Number: " + number1);
        System.out.println("Result of the Second Number: " + number2);

    }
}