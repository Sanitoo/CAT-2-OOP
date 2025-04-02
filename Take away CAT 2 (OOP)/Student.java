class Student {
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for grade (with validation)
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0;
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student("Hassan", 65);

        // Printing details
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Grade: " + student1.getGrade());

        // Trying to set an invalid grade
        student1.setGrade(120);
        System.out.println("Updated Student Grade (invalid input test): " + student1.getGrade());
    }
}
