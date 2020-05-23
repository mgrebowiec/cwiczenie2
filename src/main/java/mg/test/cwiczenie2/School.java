package mg.test.cwiczenie2;

public class School {
    private final Student[] students;

    private School(Student[] students) {
        this.students = students;
    }

    public static School createSchool(Student[] students) {
        if (students == null) {
            students = new Student[0];
        }

        return new School(students);
    }

    public Student[] getStudents() {
        return students;
    }

    public Student[] getStudentsWithAge(int minimalAge, int maximalAge) {
        int size = 0;
        for (Student student: students) {
            if (student.getAge() >= minimalAge && student.getAge() <= maximalAge) {
                size ++;
            }
        }

        int i = 0;
        Student[] result = new Student[size];
        for (Student student: students) {
            if (student.getAge() >= minimalAge && student.getAge() <= maximalAge) {
                result[i] = student;
                i++;
            }
        }

        return result;
    }
}
