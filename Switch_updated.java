import java.util.Scanner;

public class Switch_updated {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the problem : ");
        int num1 = scan.nextInt();
        char operator = scan.next().charAt(0);
        int num2 = scan.nextInt();
        scan.close();;
        
        String result = switch(operator)
        {
            case '+' -> "The result is : "+ (num1 + num2);
            case '-' -> "The result is : "+ (num1 - num2);
            case '*' -> "The result is : "+ (num1 * num2);
            case '/' -> "The result is : "+ (num1 / num2);
            case '%' -> "The result is : "+ (num1 % num2);
            default -> "Please enter a valid operator";
        };

        System.out.println(result);
    }
}
