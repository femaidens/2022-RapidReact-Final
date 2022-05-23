// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DutyCycle;

/** Add your docs here. */
public class RobotMap {

    public static int driveJoy1Port = 2; //controls lateral
    public static int driveJoy2Port = 1; //controls turning
    public static int operJoyPort = 0;

    //drivetrain - might need to fix
    public static int frontRightPort = 9; //10
    public static int frontLeftPort = 1; //9
    public static int rearRightPort = 8; //11
    public static int rearLeftPort = 7; //3
    public static int gyroPort = 6; //0
    public static int dcEncoder;

    //intake
    public static int intakeMotorPort = 2;
    public static int intakeExtendPort = 3;

    public static int intakeEncoderPort = 3; 
    //public static int encoderPort1 = 3;
    //public static int encoderPort2 = 4;


    //climb
    public static int rightClimbPort = 6;
    public static int leftClimbPort = 5;
    public static int climbPistonForwardPort = 4;
    public static int climbPistonBackwardPort = 5;

    //public static int climbLeftUltrasonicPort = 0;
    //public static int climbRightUltrasonicPort = 0;

    //shooter
    public static int shooterMotorPort = 16;//change port number
    public static int shooterAbEncoderPort = 2;
    public static int shooterPistonForwardPort = 2;
    public static int shooterPistonBackwardPort = 3;
    public static int shooterGBPistonBackwardPort = 6;
    public static int shooterGBPistonForwardPort = 7;
}
