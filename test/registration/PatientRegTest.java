package registration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatientRegTest {
    @Test
    void testForPatientConstructor(){
        PatientReg patient = new PatientReg("1", "Jane", "Mama", "Bronchitis");
        assertNotNull(patient);
    }
}