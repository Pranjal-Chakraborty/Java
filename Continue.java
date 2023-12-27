import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            do {
                System.out.println("Enter your number : ");
                int n = scan.nextInt();
                if (n % 10 == 0) {
                    continue;
                }
                System.out.println("The entered number is : " + n);
            } while (true);
        }
    }
}
