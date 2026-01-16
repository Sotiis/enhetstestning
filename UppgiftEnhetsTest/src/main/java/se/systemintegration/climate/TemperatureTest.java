package se.systemintegration.climate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

class TemperatureTest {

    private Temperature classUnderTest;

    @BeforeEach
    void setUp() {
        classUnderTest = new Temperature(0);
    }

    @Test  
    void getDegress() {
        int fahrenheit = classUnderTest.getDegrees(true);

        assertEquals(32, fahrenheit);
    }
}