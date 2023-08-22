class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "NewSchool";
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        Student.school = "SSMV";
        Student student1 = new Student();
        student1.name = "Buddy";
        System.out.println(student1.school);
    }
}
