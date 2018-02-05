package frc.team4065.DriveTrain;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.;
import com.ctre.CANTalon;

public class DriveForward {
    RobotDrive robotDrive = new RobotDrive(1, 2, 3, 4);

    CANTalon[] motor = new CANTalon[2];

    public void execute(Joystick joystick) {

        while(IsOperatorControl() && IsEnabled()) {
            robotDrive.
        }

        double left = joystick.getRawAxis(2);
        double right = -joystick.getRawAxis(5);

        if(Math.abs(left) > 0.1 || Math.abs(right) > 0.1) {
            motor[0].set(ControlMode.PercentOutput, left);
            motor[1].set(ControlMode.PercentOutput, right);
        }

    }

    public void driveForward() {
        System.out.println("Driving forward.");
        double left = 0.5;
        double right = -0.5;

        motor[0].set(ControlMode.PercentOutput, left);
        motor[0].set(ControlMode.PercentOutput, right);

    }

    public void stop() {
        System.out.print("Stopping motors.");
        for(CANTalon a : motor) {
            a.set(ControlMode.PercentOutput, 0);
        }
    }
}
