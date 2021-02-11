package registration;
import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class RegistrationMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


            System.out.println("Enter 1 to register as a doctor");
            System.out.println("Enter 2 to register as a Nurse");
            System.out.println("Enter 3 to register as a patient");
            int number;

            while (true) {
                if(input.hasNextInt()){
                    number = input.nextInt();
                    break;
                } else {
                    System.out.println("Wrong input, please try again");
                    System.out.println("Enter 1 to register as a doctor");
                    System.out.println("Enter 2 to register as a Nurse");
                    System.out.println("Enter 3 to register as a patient");

                    input.nextLine();
                }
            }


          // int number = input.nextInt();
        if (number == 1) {
            DoctorReg newDoctor = new DoctorReg();
            boolean continueLoop = true;

                    System.out.println("Thank you for your interest in registering to be a doctor,");


                    System.out.println("kindly fill in the form below to register \n Enter your first name");
                    newDoctor.setFirstName(input.next());
                    continueLoop = true;


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
                    continueLoop = false;



            System.out.println("thank you for your time \nHere are your details below:");
            System.out.println("\nFull name is: " + newDoctor.getFirstName() + "___" + newDoctor.getLastName());
            System.out.printf("Department is: %s%nSpecialization is: %s%n", newDoctor.getDepartment(),newDoctor.getSpecialization() );
            System.out.println("Email address is: " + newDoctor.getEmail() );
            System.out.println();
            System.out.println("Thanks for your time, we'll get in touch with you....");

        }
        if (number == 2){
            NurseReg newNurse = new NurseReg();

            System.out.println("Thank you for your interest in registering to be a Nurse,");

            System.out.println("kindly fill in the form below to register to be a Nurse \n Enter your first name");
            newNurse.setFirstName(input.next());

            System.out.println("Enter your last name");
            newNurse.setLastName(input.next());

//            System.out.println("Enter your date of birth");
//            newDoctor.setBirthDate(input.next());

            System.out.println("Enter your email address");
            newNurse.setEmail(input.next());

            System.out.println("Enter your department");
            newNurse.setDepartment(input.next());

            System.out.println("Enter your specialization");
            newNurse.setSpecialization(input.next());
            System.out.println();

            System.out.println("thank you for your time \nHere are your details below:");
            System.out.println("\nFull name is: " + newNurse.getFirstName() + "___" + newNurse.getLastName());
            System.out.printf("Department is: %s%nSpecialization is: %s%n", newNurse.getDepartment(),newNurse.getSpecialization() );
            System.out.println("Email address is: " + newNurse.getEmail() );
            System.out.println();
            System.out.println("Thanks for your time, we'll get in touch with you....");

        }
        if (number == 3){
            PatientReg newPatient = new PatientReg();

            System.out.println("Thank you for your interest in registering to be a registered patient");
            System.out.println("kindly fill in the form below to register to be a patient \n Enter your first name");
            newPatient.setFirstName(input.next());

            System.out.println("Enter your last name");
            newPatient.setLastName(input.next());

//            System.out.println("Enter your date of birth");
//            newDoctor.setBirthDate(input.next());

            System.out.println("Enter your email address");
            newPatient.setEmail(input.next());

            System.out.println("Enter purpose for registration");
            newPatient.setPurpose(input.next());

            System.out.println("thank you for registering with us \nHere are your details below:");
            System.out.println("\nFull name is: " + newPatient.getFirstName() + "  " + newPatient.getLastName());
            System.out.println("Email address is: " + newPatient.getEmail() );
            System.out.println("The reason for registration is: " + newPatient.getPurpose());

            System.out.println();
            System.out.println("Thanks for your time, one of our doctors will get in touch with you....");
        }


    }
}
