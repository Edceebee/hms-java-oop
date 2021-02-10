package registration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorRegTest {

    @Test
    void testForDoctorConstructor(){
        Date regDate = new Date(3,5,1999);
        Date birthDate = new Date(4,3,2012);
        DoctorReg newDoctor = new DoctorReg("12", "Star boy", "OG way", regDate, birthDate,"anatomy", "cardiology");
        assertNotNull(newDoctor);
    }
    @Test
    void testForDoctorNoArgConstructor(){
        //given that
        DoctorReg newDoctor = new DoctorReg();
        assertNotNull(newDoctor);
    }

    @Test
    void testDoctorIdCanBeUpdated(){
        DoctorReg doctor = new DoctorReg();
        doctor.setUserId("1");
        assertEquals("1", doctor.getUserId());
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

}