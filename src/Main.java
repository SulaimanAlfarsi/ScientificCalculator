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



        // factorial Abdullah
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:  ");
        int num = sc.nextInt();


        int result1 = 1;
        for (int i = num; i >= 1; i--) {
            result1 = result1 * i;
        }
        System.out.println("factorial is :  " + result1);




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
        int result2 =(input1*input1);
        System.out.println("Square: " + result2);



        // Power Function Abdullmajeed
        double powerFun = 0;
        System.out.println("please enter two numbers: ");
        double firstNumber = scanner1.nextInt();
        double secondNumber = scanner1.nextInt();
        powerFun = Math.pow(firstNumber, secondNumber);
        System.out.printf("%.0f is base and %.0f is exponent and the result is %.2f", firstNumber, secondNumber, powerFun);

        scanner1.close();




    }

    }






