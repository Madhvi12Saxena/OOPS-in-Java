class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Non Parameterized constructor
    // Student() {         
    //     System.out.println("Constructor called");
    // }

    // Parameterized constructor
    // Student( String name, int age) {         
    //     this.name = name;
    //     this.age = age;
    // }

    // Copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student () {
        
    }
}

public class oops {
    public static void main(String args[]) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ballpoint";

        // pen1.printColor();
        // pen2.printColor();

        // Student s1 = new Student("Madhvi", 18);
        Student s1 = new Student();
        s1.name = "Madhvi";
        s1.age = 18;

        Student s2 = new Student(s1);
        s2.printInfo();

        // s1.printInfo();
    }
}