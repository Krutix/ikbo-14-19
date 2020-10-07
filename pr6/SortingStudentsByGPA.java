package pr6;

public class SortingStudentsByGPA extends Student {
    public SortingStudentsByGPA(String name, int idNumber, int GPA) {
        super(name, idNumber, GPA);
    }

    @Override
    public int compareTo(Student student) {
        return student.getGPA() - this.getGPA();
    }
}
