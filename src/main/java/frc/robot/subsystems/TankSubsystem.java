// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.tankconstants;

public class TankSubsystem extends SubsystemBase {

  VictorSPX LMotor1 = new VictorSPX(tankconstants.leftMotorSRX);
  TalonSRX LMotor2 = new TalonSRX(tankconstants.leftMotorSRX);
  VictorSPX RMotor1 = new VictorSPX(tankconstants.rightMotorSPX);
  TalonSRX RMotor2 = new TalonSRX(tankconstants.rightMotorSRX);
  /** Creates a new TankSubsystem. */
  public TankSubsystem() {}
  
  public void TankSpeed(double leftSpeed, double rightSpeed){
    LMotor1.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, leftSpeed);
    LMotor2.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, leftSpeed);
    RMotor1.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, rightSpeed);
    RMotor2.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, rightSpeed);
  }
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
