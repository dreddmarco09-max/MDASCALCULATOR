import java.util.Scanner;

public class MdasCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        
        System.out.print("Enter operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        sc.close();
    }


}
