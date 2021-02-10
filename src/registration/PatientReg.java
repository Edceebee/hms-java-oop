package registration;

import java.time.LocalTime;

public class PatientReg extends Registration{
    private String patientDisease;
    private final String userType = "Patient";

    public PatientReg(int userId, String firstName, String lastName, Date regDate, Date birthDate, LocalTime regTime, String disease) {
        super(userId, firstName, lastName, regDate, birthDate, regTime);
        this.patientDisease = disease;
    }

    public PatientReg(){

    }

    public String getUserType(){
        return userType;
    }

    public String getPatientDisease() {
        return patientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }

}
