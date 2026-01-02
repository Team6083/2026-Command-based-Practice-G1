// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConstants;

public class CoralShooterSubsystem extends SubsystemBase {
  VictorSPX coralShooterMotor = new VictorSPX(ShooterConstants.shooterMotorSPX);

  /** Creates a new CoralShooterSubsystem. */
  public CoralShooterSubsystem() {
  }

  public void setShooterForword(boolean bottomPort1, double speed1) {
    if (bottomPort1) {
      coralShooterMotor.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, speed1);
    } else {
      coralShooterMotor.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 0);
    }
  }

  public void setShooterBackword(boolean bottomPort2, double speed2) {
    if (bottomPort2) {
      coralShooterMotor.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, speed2);
    } else {
      coralShooterMotor.set(com.ctre.phoenix.motorcontrol.ControlMode.PercentOutput, 0);
    }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
