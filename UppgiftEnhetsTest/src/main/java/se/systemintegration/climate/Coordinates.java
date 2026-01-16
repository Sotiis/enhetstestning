package se.systemintegration.climate;
/**
 * Represents coordinates in longitude and latitude
 * @author pbfot
 */
public class Coordinates {
    /**
     * The longitude
     */
    private final float longitude;
    
    /**
     * The latitude
     */
    private final float latitude;

    /**
     * The constructor for {@link Coordinates}
     * @param longitude float representation of the longitude
     * @param latitude float representation of the latitude
     */
    public Coordinates(float longitude, float latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
    
    /**
     * Getter of longitude
     * @return longitude float representation of the longitude     
     */
    public float getLongitude(){
        return longitude;
    }
    
    /**
     * Getter of latitude
     * @return latitude float representation of the longitude     
     */
    public float getLatitude(){
        return latitude;
    }
    
    /**
     * HashCode of the object of the type {@link Coordinates}
     * 
     * @return hashCode
     */ 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Float.floatToIntBits(this.longitude);
        hash = 97 * hash + Float.floatToIntBits(this.latitude);
        return hash;
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
        final Coordinates other = (Coordinates) obj;
        if (Float.floatToIntBits(this.longitude) != Float.floatToIntBits(other.longitude)) {
            return false;
        }
        if (Float.floatToIntBits(this.latitude) != Float.floatToIntBits(other.latitude)) {
            return false;
        }
    
        return true;
    }

    /**
     * {@link String} representation of the object of the type {@link Temperature}
     * 
     * @return string object string representation
     */ 
    @Override
    public String toString() {
        return "Coordinates{" + "longitude=" + longitude + ", latitude=" + latitude + '}';
    }
    
}
