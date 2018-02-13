package org.usfirst.frc.team4065.robot.subsystems;

import org.usfirst.frc.team4065.robot.RobotMap;
import org.usfirst.frc.team4065.robot.commands.DriveTrainCommand;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrainSubsystem extends Subsystem {

    DifferentialDrive drive; // Tank Drive
    WPI_TalonSRX[] motor = new WPI_TalonSRX[4]; // Drive Motors
    SpeedControllerGroup[] motorGroups = new SpeedControllerGroup[2];
    
    public DriveTrainSubsystem() {
    	motor[0] = new WPI_TalonSRX(RobotMap.leftDriveMotors[0]);
        motor[1] = new WPI_TalonSRX(RobotMap.leftDriveMotors[1]);
        motor[2] = new WPI_TalonSRX(RobotMap.rightDriveMotors[0]);
        motor[3] = new WPI_TalonSRX(RobotMap.rightDriveMotors[1]);
        
        motorGroups[0] = new SpeedControllerGroup(motor[0], motor[1]);
        motorGroups[1] = new SpeedControllerGroup(motor[2], motor[3]);
        
        drive = new DifferentialDrive(motorGroups[0], motorGroups[1]);
    }

    public void tankDrive(Joystick joystick) {
        drive.tankDrive(joystick.getRawAxis(1), joystick.getRawAxis(5));
    }

    public void getInfo() {

    }


    public void initDefaultCommand() {
        setDefaultCommand(new DriveTrainCommand());
    }


}

