package student_management;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number of new students to enroll: ");
        Scanner in=new Scanner(System.in);
        int numOfStudents=in.nextInt();
        Student[] students=new Student[numOfStudents];
        for(int i=0;i<numOfStudents;i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTution();
            System.out.println(students[i].toString());
        }
	// write your code here
    }
}
