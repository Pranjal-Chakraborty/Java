public class Copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "David";
        s1.roll = 15;
        s1.stud_id = "aknu";

        Student s2 = new Student(s1);
        s2.stud_id = "akji";

        System.out.println("Student 1 :-\nName : " + s1.name + "\nRoll : " + s1.roll + "\nStudent id : " + s1.stud_id);
        System.out.println("Student 2 :-\nName : " + s2.name + "\nRoll : " + s2.roll + "\nStudent id : " + s2.stud_id);
    }
    static class Student{
        String name;
        int roll;
        String stud_id;

        Student(){}
        Student (Student s1){
            this.name = s1.name;
            this.roll = s1.roll;
        }
    }
}
