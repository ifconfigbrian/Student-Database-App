import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = null;
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    private static int id = 1000;

    //constructor:prompt user to enter students name and year
    Scanner sc;
    public Student(){
         sc = new Scanner(System.in);
        System.out.print("Enter Students first name: ");
        this.firstName = sc.nextLine();

        System.out.print("Enter Students last name: ");
        this.lastName = sc.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = sc.nextInt();

        setStudentId();

    }
    //generate an id
    private void setStudentId(){
        //grade level + id
        id++;
        this.studentId = gradeYear + "" + id;
    }
   
    //enroll in courses
     public void enroll(){
        //enter a loop,user hits * to quit
        do{
        System.out.println("Enter course to enroll(* to quit): ");
        sc = new Scanner(System.in);
        String course = sc.nextLine();
        if (!course.equals("*")) {
            courses = courses + "\n " + course;
            tuitionBalance = tuitionBalance + costOfCourse;
            
        }else{
            break;
        }
    }while(1 != 0);

    }

    //view balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    
    //pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter Amount to pay: $");
        sc = new Scanner(System.in);
       int payment = sc.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thankyou for payment of: $" + payment);
        viewBalance();
        sc.close();

    }
    //show status
    public String toString(){
        return "Name: " + firstName + " " + lastName + " " + "\nGrade level: " + gradeYear + "\nStudent id: " + studentId +
               "\nCourses enrolled: " + courses + "\nBalance: $" + tuitionBalance;
    }
    

}