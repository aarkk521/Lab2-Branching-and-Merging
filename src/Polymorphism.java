public class Polymorphism {
    // TODO TASK 1: Fix the bugs in this code to pass PolymorphismTest.java

    /**
     * Returns the role.
     * @param p the person whose role is to be returned
     * @return the role of the person
     */
    public static String getStudentRole(Person p) {
        return p.getRole;
    }
}

class Person {
    private final String name;

    public String getRole() { return "General"; }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Student extends Person {
    private final String studentId;

    public String getRole() { return "Student"; }

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }
}