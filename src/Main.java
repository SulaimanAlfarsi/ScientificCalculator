import java.util.Scanner;


public class Main {
    public static void main(String[] args) {



        // absolute function Ibrahim
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




        // even\odd identifier Yarub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input2 = scanner.nextInt();

        if (input2 % 2 == 0) {
            System.out.println("Result: Even");
        } else {
            System.out.println("Result: Odd");
        }


        // Sulaiman
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input1 = scanner1.nextInt();
        int result1 =(input1*input1);
        System.out.println("Square: " + result1);

        // Power function
        double powerFun = 0;
        System.out.println("please enter two numbers: ");
        double firstNumber = scanner1.nextInt();
        double secondNumber = scanner1.nextInt();
        powerFun = Math.pow(firstNumber, secondNumber);
        System.out.printf("The power of %.0f and %.0f is %.2f%n", firstNumber, secondNumber, powerFun);

        scanner1.close();
    }
}

