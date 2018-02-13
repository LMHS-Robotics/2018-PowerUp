package org.usfirst.frc.team4065.robot.commands;

import org.usfirst.frc.team4065.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;


public class DriveTrainCommand extends Command {
    public DriveTrainCommand() {
        requires(Robot.DRIVE_TRAIN_SUBSYSTEM);
    }

    @Override
    protected void initialize() {
        System.out.printf("Starting DriveTrainCommand");
    }

    @Override
    protected void execute() {
        Robot.DRIVE_TRAIN_SUBSYSTEM.tankDrive(Robot.m_oi.driverJoystick);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }


    @Override
    protected void end() {
        System.out.printf("Stopping DriveTrainCommand");
    }

    @Override
    protected void interrupted() {
        System.out.printf("Stopping DriveTrainCommand");
        super.interrupted();
    }
}
