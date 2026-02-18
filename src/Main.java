import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        // even\odd identifier
        if (input % 2 == 0){
            System.out.println("Result: Even");
        }
        else{
            System.out.println("Result: Odd");
        }

        int result = generateSquare(input);
        System.out.println("Square: " + result);

        scanner.close();

    
    }
    // Method to calculate square
    public static int generateSquare(int number) {
        return number * number;
    }
}
