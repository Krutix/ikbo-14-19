package pr9.Students;

import pr6.SortingStudentsByGPA;
import pr6.Student;
import pr6.Test;

public class LabClass {
    private Student[] students;
    LabClass() {
        students = new Student[10];
        students[0] = new SortingStudentsByGPA("Tobio Kageyama", 9, 7);
        students[1] = new SortingStudentsByGPA("Shoyo Hinata", 10, 15);
        students[2] = new SortingStudentsByGPA("Kenma Kozume", 5, 95);
        students[3] = new SortingStudentsByGPA("Toru Oikawa", 1, 69);
        students[4] = new SortingStudentsByGPA("Hajime Iwaizumi", 4, 75);
        students[5] = new SortingStudentsByGPA("Yu Nishinoya", 4, 40);
        students[6] = new SortingStudentsByGPA("Atsumu Miya", 7, 70);
        students[7] = new SortingStudentsByGPA("Tanaka Ryūnosuke", 5, 34);
        students[8] = new SortingStudentsByGPA("Koshi Sugawara", 2, 86);
        students[9] = new SortingStudentsByGPA("Tadashi Yamaguchi", 12, 85);
    }

    public String sort(){
        Test.insertSort(students);
        StringBuilder str = new StringBuilder();
        for (Student s : students)
            str.append(s.toString()).append('\n');
        return str.toString();
    }

    public String find(String name) throws StudentNotFoundException {
        for (Student s : students)
            if (s.getName().compareTo(name) == 0)
                return (s.toString());
        throw new StudentNotFoundException(name + " not found");
    }
}
