package se.systemintegration.climate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents current and historical temperatures
 *
 * @author pbfot
 */
public class Temperature {

    /**
     * The {@link int} of the current degree celsius
     */
    private int currentDegreeCelsius = Integer.MIN_VALUE;

    /**
     * The {@link List} of the historical temperatures
     */
    private final List<Integer> historicalTemperatures;

    /**
     * Constructor of {@link Temperature}
     *
     * @param currentDegreeCelsius the current degree in celsius
     */
    public Temperature(final int currentDegreeCelsius) {

        this.currentDegreeCelsius = currentDegreeCelsius;
        this.historicalTemperatures = new ArrayList<>();

    }

    /**
     * Returns the degree in either celsius or farenheit
     *
     * @param farenheit if true, return in farenheit, if false return in celsius
     * @return degree the current degree in either farenheit or celsius
     */
    public int getDegrees(final boolean farenheit) {
        if (farenheit) {
            return convertCelsiusToFarenheit(currentDegreeCelsius);
        } else {
            return currentDegreeCelsius;
        }
    }

    /**
     * Set the current degree in celsius
     *
     * @param currentDegreeCelsius the current degree in celcius to be set
     * @return successful true if the temperature was valid, else false
     */
    public boolean setCurrentDegreeCelsius(final int currentDegreeCelsius) {

        if (currentDegreeCelsius <= -273) {
            return false;
        } else {

            historicalTemperatures.add(this.currentDegreeCelsius);
            this.currentDegreeCelsius = currentDegreeCelsius;

            return true;
        }
    }

    /**
     * Find and return the highest temperature
     *
     * @return highestTemp the highest temperature
     */
    public int getHighestTemp() {
        int highestTemp = this.currentDegreeCelsius;
        for (int degree : historicalTemperatures) {
            if (degree > highestTemp) {
                highestTemp = degree;
            }
        }
        return highestTemp;
    }

    /**
     * Find and return the lowest temperature
     *
     * @return lowestTemp the lowest temperature
     */
    public int getLowestTemp() {
        int lowestTemp = this.currentDegreeCelsius;
        for (int degree : historicalTemperatures) {
            if (degree < lowestTemp) {
                lowestTemp = degree;
            }
        }
        return lowestTemp;
    }

    /**
     * States in what state the water is
     *
     * @return waterState the state if water in the type of
     * {@link TemperatureTypes}
     */
    public TemperatureTypes waterState() {
        if (currentDegreeCelsius < 0) {
            return TemperatureTypes.FREEZING;
        } else if (currentDegreeCelsius > 99) {
            return TemperatureTypes.BOILING;
        } else {
            return TemperatureTypes.LIQUID;
        }
    }

    /**
     * Conversion from Celsius to Farenheit
     *
     * @return waterState the state if water in the type of
     * {@link TemperatureTypes}
     */
    private static int convertCelsiusToFarenheit(final int currentDegreeCelsius) {
        return (currentDegreeCelsius - 32) * 5 / 9;
    }

    /**
     * HashCode of the object of the type {@link Temperature}
     *
     * @return hashCode
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.currentDegreeCelsius;
        hash = 89 * hash + Objects.hashCode(this.historicalTemperatures);
        return hash;
    }

    /**
     * {@link String} representation of the object of the type
     * {@link Temperature}
     *
     * @return string object string representation
     */
    @Override
    public String toString() {
        return "Temperature:" + "currentDegreeCelsius=" + currentDegreeCelsius
                + ", historicalTemperatures=" + historicalTemperatures + '}';
    }

    /**
     * {@link Object#equals(Object)}
     *
     * @return equals true if it equals, else false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Temperature other = (Temperature) obj;
        if (this.currentDegreeCelsius != other.currentDegreeCelsius) {
            return false;
        }
        if (!Objects.equals(this.historicalTemperatures, other.historicalTemperatures)) {
            return false;
        }
        return true;
    }
}
