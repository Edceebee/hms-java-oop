package registration;

public class DoctorReg extends Registration{
    private String department;
    private String specialization;
    private final String userType = "Doctor";

    public DoctorReg(String userId, String firstName, String lastName, Date regDate, Date birthDate, String department, String specialization) {
        super(userId, firstName, lastName, regDate, birthDate);
        this.department = department;
        this.specialization = specialization;
    }

    public DoctorReg(){}

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
