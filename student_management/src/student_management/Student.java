package student_management;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses=null;
    private int tutionBalance=0;
    private static int costOfCourse=600;
    private static int id=1000;

    public Student(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName=in.nextLine();

        System.out.println("Enter student's last name: ");
        this.lastName=in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear=in.nextInt();

        setStudentID();
//        System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentId);
    }
    private void setStudentID(){
        id++;
        this.studentId=gradeYear+" "+id;
    }
    public void enroll(){
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n" + course;
                tutionBalance += costOfCourse;
            } else{
                System.out.println("BREAKS!!");
                break;
            }
        }while(1!=0);
//        System.out.println("Enrolled in: "+courses);
//        System.out.println("Tution balance :"+tutionBalance);
    }
    public void viewBalance(){
        System.out.println("Your balance is : $"+tutionBalance);
    }

    public void payTution(){
        viewBalance();
        System.out.println("Enter your payment : $");
        Scanner in=new Scanner(System.in);
        int payment=in.nextInt();
        tutionBalance-=payment;
        System.out.println("Thank you for the payment of : $"+payment);
        viewBalance();
    }
    public String toString(){
        return "Name: "+firstName+" "+lastName+"\nGrade Level: "+gradeYear+"\nStudent ID: "+studentId+
                "\nCourses Enrolled: "+courses+"\nBalance: $"+tutionBalance;
    }
}
