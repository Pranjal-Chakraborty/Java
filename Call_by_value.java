//This code shows that java always uses call by value method while calling of a function.

import java.util.Scanner;

public class Call_by_value {

    public static void square(int n){
        
        n *= n;
        System.out.println("The output inside the square function is : " + n);
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        scan.close();
        
        System.out.println("Before calling the function the number is : " + num);
        
        square(num);

        System.out.println("After calling of the square function the value of the number is : "+ num);
    }
}
