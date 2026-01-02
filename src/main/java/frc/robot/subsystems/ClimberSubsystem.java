// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimberConstants;

public class ClimberSubsystem extends SubsystemBase {
  VictorSPX climberMotor = new VictorSPX(ClimberConstants.climberMotorSPX); // Replace 10 with the actual CAN ID
  Encoder climberEncoder = new Encoder(ClimberConstants.climberEncoderA, ClimberConstants.climberEncoderB);
  PIDController climberPID = new PIDController(frc.robot.Constants.ClimberPID.kP, frc.robot.Constants.ClimberPID.kI,
      frc.robot.Constants.ClimberPID.kD);

  /** Creates a new ClimberSubsystem. */
  public ClimberSubsystem() {
  }

  public void ClimbersetPoint(double setPoint, double speed) {
    double output = climberPID.calculate(climberEncoder.get(), setPoint);
    climberMotor.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, MathUtil.clamp(output, -speed, speed));
  }

  public void resetEncoder() {
    climberEncoder.reset();
  }

  public void stopClimber() {
    climberMotor.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
