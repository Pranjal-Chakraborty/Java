import java.util.Scanner;

public class BinaryStrings {
    
    public static void binaryString(int limit, int lastEle, String str){
        if(limit == 0){
            System.out.println(str);
            return;
        }
        binaryString(limit-1, 0 , str + "0");
        if(lastEle == 0){
            binaryString(limit-1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the strings : ");
        int length = scan.nextInt();
        scan.close();
        System.out.println("The binary strings of length " + length + " without containing consequetive 1's are : ");
        binaryString(length, 0, "");
    }
}
