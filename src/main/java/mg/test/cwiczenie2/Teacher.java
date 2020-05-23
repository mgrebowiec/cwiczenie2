package mg.test.cwiczenie2;

public class Teacher {
    private final Student[] students;

    public Teacher(Student[] students) {
        this.students = students;
    }

    public Teacher addStudent(Student student) {
        if (student == null) {
            return this;
        }

        int size = 1;
        if (students != null) {
            size += students.length;
        }

        Student[] result = new Student[size];
        int index = 0;
        if (students != null) {
            for (Student oldStudent: students) {
                result[index] = oldStudent;
                index++;
            }
        }

        result[index] = student;
        return new Teacher(result);
    }
}
