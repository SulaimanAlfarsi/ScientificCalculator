import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        // even\odd identifier
        if (n % 2 == 0){
            System.out.println("Result: Even");
        }
        else{
            System.out.println("Result: Odd");
        }
    }
}