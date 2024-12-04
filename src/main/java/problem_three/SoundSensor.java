package problem_three;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    private String location;
    private LocalTime lastUpdated;
    private double soundLevel;
    public SoundSensor(String location, double soundLevel) {
        this.location = location;
        this.soundLevel = soundLevel;
        this.lastUpdated = LocalTime.now();
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
    public LocalTime getLastUpdated() {
        lastUpdated = LocalTime.now();
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
                "Last Updated: " + lastUpdated.format(DateTimeFormatter.ofPattern("hh:mm a")) + "\n" +
                "Action: " + performAction()+ "\n";
    }
}
