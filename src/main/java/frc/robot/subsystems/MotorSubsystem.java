package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class MotorSubsystem {

   WPI_TalonSRX RobotArmJoint;

 public MotorSubsystem() {
    
     RobotArmJoint = new WPI_TalonSRX(Constants.RobotArmJointCANID)

 
     RobotArmJoint.configFactoryDefault();
    }
}
//unworking ATM (not automatic teller machine)