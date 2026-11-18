package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorSubsystem extends SubsystemBase {
    TalonFX TalonFXExampleMotor;
    TalonFX TalonFXExampleFollower;

    public MotorSubsystem() {
        TalonFXExampleMotor = new TalonFX(Constants.talonFXExampleCANID);
        TalonFXExampleFollower = new TalonFX(Constants.talonFXFollowerExampleCANID);
    }

    @Override
        public void periodic(){}

    public void SpinMotorPercentSpeed (double speed){
        TalonFXExampleMotor.set(speed);
    }
    public void Brake (){
        TalonFXExampleMotor.set(0);
    }
}