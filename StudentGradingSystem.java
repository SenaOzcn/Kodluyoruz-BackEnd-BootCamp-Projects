public class Student {
    String name, stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemical;
    double avarage;
    boolean isPass;

    Student(String stuNo, String name, int classes, Course math, Course physics, Course chemical) {
        this.stuNo = stuNo;
        this.name = name;
        this.classes = classes;
        this.math = math;
        this.physics = physics;
        this.chemical = chemical;
        calcAvarage();
        this.isPass = false;
    }

    public void addExamNote(int math, int physics, int chemical) {
        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }
        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }
        if (chemical >= 0 && chemical <= 100) {
            this.chemical.note = chemical;
        }
    }

    public void issPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemical.note == 0) {
            System.out.println("grades are not fully entered...");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Avarage : " + this.avarage);
            if (this.isPass) {
                System.out.println("You passed the class!");
            } else {
                System.out.println("You failed the class.");
            }
        }
    }
    public void calcAvarage() {
        this.avarage = (this.math.note + this.physics.note + this.chemical.note) / 3;
    }
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }
    public void printNote() {
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math => " + this.math.note);
        System.out.println("Physics => " + this.physics.note);
        System.out.println("Chemical => " + this.chemical.note);
    }
}

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Your teacher selection has been confirmed!");
        } else {
            System.out.println(t.name + "This teacher cannot teach this lesson. Please choose another teacher.")
        }
    }
    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " is teacher of the lesson : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " no teacher has been assigned to the course.");
        }
    }
}

public class Teacher {
    String name;
    String mpno;
    String branch;
    
    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {

        Course math = new Course("Math", "MATH101", "MATH");
        Course physics = new Course("Physics", "PHYS101", "PHYS");
        Course chemical = new Course("Chemical", "CMS101", "CMS");

        Teacher t1 = new Teacher("Mr Bean", "123456789", "MATH");
        Teacher t2 = new Teacher("Mr Robot", "10101010", "PHYS");
        Teacher t3 = new Teacher("Mr Queen", "111111111", "CMS");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemical.addTeacher(t3);


        Student s1 = new Student("111", "Robin Williams", 1, math, physics, chemical);
        s1.addExamNote(80, 90, 100);
        s1.issPass();

        Student s2 = new Student("112", "Natalie Portman", 1, math, physics, chemical);
        s2.addExamNote(75, 55, 80);
        s2.issPass();

        Student s3 = new Student("113", "Kristen Dunst", 1, math, physics, chemical);
        s3.addExamNote(40, 30, 20);
        s3.issPass();
    }
}
