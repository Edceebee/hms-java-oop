package registration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientRegTest {
    @Test
    void testForPatientConstructor() {
        Date regDate = new Date(3,5,1903);
        Date birthDate = new Date(4,1,2012);
        PatientReg patient = new PatientReg("1", "Jane", "Mama", regDate, birthDate,"Bronchitis");
        assertNotNull(patient);
    }

    @Test
    void testPatientIdCanBeUpdated() {
        PatientReg newPatient = new PatientReg();
        newPatient.setUserId("123");
        assertEquals("123", newPatient.getUserId());
    }
    @Test
    void testPatientFirstNameCanBeUpdated() {
        PatientReg newPatient = new PatientReg();
        newPatient.setFirstName("Star boy");
        assertEquals("Star boy", newPatient.getFirstName());
    }
    @Test
    void testPatientLastNameCanBeUpdated() {
        PatientReg newPatient = new PatientReg();
        newPatient.setLastName("OG way");
        assertEquals("OG way", newPatient.getLastName());
    }
    @Test
    void testPatientDiseaseCanBeUpdated() {
        PatientReg newPatient = new PatientReg();
        newPatient.setPatientDisease("Tbs");
        assertEquals("Tbs", newPatient.getPatientDisease());
    }
}

