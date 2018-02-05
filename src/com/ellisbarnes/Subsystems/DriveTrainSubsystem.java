package com.ellisbarnes.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ellisbarnes.Commands.DriveTrainCommand;
import com.ellisbarnes.RobotMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrainSubsystem extends Subsystem {

    DifferentialDrive drive; // Tank Drive
    WPI_TalonSRX[] motor = new WPI_TalonSRX[2]; // Drive Motors

    public DriveTrainSubsystem() {
        motor[0] = new WPI_TalonSRX(RobotMap.leftDriveTalon);
        motor[1] = new WPI_TalonSRX(RobotMap.rightDriveTalon);
        drive = new DifferentialDrive(motor[0], motor[1]);
    }

    public void tankDrive(Joystick joystick) {
        drive.tankDrive(joystick.getRawAxis(2), joystick.getRawAxis(5));
    }

    public void getInfo() {

    }


    public void initDefaultCommand() {
        setDefaultCommand(new DriveTrainCommand());
    }


}

