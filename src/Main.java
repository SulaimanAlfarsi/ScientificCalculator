import java.util.Scanner;

public class Main {
    // Method to calculate square
    public static int generateSquare ( int number) {
        return number * number;
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:  ");
        int num = sc.nextInt();


        int result1 = 1;
        for (int i = num; i >= 1; i--) {
            result1 = result1 * i;
        }


        System.out.println("factorial is :  " + result1);



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

        scanner.close();




        }

    }





