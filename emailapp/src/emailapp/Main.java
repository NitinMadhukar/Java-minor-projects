package emailapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name :");
        String firstname = sc.nextLine();
        System.out.println("Enter your last name :");
        String lastname = sc.nextLine();

        Email em1=new Email(firstname,lastname);
        System.out.println(em1.showInfo());
    }
}
