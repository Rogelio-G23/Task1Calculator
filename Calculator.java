import java.util.Scanner;
public class Calculator{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("OPERATORS");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.print("Select: ");
        int choice = scan.nextInt();

        System.out.print("Enter First Number: ");
        num1 = scan.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = scan.nextInt();

        switch (choice){
        }

        System.out.println("Show Result: "+ result);

        scan.close();
    }
}