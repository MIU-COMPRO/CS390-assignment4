package problem_three;

import java.time.LocalDateTime;

public class LightSensor implements Sensor {
    private String location;
    private LocalDateTime lastUpdated;
    private double lightlevel;

    public LightSensor(String location, double lightlevel) {
        this.location = location;
        this.lightlevel = lightlevel;
        this.lastUpdated = LocalDateTime.now();
    }

    /**
     * @return 
     */
    @Override
    public String getSensorType() {
        return "";
    }

    /**
     * @return 
     */
    @Override
    public double getReading() {
        return 0.0;
    }

    /**
     * @return 
     */
    @Override
    public String getLocation() {
        return "";
    }

    /**
     * @return 
     */
    @Override
    public LocalDateTime getLastUpdated() {
        lastUpdated = LocalDateTime.now();
        return lastUpdated;
    }

    /**
     * @return 
     */
    @Override
    public String performAction() {
        return (lightlevel < 100)?
                "Turn on the light":
                "Light is sufficient";
    }

    @Override
    public String toString() {
        return "Sensor Type: " + "Light Sensor\n" +
                "Reading: " + lightlevel + "\n" +
                "Location: " + location + "\n" +
                "Last Updated: " + lastUpdated + "\n" +
                "Action: " + performAction() + "\n";
    }
}