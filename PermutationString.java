import java.util.Scanner;

public class PermutationString {
        public static void findPermutation(String str, String ans){
        //Base case
        if(str.length() == 0){
            System.out.print(ans + "  ");
            return;
        }
        //Recursion
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(newStr, ans + curr);
        }
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scan.nextLine();
        scan.close();
        System.out.println("The substrings of the provided string are : ");
        //String ans = new String();
        String ans = new String();
        findPermutation(str, ans);
    }
}
