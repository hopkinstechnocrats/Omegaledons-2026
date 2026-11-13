package frc.robot.subsystems;

public class motor-subsystem {
    
}
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorExamplesSubsystem extends SubsystemBase {
    TalonFX TalonFXExampleMotor;
    TalonFX TalonFXExampleFollower;
}
    public MotorExamplesSubsystem() {
        TalonFXExampleMotor = new TalonFX(Constants.talonFXExampleCANID);
        TalonFXExampleFollower = new TalonFX(Constants.talonFXFollowerExampleCANID);
    }

    @Override
        public void periodic(){

    public void SpinMotorPercentSpeed (double speed){
        krakenExampleMotor.set(speed);
    }
    public void Brake (){
        krakenExampleMotor.set(0);
    }
}