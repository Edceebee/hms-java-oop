package registration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {

    @Test
    void testDateConstructor(){
        Date newDate = new Date(3,5,1985);
        Date birthDate = new Date(4,3,2012);
        LocalTime regTime = LocalTime.now();
        Registration user = new Registration(1,"Amaka", "Mbah", newDate,"@gmail");
        assertNotNull(user);
    }

    // Test for Date
    @Test
    void testDateArgsConstructorIsNotNull(){
        Date date = new Date(2,3,2012);
        assertNotNull(date);
    }

    @Test
    void testDayMonthAndYearIsNotInvalid(){
        Exception exception;
        exception = assertThrows(IllegalArgumentException.class, () ->{
            Date date = new Date(32,3,2012);
        });
        assertEquals("Invalid day of the month", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () ->{
            Date date = new Date(2,32,2012);
        });
        assertEquals("Month does not exist", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () ->{
            Date date = new Date(2,3,1899);
        });
        assertEquals("Invalid year", exception.getMessage());
    }

    @Test
    void testForCorrectDateFormat(){
        Date date = new Date(2,3,1990);
        assertEquals("2/3/1990", date.getDate());
    }

    // Test for doctor
    @Test
    void testForDoctorConstructor(){
        Date regDate = new Date(3,5,1999);
        Date birthDate = new Date(4,3,2012);
       // LocalTime regTime = LocalTime.now();
        DoctorReg newDoctor = new DoctorReg(12, "Star boy", "OG way", birthDate,"@gmail.com","anatomy", "cardiology");
        assertNotNull(newDoctor);
    }

    @Test
    void testForDoctorNoArgConstructor(){
        DoctorReg newDoctor = new DoctorReg();
        assertNotNull(newDoctor);
    }

    @Test
    void testDoctorIdCanBeUpdated(){
        DoctorReg doctor = new DoctorReg();
        doctor.setUserId(1);
        assertEquals(1, doctor.getUserId());
    }

    @Test
    void testDoctorNamesCanBeUpdated(){
        DoctorReg doctor = new DoctorReg();
        doctor.setFirstName("Amaka");
        assertEquals("Amaka", doctor.getFirstName());

        doctor.setLastName("Bae");
        assertEquals("Bae", doctor.getLastName());
    }

    @Test
    void testDoctorDepartmentCanBeUpdated(){
        DoctorReg doctor = new DoctorReg();
        doctor.setDepartment("Cardiology");
        assertEquals("Cardiology", doctor.getDepartment());
    }

    @Test
    void testDoctorSpecializationCanBeUpdated(){
        DoctorReg doctor = new DoctorReg();
        doctor.setSpecialization("Surgeon");
        assertEquals("Surgeon", doctor.getSpecialization());
    }

    // Test for patient
    @Test
    void testForPatientConstructor() {
        Date regDate = new Date(3,5,1903);
        Date birthDate = new Date(4,1,2012);
        PatientReg patient = new PatientReg(1, "Jane", "Mama", birthDate, "80452273", "Bronchitis");
        assertNotNull(patient);
    }

    @Test
    void testPatientIdCanBeUpdated() {
        PatientReg newPatient = new PatientReg();
        newPatient.setUserId(123);
        assertEquals(123, newPatient.getUserId());
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