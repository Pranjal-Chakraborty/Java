public class Break {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++){
            if(i == 4){
                System.out.println("You are out of the loop.");
                break;
            }
            System.out.println(i);
        }
    }
}
