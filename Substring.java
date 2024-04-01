public class Substring { 
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(3,6));
    }
    /* If we want to do the same using our own method the code will be.

    public static void substr(String str, int startindex, int endindex){
        for(int i = startindex; i < endindex ; i++){
            System.out.print(str.charAt(i));
        }
    }
    
    public static void main(String[] args) {
        String str = "HelloWorld";
        substr(str,3,6));
    }
    */ 
}
