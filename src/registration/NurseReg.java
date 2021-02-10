package registration;

import java.time.LocalTime;

public class NurseReg extends Registration {

    private String department;
    private String specialization;
    private final String userType = "Nurse";

    public NurseReg(int userId, String firstName, String lastName, Date regDate, Date birthDate, LocalTime regTime, String department, String specialization) {
        super(userId, firstName, lastName, regDate, birthDate, regTime);
        this.department = department;
        this.specialization = specialization;
    }

    public NurseReg(){}

    public String getUserType(){
        return userType;
    }

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



