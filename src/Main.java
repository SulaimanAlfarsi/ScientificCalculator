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

        scanner.close();
    }
}
