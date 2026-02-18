import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);

                System.out.println("Enter number:  ");
                int num=sc.nextInt();


                int result = 1;
                for(int i = num ; i>=1; i--){
                    result = result*i;
                }


                System.out.println("factorial is :  " + result);


            }
        }

