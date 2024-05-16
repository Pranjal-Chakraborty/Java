class Constructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1 + "\nThere is no records available for student 1.");
        Student s2 = new Student("David");
        System.out.println("The name of student 2 is : " + s2.name);
        Student s3 = new Student(426);
        System.out.println("The roll of student 3 is : " + s3.roll);
        Student s4 = new Student("Jack",27);
        System.out.println("The name of student 4 is : " + s4.name + " and the roll no. is : " + s4.roll);    
    }

    static class Student{
        String name;
        int roll;
        
        // Non-Parameterized Constructor
        Student (){
            System.out.println("Constructor is called.");
        }
        // Parameterized Constructor
        Student (String name){
            this.name = name;
        }
        // Parameterized Constructor
        Student (int roll){
            this.roll = roll;
        }
        // Parameterized Constructor
        Student (String name, int roll){
            this.name = name;
            this.roll = roll;
        }
        // The above is also an example of constructor overloading
    }
}