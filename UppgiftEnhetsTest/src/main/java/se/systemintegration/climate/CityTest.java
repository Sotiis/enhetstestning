package se.systemintegration.climate;

import org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.beans.Transient;

class CityTest {
    private Coordinates mockCoordinates;
    private Temperature mockTemperature;

    private City classUnderTest;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        classUnderTest = new City("Umeå","Sweden",mockCoordinates,mockTemperature);
    }

    @Test
    void setTemperature() {
        int newTemp =25;

        classUnderTest.setTemperature(newTemp);

        verify(mockTemperature).setCurrentDegreeCelsius(newTemp);
    }

    @Test
    void testToString() {

    String result = classUnderTest.toString();

    assertTrue(result.contains("Umeå"));
    }
}
