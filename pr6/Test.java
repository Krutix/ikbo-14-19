package pr6;

public class Test {
    public static void main(String[] argv)
    {
        Student students[] = new Student[7];
        students[0] = new Student("Tobio Kageyama", 9, 7);
        students[1] = new Student("Shoyo Hinata", 10, 15);
        students[2] = new Student("Kenma Kozume", 5, 95);
        students[3] = new Student("Toru Oikawa", 1, 69);
        students[4] = new Student("Hajime Iwaizumi", 4, 75);
        students[5] = new Student("Yu Nishinoya", 4, 40);
        students[6] = new Student("Atsumu Miya", 7, 70);

        insertSort(students);
        printStudents(students);

        Student studentsGPA[] = new SortingStudentsByGPA[7];
        studentsGPA[0] = new SortingStudentsByGPA("Tobio Kageyama", 9, 7);
        studentsGPA[1] = new SortingStudentsByGPA("Shoyo Hinata", 10, 15);
        studentsGPA[2] = new SortingStudentsByGPA("Kenma Kozume", 5, 95);
        studentsGPA[3] = new SortingStudentsByGPA("Toru Oikawa", 1, 69);
        studentsGPA[4] = new SortingStudentsByGPA("Hajime Iwaizumi", 4, 75);
        studentsGPA[5] = new SortingStudentsByGPA("Yu Nishinoya", 4, 40);
        studentsGPA[6] = new SortingStudentsByGPA("Atsumu Miya", 7, 70);

        quickSort(studentsGPA, 0, 6);
        printStudents(studentsGPA);

        Student students2[] = new Student[3];
        students2[0] = new Student("Tanaka Ryūnosuke", 5, 34);
        students2[1] = new Student("Koshi Sugawara", 2, 86);
        students2[2] = new Student("Tadashi Yamaguchi", 12, 85);

        Student[] new_list = mergeStudentList(students, students2);
        printStudents(new_list);
    }

    public static void printStudents(Student[] arr)
    {
        for(Student student : arr)
            System.out.println(student);
        System.out.println();
    }

    public static void insertSort(Comparable[] arr)
    {
        for (int i = 1; i < arr.length; ++i) {
            Comparable key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) < 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static int partition(Comparable[] arr, int low, int high)
    {
        Comparable pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++)
        {
            if (arr[j].compareTo(pivot) < 0)
            {
                i++;
                Comparable temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Comparable temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static void quickSort(Comparable[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static void merge(Comparable arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        Comparable L[] = new Comparable[n1];
        Comparable R[] = new Comparable[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) > 0) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(Comparable[] arr, int l, int r)
    {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static Student[] mergeStudentList(Student[] arr1, Student[] arr2)
    {
        Student[] resultArr = new Student[arr1.length + arr2.length];
        mergeSort(arr1, 0, arr1.length - 1);
        mergeSort(arr2, 0, arr2.length - 1);
        int j = 0;
        for (int i = 0; i < arr1.length; i++, j++)
            resultArr[j] = arr1[i];
        for (int i = 0; i < arr2.length; i++, j++)
            resultArr[j] = arr2[i];
        merge(resultArr, 0, arr1.length - 1, arr1.length + arr2.length - 1);
        return resultArr;
    }
}
