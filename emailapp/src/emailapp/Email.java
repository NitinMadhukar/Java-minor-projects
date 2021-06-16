package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private String companySuffix="aeycompany.com";
    private int defaultPasswordLength=10;
    private int mailboxCapacity=500;

    // constructor to recieve first name and last name
    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email created :"+this.firstName +" "+ this.lastName);

        //Call a method asking for department and return the department
        this.department=setDepartment();
        System.out.println("DEPARTMENT: "+this.department);

        //Call a method that return random password
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your password is :"+this.password);

        //Combine elements to generate Email
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+'.'+companySuffix;
        System.out.println("Your email is :"+email);
    }
    //Ask for the department
    private String setDepartment(){
        System.out.println("New worker :"+firstName+  "\nDEPARTMENT CODES\n1 for sales\n2 for development\n3 for Accounting\n0 for none\n Enter department code :");
        Scanner in=new Scanner(System.in);
        int deptChoice=in.nextInt();
        if(deptChoice==1) return "sales";
        else if(deptChoice==2) return "dev";
        else if(deptChoice==3) return "acct";
        else return "";
    }
    //Generate a random password
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }
    //set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
    //Change the password
    public void changePassword(String password){
        this.password=password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "DISPLAY NAME :"+firstName+" "+lastName+"\nCOMPANY EMAIL :"+email+"\nMAILBOX CAPACITY :"+mailboxCapacity+"mb";
    }
}
