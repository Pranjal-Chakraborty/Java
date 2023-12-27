import java.util.Scanner;

public class menu_driven_calculator {
    public static void main(String[] args) {
        
        System.out.println("Enter two numbers : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Enter the operation you want to perform : ");
        char operator = scan.next().charAt(0);
        scan.close();
        
        switch(operator){
            case '+' :
                int sum = (a + b);
                System.out.println("The addition of "+ a +" and "+ b +" is : "+ sum);
                break;
            case '-' :
                int sub = (a - b);
                System.out.println("The substraction of "+ a +" and "+ b +" is : "+ sub);
                break;
            case '*' :
                int mul = (a * b);
                System.out.println("The multiplication of "+ a +" and "+ b +" is : "+ mul);
                break;
            case '/' :
                int div = (a / b);
                System.out.println("The division of "+ a +" and "+ b +" is : "+ div);
                break;
            case '%' :
                int mod = (a % b);
                System.out.println("The modulo of "+ a +" and "+ b +" is : "+ mod);
                break;
            default :
                System.out.println("Please enter a valid operation.");
                break;
        }
    }
}