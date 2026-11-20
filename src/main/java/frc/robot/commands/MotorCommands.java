package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.MotorSubsystem;

public class MotorCommands {

    public static Command spinMotor(MotorSubsystem robotarm) {
        return Commands.run(
            () -> {
                robotarm.armTilt(.5);
            },
            robotarm);

    }
 
    
}
