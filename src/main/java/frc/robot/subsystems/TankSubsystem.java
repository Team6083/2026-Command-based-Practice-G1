// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.TankConstants;

public class TankSubsystem extends SubsystemBase {

  VictorSPX leftmotor1 = new VictorSPX(TankConstants.leftMotorSPX);
  TalonSRX leftmotor2 = new TalonSRX(TankConstants.leftMotorSRX);
  VictorSPX rightmotor1 = new VictorSPX(TankConstants.rightMotorSPX);
  TalonSRX rightmotor2 = new TalonSRX(TankConstants.rightMotorSRX);

  /** Creates a new TankSubsystem. */
  public TankSubsystem() {
  }

  public void setTankSpeed(double leftSpeed, double rightSpeed) {
    leftmotor1.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, leftSpeed);
    leftmotor2.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, leftSpeed);
    rightmotor1.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, rightSpeed);
    rightmotor2.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, rightSpeed);
  }

  public void periodic() {
    // This method will be called once per scheduler run
  }
}
