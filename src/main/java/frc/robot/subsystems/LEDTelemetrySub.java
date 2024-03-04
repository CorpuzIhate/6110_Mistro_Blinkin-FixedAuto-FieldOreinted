package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.TelemetryLEDConstants;

public class LEDTelemetrySub extends SubsystemBase {
    private Spark Blinkin = new Spark(TelemetryLEDConstants.kBlinkinPWMChannel);

    public void setLEDColor(double color){
        Blinkin.set(color);
    }

    
}
