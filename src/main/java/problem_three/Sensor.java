package problem_three;

import java.time.LocalDateTime;

public interface Sensor {
    //Return the name of the Sensor
    String getSensorType();
    //Return the sensor data in double
    double getReading();
    //Return the Home location where sensor deployed. [ Garden, Kitchen, etc.,]
    String getLocation();
    //Return the system current time
    LocalDateTime getLastUpdated();
    //Return the action taken based on the Sensor alert
    String performAction();
}
