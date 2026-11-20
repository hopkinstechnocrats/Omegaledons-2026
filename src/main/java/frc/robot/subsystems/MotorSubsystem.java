package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorSubsystem extends SubsystemBase {

    WPI_TalonSRX robotArmJoint;
    public DigitalInput limitSwitch;

    public MotorSubsystem() {
        // initializes the motor
        robotArmJoint = new WPI_TalonSRX(Constants.robotArmJointCANID);
        robotArmJoint.configFactoryDefault();
        robotArmJoint.setNeutralMode(NeutralMode.Brake);
    }

    // makes motor turn input speed
    public void armTilt(double speed) {
        robotArmJoint.set(speed);
    }
}
