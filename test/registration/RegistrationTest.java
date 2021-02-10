package registration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {

    @Test
    void testRegistrationConstructor(){
        Date regDate = new Date(3,5,1985);
        Date birthDate = new Date(4,3,2012);
        Registration user = new Registration("1","Amaka", "Mbah", regDate, birthDate);
        assertNotNull(user);
    }
}