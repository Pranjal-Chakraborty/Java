import java.util.Scanner;

public class String_compress {
    public static String compressString(String str){
        StringBuilder newstr = new StringBuilder("");
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if(count > 1){
                newstr.append(count.toString());
            }
        }
        return newstr.toString();
    }
    public static void main(String[] args) {
        String str = new String();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        str = scan.next();
        scan.close();
        System.out.println("The compressed string will be : " + compressString(str));
    }
}
