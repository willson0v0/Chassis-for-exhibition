package org.usfirst.frc.team6414.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6414.robot.RobotMap;

/**
 * Created by jenny on 2017/2/22.
 */
public class Solenoid extends MonitoredSystem {
    private DoubleSolenoid solenoid;
    public Solenoid(){
        solenoid = new DoubleSolenoid(RobotMap.PNEUMATIC_OPEN,RobotMap.PNEUMATIC_CLOSE);
    }

    public void open(){
        solenoid.set(DoubleSolenoid.Value.kForward);
    }
    // Put methods for controlling this subsystem
    public void close(){
        solenoid.set(DoubleSolenoid.Value.kReverse);
    }
    // here. Call these from Commands.
    public void stop(){
        solenoid.set(DoubleSolenoid.Value.kOff);
    }


    public void initDefaultCommand() {
        // Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

