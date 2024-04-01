public class Comparison_strings {
    public static void main(String[] args) {
        String s1 = "Robin";
        String s2 = "Robin";
        String s3 = new String("Robin");
        System.out.println("Trial comparison with '=' operator : ");
        if(s1 == s2){
            System.out.println("s1 and s2 Strings are equal.");
        }
        else{
            System.out.println("s1 and s2 strings are not equal.");
        }
        if(s1 == s3){
            System.out.println("s1 and s3 strings are equal.");
        }
        else{
            System.out.println("s1 and s3 strings are not equal.");
        }
        System.out.println("Proper comparison of the strings stored inside the variables : ");
        if(s1.equals(s2)){
            System.out.println("s1 and s2 Strings are equal.");
        }
        else{
            System.out.println("s1 and s2 strings are not equal.");
        }
        if(s1.equals(s3)){
            System.out.println("s1 and s3 strings are equal.");
        }
        else{
            System.out.println("s1 and s3 strings are not equal.");
        }
    }
}
