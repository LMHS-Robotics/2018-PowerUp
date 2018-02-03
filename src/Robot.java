import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;

public class Robot extends IterativeRobot {
    RobotDrive robotDrive;
    Joystick left, right;

    public void robotInit() {
        robotDrive = new RobotDrive(1, 2, 3, 4);
        left = new Joystick(1);
        right = new Joystick(2);
    }

    @Override
    public void autonomousInit() {
        super.autonomousInit();
    }

    @Override
    public void teleopPeriodic() {
        super.teleopPeriodic();

        robotDrive.tankDrive(left.getRawAxis(2), -right.getRawAxis(5));
        Timer.delay(0.01);
    }
}
