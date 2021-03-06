package registration;

import java.time.LocalTime;

public class NurseReg extends Registration {

    private String department;
    private String specialization;
    private final String userType = "Nurse";

    public NurseReg(int userId, String firstName, String lastName, Date birthDate, String email, String department, String specialization) {
        super(userId, firstName, lastName, birthDate, email);
        this.department = department;
        this.specialization = specialization;
    }

    public NurseReg(){}


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}



