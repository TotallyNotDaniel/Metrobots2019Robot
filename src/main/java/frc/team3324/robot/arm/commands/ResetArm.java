package frc.team3324.robot.arm.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team3324.robot.Robot;

public class ResetArm extends Command {


    @Override
    protected void execute() {
        Robot.arm.setRawArmSpeed(-0.7);
    }

    @Override
    protected boolean isFinished() {
        return Robot.arm.getFrontSwitch();
    }

    @Override
    protected void end() {
        Robot.arm.setArmSpeed(0);
    }
}
