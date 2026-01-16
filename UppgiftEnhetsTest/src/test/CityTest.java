package se.systemintegration.climate;

import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

class CityTest {
    private Coordinates mockCoordinates;
    private Temperature mockTemperature;

    private City classUnderTest;

    @Test
    void testCity() {
        Coordinates coord = new Coordinates(63.8f, 20.2f);
        Temperature temp = new Temperature(10);

        City city = new City("Umeå", "Sweden", coord, temp);

        String result = city.toString();

        assertTrue(result.contains("Umeå"));
        assertTrue(result.contains("Sweden"));

    }

    @Test
    void testSetTemp() {
        Coordinates coord = new Coordinates(63.8f, 20.2f);
        Temperature temp = new Temperature(10);
        City city = new City("Umeå", "Sweden", coord, temp);

        city.setTemperature(20);

        assertEquals(20, temp.getDegree(false));
    }

    }




/* 
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
*/