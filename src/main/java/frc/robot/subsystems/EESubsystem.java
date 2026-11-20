package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class EESubsystem extends SubsystemBase {
    TalonSRX EEMotor;

    public EESubsystem() {
        EEMotor = new TalonSRX(Constants.EEMotorCANID);
    }

    @Override
    public void periodic() {}

    public void SpinMotor(double speed) {
        EEMotor.set(ControlMode.PercentOutput, speed);
    }

    public void BrakeMotor() {
        EEMotor.set(ControlMode.PercentOutput, 0);
    }
}
