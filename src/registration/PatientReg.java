package registration;

import java.time.LocalTime;

public class PatientReg extends Registration{
    private String purpose;
    private final String userType = "Patient";

    public PatientReg(int userId, String firstName, String lastName, Date birthDate, String email, String purpose) {
        super(userId, firstName, lastName, birthDate, email);
        this.purpose = purpose;
    }

    public PatientReg(){

    }

    public String getUserType(){
        return userType;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String patientDisease) {
        this.purpose = patientDisease;
    }

}
