package b2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortingStudent sortingStudent = new SortingStudent();
        Student[] students1= sortingStudent.getAll();
        System.out.println("selectionSort:"+ Arrays.toString(students1));
        sortingStudent.selectionSort(students1);

        Student[] students2= sortingStudent.getAll();
        System.out.println("insertionSort:"+ Arrays.toString(students1));
        sortingStudent.insertionSort(students2);

        Student[] students3= sortingStudent.getAll();
        System.out.println("bubbleSort:"+ Arrays.toString(students1));
        sortingStudent.bubbleSort(students3);
    }
}
