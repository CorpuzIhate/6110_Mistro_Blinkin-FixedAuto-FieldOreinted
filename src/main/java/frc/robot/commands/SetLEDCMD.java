package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.LEDTelemetrySub;

public class SetLEDCMD  extends Command  {
    private final double color;
    private final LEDTelemetrySub ledTelemetrySub;

    public SetLEDCMD(double color, LEDTelemetrySub ledTelemetrySub){
        this.color = color;
        this.ledTelemetrySub = ledTelemetrySub;
        addRequirements(ledTelemetrySub);
    }

    @Override
    public void execute() {
        ledTelemetrySub.setLEDColor(color);
    }


    

    
}
