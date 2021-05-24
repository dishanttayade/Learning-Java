import java.util.Scanner;

public class Two {
    
    public static void main(String[] args) {
        // video two
        int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstNameInitial = 'D';
        char studentLastNameInitial = 'T';
        boolean attendance = true;

        System.out.println("Age of student = "+studentAge);
        System.out.println("GPA = "+studentGPA);
        System.out.println("Student Name in short = "+studentFirstNameInitial+studentLastNameInitial);
        System.out.println("Perfect Attendance = "+attendance+"\n");


        //video three
        String Name = "Dishant Tayade";
        String FirstName = "Dishant";
        String LastName = "Tayade";

        System.out.println("Name of Student = "+Name);
        System.out.println("First Name = "+FirstName);
        System.out.println("Last Name = "+LastName+"\n");

        //video four
        char studentFirstInitial = FirstName.charAt(0);
        char studentLastInitial = LastName.charAt(0);
        System.out.println("Student Name in short = "+studentFirstInitial+studentLastInitial+"\n");


        //video 5
        String FullName = FirstName +" "+ LastName;
        System.out.println("Full Name = "+FullName +" of Age "+studentAge+" has GPA of "+studentGPA+".\n");

        // video 6
        System.out.println("Do you want to update GPA? Enter it.");
        Scanner input = new Scanner(System.in);
        studentGPA =  input.nextDouble();
        System.out.println("Full Name = "+FullName +" of Age "+studentAge+" has GPA of "+studentGPA+".\n");
        input.close();
    }
}
