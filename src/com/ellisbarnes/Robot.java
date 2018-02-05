package com.ellisbarnes;

import com.ellisbarnes.Subsystems.DriveTrainSubsystem;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {

    public static final DriveTrainSubsystem DRIVE_TRAIN_SUBSYSTEM = new DriveTrainSubsystem();
    public static final OI oi = new OI();


    @Override
    public void robotInit() {
    }

    @Override
    public void autonomousInit() {
    }

    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void testPeriodic() {
        Scheduler.getInstance().run();
    }
}
