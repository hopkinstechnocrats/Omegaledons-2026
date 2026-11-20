package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ArmSubsystem extends SubsystemBase {
    TalonSRX armMotor;

    public ArmSubsystem() {
        armMotor = new TalonSRX(Constants.armMotorCANID);
    }

    @Override
    public void periodic() {}

    public void SpinMotor(double speed) {
        armMotor.set(ControlMode.PercentOutput, speed);
    }

    public void BrakeMotor() {
        armMotor.set(ControlMode.PercentOutput, 0);
    }
}
