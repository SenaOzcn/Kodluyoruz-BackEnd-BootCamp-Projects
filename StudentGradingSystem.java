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
