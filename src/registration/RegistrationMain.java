package registration;
import javax.swing.*;
import java.util.Scanner;
public class RegistrationMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter 1 to register as a doctor");
        System.out.println("Enter 2 to register as a Nurse");
        System.out.println("Enter 3 to register as a patient");
        int number = input.nextInt();

        if (number == 1){
            DoctorReg newDoctor = new DoctorReg();

            System.out.println("Thank you for your interest in registering to be a doctor,");

            System.out.println("kindly fill in the form below to register \n Enter your first name");
            newDoctor.setFirstName(input.next());

            System.out.println("Enter your last name");
            newDoctor.setLastName(input.next());

//            System.out.println("Enter your date of birth");
//            newDoctor.setBirthDate(input.next());

            System.out.println("Enter your email address");
            newDoctor.setEmail(input.next());

            System.out.println("Enter your department");
            newDoctor.setDepartment(input.next());

            System.out.println("Enter your specialization");
            newDoctor.setSpecialization(input.next());
            System.out.println();

            System.out.println("thank you for your time \nHere are your details below:");
            System.out.println("\nFull name is: " + newDoctor.getFirstName() + "___" + newDoctor.getLastName());
            System.out.printf("Department is: %s%nSpecialization is: %s%n", newDoctor.getDepartment(),newDoctor.getSpecialization() );
            System.out.println("Email address is: " + newDoctor.getEmail() );
            System.out.println();
            System.out.println("Thanks for your time, we'll get in touch with you....");











        }




    }
}
