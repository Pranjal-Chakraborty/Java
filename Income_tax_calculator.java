import java.util.Scanner;

public class Income_tax_calculator {
        public static void main(String[] args) {
        
        System.out.println("Enter your income : ");
        Scanner scan = new Scanner(System.in);
        long income = scan.nextLong();
        scan.close();
        
        double tax = 0;

        if(income < 500000){
            tax = (income * 0);
            System.out.println("Your tax is : " + tax);
        }
        else if(income >= 500000 && income < 1000000){
            tax = (income * 0.2);
            System.out.println("Your tax is : " + tax);
        }
        else{
            tax = (income * 0.3);
            System.out.println("Your tax is : " + tax);
        }
    }
}
