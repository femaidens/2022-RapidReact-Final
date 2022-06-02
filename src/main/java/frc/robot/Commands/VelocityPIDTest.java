// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import frc.robot.Subsystems.Shooter;

public class VelocityPIDTest extends Command {
  public VelocityPIDTest() {
    requires(Robot.shooter);
    SmartDashboard.putNumber("P", 0.000700);
    SmartDashboard.putNumber("I", 0.000001);
    SmartDashboard.putNumber("D", 0.01);
    SmartDashboard.putNumber("IZone", 100.00);
    SmartDashboard.putNumber("FF", 0.000250);
    SmartDashboard.putNumber("OutputRangeL", -1.0);
    SmartDashboard.putNumber("OutputRangeH", 1.0);

    Shooter.sMotor1PIDController.setP(SmartDashboard.getNumber("P", 0.000700));
    Shooter.sMotor1PIDController.setI(SmartDashboard.getNumber ("I", 0.000001));
    Shooter.sMotor1PIDController.setD(SmartDashboard.getNumber("D", 0.010000));

    Shooter.sMotor2PIDController.setP(SmartDashboard.getNumber("P", 0.000700));
    Shooter.sMotor2PIDController.setI(SmartDashboard.getNumber ("I", 0.000001));
    Shooter.sMotor2PIDController.setD(SmartDashboard.getNumber("D", 0.010000));
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {}

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {}

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {}

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {}
}
