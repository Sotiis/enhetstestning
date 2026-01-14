package se.systemintegration.climate;
/**
 * Represents an City
 *
 * @author pbfot
 */
public class City {

    /**
     * The {@link String} instance of the city name
     */
    private final String name;

    /**
     * The {@link String} instance of the country name where the city is
     */
    private final String country;

    /**
     * The {@link Coordinates} instance of the city coordinates
     */
    private final Coordinates coords;

    /**
     * The {@link Temperature} instance of the city temperature
     */
    private final Temperature temperature;

    /**
     * City is the sole constructor of {@link City}
     *
     * @param name {@link City#name} of the city
     * @param country {@link City#country} name of the country
     * @param coords {@link City#coords} of the city
     * @param temperature {@link City#temperature} of the city
     *
     */
    public City(final String name,
            final String country,
            final Coordinates coords,
            final Temperature temperature) {

        this.name = name;
        this.country = country;
        this.coords = coords;
        this.temperature = temperature;
    }

    /**
     * This object, of {@link City}, is returned as a {@link String}
     *
     * @return {@link String} of {@link City} instance
     */
    @Override
    public String toString() {
        return "City{" + "name=" + name
                + ", country=" + country
                + ", coords=" + coords
                + ", current temperature=" + temperature + '}';
    }

    /**
     *  Set the current temperature of {@link City}
     *
     *  @param temp the current degree in celcius to be set
     */
    public void setTemperature(final int temp) {
        temperature.setCurrentDegreeCelsius(temp);
    }
}
