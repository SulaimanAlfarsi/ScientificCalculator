import java.util.Scanner;

public class Main {
    // Method to calculate square
    public static int generateSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        // even\odd identifier
        if (input % 2 == 0) {
            System.out.println("Result: Even");
        } else {
            System.out.println("Result: Odd");
        }

        int result = generateSquare(input);
        System.out.println("Square: " + result);


        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input1 = scanner1.nextInt();

        int result1 = generateSquare(input1);

        System.out.println("Square: " + result1);

        double powerFun = 0;

        System.out.println("please enter two numbers: ");
        double firstNumber = scanner1.nextInt();
        double secondNumber = scanner1.nextInt();

        powerFun = Math.pow(firstNumber, secondNumber);
        System.out.printf("The power of %.0f and %.0f is %.2f%n", firstNumber, secondNumber, powerFun);

        scanner1.close();
    }
}


