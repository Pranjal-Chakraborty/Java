public class Primitive {
    public static void main(String[] args) {

        byte b = 8; // Range = -128 to 127 , Size = 1 bytes or 8 bits 

        short s = 32000; // Range = -32768 to 32767 , Size = 2 bytes or 16 bits 
        
        char ch = '@'; // Range = Any single character , Size = 2 bytes or 16 bits 
        
        boolean bool = true; // Range = 0 or 1 , Size = 1 bytes or 8 bits 
        
        int i = 246546564; // Range = -2 billion to +2 billion approx , Size = 4 bytes or 32 bits 
        
        long l = 254864656; // Range = bigger than int , Size = 8 bytes or 64 bits 
        
        float f = 1.2f; // Range = small magnitute decimal values , Size = 4 bytes or 32 bits 
        
        double d = 5.64854646; // Range = bigger than float , Size = 8 bytes or 64 bits 

        System.out.println(b);
        System.out.println(s);
        System.out.println(ch);
        System.out.println(bool);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
