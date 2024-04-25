public class StudentDatabaseMain {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.toString());
        //ask how many new users we want to add
        //create number of new students
    }
}