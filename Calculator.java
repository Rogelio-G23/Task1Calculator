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
            case 1 -> result = addition(num1, num2);
        }

        System.out.println("Show Result: "+ result);

        scan.close();
    }
    public static int addition (int num1, int num2){
        return num1 + num2;
    }
}