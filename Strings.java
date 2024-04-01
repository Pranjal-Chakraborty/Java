public class Strings {
    
    public static void printletters(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main (String[] args){
        String firstname = "Pranjal";
        String lastname = "Chakraborty";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        System.out.println("The hashcode for first name is : " + firstname.hashCode());
        System.out.println("The hashcode for last name is : " + lastname.hashCode());
        System.out.println("The hashcode for full name is : " + firstname.hashCode());
        printletters(fullname);
    }
}
