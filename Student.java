import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;
    private static int id = 1000;

    //constructor:prompt user to enter students name and year
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Students' first name: ");
        this.firstName = sc.nextLine();

        System.out.print("Enter Students' last name: ");
        this.lastName = sc.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 Senior\nEnter student class level: ");
        this.gradeYear = sc.nextInt();
        
        setStudentId();
        System.out.println(firstName + " " + lastName + " " + gradeYear); 
    }
    //generate an id
    private void setStudentId(){
        //grade level + id
        id++;
        this.studentId = gradeYear + "" + id;
    }
   
    //enroll in courses
    //view balance
    //pay tuition
    //show status

}