import java.util.Scanner;


public class Main {

    public static void main(String[] args) {



        // absolute function Ibrahim
        Scanner input = new Scanner(System.in);
        System.out.println("\n< Absolute function >");
        System.out.println("Please enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        int number2 = input.nextInt();
        int abnumber1 = 0;
        int abnumber2 = 0;

        if (number1 < 0) {
            abnumber1 = -number1;
        }
        if (number2 < 0) {
            abnumber2 = -number2;
        }

        System.out.printf("Absolute result of %d is %d\n", number1, abnumber1);
        System.out.printf("Absolute result of %d is %d\n" , number2, abnumber2);



        // factorial Abdullah
        Scanner sc = new Scanner(System.in);
        System.out.println("\n< Factorial Function >");
        System.out.println("Enter a number:  ");
        int num = sc.nextInt();
        int result1 = 1;
        for (int i = num; i >= 1; i--) {
            result1 = result1 * i;
        }
        System.out.printf("Factorial result for a number %d is : %d\n", num, result1);




        // even\odd identifier Yarub
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n< Even & Odd Function >");
        System.out.print("Enter a number: ");
        int input2 = scanner.nextInt();
        if (input2 % 2 == 0) {
            System.out.printf("Number %d is: Even",input2);
        } else {
            System.out.printf("Number %d is: Even\n",input2);
        }

        // Sulaiman
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("\n< Square Function >");
        System.out.print("Enter a number: ");
        int input1 = scanner1.nextInt();
        int result2 =(input1*input1);
        System.out.printf("Square result for a number %d is: %d\n",input1,result2);



        // Power Function Abdullmajeed
        double powerFun = 0;
        System.out.println("\n< Power Function >");
        System.out.println("please enter two numbers: ");
        double firstNumber = scanner1.nextInt();
        double secondNumber = scanner1.nextInt();
        powerFun = Math.pow(firstNumber, secondNumber);
        System.out.printf("%.0f is base and %.0f is exponent and the result is %.2f", firstNumber, secondNumber, powerFun);
        scanner1.close();




    }

    }






