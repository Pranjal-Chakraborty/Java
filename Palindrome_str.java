import java.util.*;

public class Palindrome_str {
    public static boolean check_palindrome(String str){
        int n = str.length();
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String string = new String();
        Scanner scan = new Scanner(System.in);
        string = scan.next();
        scan.close();
        boolean result = check_palindrome(string);
        if(result == true){
            System.out.println("The given string is a plaindrome.");
        }
        else{
            System.out.println("The given string is not a palindrome.");
        }
    }
}
