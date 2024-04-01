import java.util.Scanner;

public class Displacement {
    public static float calculate_displacement(String str){
        int x = 0, y = 0;
        for(int i = 0; i < str.length(); i++){
            char dir = str.charAt(i);
            //North
            if(dir == 'N'){
                y++;
            }
            //South
            else if(dir == 'S'){
                y--;
            }
            //East
            else if(dir == 'E'){
                x++;
            }
            //West
            else if(dir == 'W'){
                x--;
            }
        }
        int sqx = x*x;
        int sqy = y*y;
        return (float)Math.sqrt(sqx + sqy);
    }
    public static void main(String[] args) {
        String path = new String();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the directions in N (North), S (South), E (East), W (West) format : ");   
        path = scan.next();
        scan.close();
        float result = calculate_displacement(path);
        System.out.println("The Displacement value is : " + result);
    }
}
