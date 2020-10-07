package pr6;

public class Student implements Comparable<Student>{
    private String name;
    private int idNumber;
    private int GPA;

    public Student(String name, int idNumber, int GPA)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Student student)
    {
        return student.idNumber - idNumber;
    }
}
