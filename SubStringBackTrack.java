import java.util.Scanner;

public class SubStringBackTrack {
    /* Solution using String
    public static void findSubstr(String str, int i, String ans){
        //Base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("NULL");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        findSubstr(str, i+1, ans + str.charAt(i)); // If the choice is yes
        findSubstr(str, i+1, ans); //If the choice is no
    } 
    */
    // Solution using reusable String builder
    public static void findSubstr(String str, int i, StringBuilder ans){
        //Base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("NULL");
            }
            else{
                System.out.print(ans + "  ");
            }
            return;
        }
        // Append character for the "yes" choice
        ans.append(str.charAt(i));
        findSubstr(str, i + 1, ans); // If the choice is yes
        // Remove the last character to backtrack
        ans.deleteCharAt(ans.length() - 1);
        findSubstr(str, i + 1, ans); // If the choice is no
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scan.nextLine();
        scan.close();
        System.out.println("The substrings of the provided string are : ");
        //String ans = new String();
        StringBuilder ans = new StringBuilder();
        findSubstr(str, 0, ans);
    }
}
