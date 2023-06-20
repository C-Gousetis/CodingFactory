package gr.aueb.cf.ch16.functionalInterfaces;

public class StudentApp {

    public static void main(String[] args) {

        Student[] students;
        students = new Student[] {
                new Student(1, "Alice", "W."),
                new Student(2, "Bob", "D."),
                new Student(3, "Chris", "A."),
                new Student(4, "Jim", "K.")
        };

        printStudents(students, new IdChecker() {
            @Override
            public boolean checkId(Student student) {
                return student.getId() >= 3;
            }
        });


        printStudents(students, (student -> {return student.getId() <=2;}));

        //same thing
//         printStudents(students, (student -> student.getId() <=2));
    }

    public static void printStudents(Student[] students, IdChecker checker) {
        for (Student student : students ) {
            if (checker.checkId(student)) {
                System.out.println(student);
            }
        }
    }
}
