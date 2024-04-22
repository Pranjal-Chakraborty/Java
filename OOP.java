public class OOP {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColour("Blue");
        System.out.println("The colour of the pen is : " + p1.getColour());
        p1.setTip(5);
        System.out.println("The size of the tip is : " + p1.getTip());

        p1.setColour("Green");
        System.out.println("The new colour of the pen is :" + p1.getColour());
    }
}

class Pen {
    private String colour;
    private int tip;

    String getColour(){
        return this.colour;
    }

    int getTip(){
        return this.tip;
    }

    void setColour(String color){
        this.colour = color;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }    
}