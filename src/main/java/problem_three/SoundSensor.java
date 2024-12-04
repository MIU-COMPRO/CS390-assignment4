package problem_three;

import java.time.LocalDateTime;

public class SoundSensor implements Sensor {
    private String location;
    private LocalDateTime lastUpdated;
    private double soundLevel;
    public SoundSensor(String location, double soundLevel) {
        this.location = location;
        this.soundLevel = soundLevel;
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
        return (soundLevel > 70)?
                "Turn on noise cancellation":
                "Sound is within normal range";
    }

    @Override
    public String toString() {
        return "Sensor Type: " + "Sound Sensor\n" +
                "Reading: " + soundLevel + "\n" +
                "Location: " + location + "\n" +
                "Last Updated: " + lastUpdated + "\n" +
                "Action: " + performAction()+ "\n";
    }
}
