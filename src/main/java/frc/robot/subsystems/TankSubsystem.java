// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.tankConstants;

public class TankSubsystem extends SubsystemBase {

  VictorSPX lMotor1 = new VictorSPX(tankConstants.leftMotorSRX);
  TalonSRX lMotor2 = new TalonSRX(tankConstants.leftMotorSRX);
  VictorSPX rMotor1 = new VictorSPX(tankConstants.rightMotorSPX);
  TalonSRX rMotor2 = new TalonSRX(tankConstants.rightMotorSRX);

  /** Creates a new TankSubsystem. */
  public TankSubsystem() {
  }

  public void setTankSpeed(double leftSpeed, double rightSpeed) {
    lMotor1.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, leftSpeed);
    lMotor2.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, leftSpeed);
    rMotor1.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, rightSpeed);
    rMotor2.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, rightSpeed);
  }

  public void periodic() {
    // This method will be called once per scheduler run
  }
}
