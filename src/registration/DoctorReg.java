package registration;

public class DoctorReg extends Registration{
    private String department;
    private String specialization;

    public DoctorReg(String userId, String firstName, String lastName, String department, String specialization) {
        super(userId, firstName, lastName);
        this.department = department;
        this.specialization = specialization;
    }

    public DoctorReg(){}

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
