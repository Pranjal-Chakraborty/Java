public class Mutable_string {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuilder sb2 = new StringBuilder("world");
        System.out.println(sb1);
        System.out.println(sb2);
        sb1.deleteCharAt(0);
        sb2.deleteCharAt(0);
        sb1.insert(0, "H");
        sb2.insert(0, "W");
        String str = " ";
        sb1.toString();
        sb2.toString();
        String newstr = sb1 + str + sb2;
        System.out.println(newstr);
    }
}
