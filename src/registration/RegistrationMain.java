package registration;
import java.util.Scanner;
public class RegistrationMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter 1 to register as a doctor");
        System.out.println("Enter 2 to register as a Nurse");
        System.out.println("Enter 3 to register as a patient");
        int number = input.nextInt();

        if (number == 1){
            System.out.println("Than you for your interest in registering to be a doctor ");

            DoctorReg newDoctor = new DoctorReg();

        }




    }
}
