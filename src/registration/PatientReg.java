package registration;

public class PatientReg extends Registration{
    private String patientDisease;

    public PatientReg(String userId, String firstName, String lastName, String disease) {
        super(userId, firstName, lastName);
        this.patientDisease = disease;
    }
}
