package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.EESubsystem;

public class EECommands {
    public static Command spinEE(EESubsystem EE, double speed) {
        return Commands.run(
          () -> {
            EE.SpinMotor(speed);
            
          },
          EE);
    }
}
