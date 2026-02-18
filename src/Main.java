import java.util.Scanner;

public class Main {
    // Method to calculate square
    public static int generateSquare ( int number) {
        return number * number;
    }



    public static void main(String[] args) {





        
        // factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:  ");
        int num = sc.nextInt();


        int result1 = 1;
        for (int i = num; i >= 1; i--) {
            result1 = result1 * i;
        }
        System.out.println("factorial is :  " + result1);






        // even\odd identifier
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        // even\odd identifier
        if (input % 2 == 0) {
            System.out.println("Result: Even");
        } else {
            System.out.println("Result: Odd");
        }




        // Squar
        int result = generateSquare(input);
        System.out.println("Square: " + result);


        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input2 = scanner1.nextInt();
        int result2 = generateSquare(input2);
        System.out.println("Square: " + result2);



        // power
        double powerFun = 0;

        System.out.println("please enter two numbers: ");
        double firstNumber = scanner1.nextInt();
        double secondNumber = scanner1.nextInt();

        powerFun = Math.pow(firstNumber, secondNumber);
        System.out.printf("The power of %.0f and %.0f is %.2f%n", firstNumber, secondNumber, powerFun);

        scanner1.close();




    }

    }







