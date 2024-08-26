import java.util.Scanner;

public class DuplicateLetter {
    
    public static void removeDuplicate(String str, int index, StringBuilder newStr, boolean map[]){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(index);
        if(map[currentChar - 'a'] == true){
            removeDuplicate(str, index + 1, newStr, map);
        }
        else{
            map[currentChar - 'a'] = true;
            removeDuplicate(str, index + 1, newStr.append(currentChar), map);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word containing duplicate characters in small letters : ");
        String word = scan.nextLine();
        scan.close();
        boolean arr[] = new boolean[26];
        StringBuilder sb = new StringBuilder("");
        removeDuplicate(word, 0, sb, arr);
        System.out.println("The refined word without duplicate charactes is : " + sb);
    }
}
