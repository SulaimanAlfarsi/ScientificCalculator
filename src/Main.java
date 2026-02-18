import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double powerFun = 0;

        System.out.println("please enter two numbers: ");
        double firstNumber = scanner.nextInt();
        double secondNumber = scanner.nextInt();

        powerFun = Math.pow(firstNumber,secondNumber);
        System.out.printf("The power of %.0f and %.0f is %.2f%n", firstNumber, secondNumber, powerFun);

    }

}