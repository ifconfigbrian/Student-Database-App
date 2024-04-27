import java.util.Scanner;

public class StudentDatabaseMain {

    public static void main(String[] args) {
        //ask how many new users we want to add
        System.out.println("How many students do you want to enroll? : ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[]students = new Student[numOfStudents];
        //create number of new students
        for(int n = 0; n < numOfStudents; n++){
            students[n]= new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
            sc.close();

        }
    }
}