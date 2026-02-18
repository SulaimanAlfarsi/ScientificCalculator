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

        int result = generateSquare(input);

        System.out.println("Square: " + result);

        double powerFun = 0;

        System.out.println("please enter two numbers: ");
        double firstNumber = scanner.nextInt();
        double secondNumber = scanner.nextInt();

        powerFun = Math.pow(firstNumber,secondNumber);
        System.out.printf("The power of %.0f and %.0f is %.2f%n", firstNumber, secondNumber, powerFun);

        scanner.close();
    }
}
