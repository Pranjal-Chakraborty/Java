import java.util.Scanner;

public class FriendsPairng {
    
    public static int pairs(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return pairs(n-1) + (n-1) * pairs(n-2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total number of friends : ");
        int people = scan.nextInt();
        scan.close();
        System.out.println("The total number of pairs that can be made are : " + pairs(people));;
    }
}
