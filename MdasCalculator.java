import java.util.Scanner;

public class MdasCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int result = 0;
        char operator;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        
        System.out.print("Choose your operator (+, - , *, /): ");
        operator = sc.next().charAt(0);
        
        switch(operator){
            case '*' -> result = Multiplication(num1, num2);
            case '/' -> result = Division(num1,num2);
        }
        System.out.println("Result: " + result);
        sc.close();
    }

    public static int Multiplication(int num1, int num2){
        return num1 * num2;
    }
    pulic static int Division(int num1, int num2){
        if(num2 == 0){
            System.out.println("Cannot divide by zero");
        }
        return num1/num2;
    }
    
}
