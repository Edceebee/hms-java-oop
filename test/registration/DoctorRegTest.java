package registration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorRegTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testForDoctorConstructor(){
        //given that
        DoctorReg newDoctor = new DoctorReg("12", "Star boy", "OG way", "anatomy", "cardiology");
        assertNotNull(newDoctor);
    }
}