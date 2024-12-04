package problem_three;

import java.time.LocalDateTime;

public class TemparatureSensor implements Sensor {
    private String location;
    private LocalDateTime lastUpdated;
    private double temperature;
    public TemparatureSensor(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
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
        return 0;
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
        if (temperature > 30) {
            return "Turn on the AC";
        } else if (temperature < 18) {
            return "Turn on the heater";
        } else {
            return "Temperature is within normal range";
        }
    }
    @Override
    public String toString() {
        return "Sensor Type: " + "Temperature\n" +
                "Reading: " + temperature + "\n" +
                "Location: " + location + "\n" +
                "Last Updated: " + lastUpdated + "\n" +
                "Action: " + performAction()+ "\n";
    }

}
