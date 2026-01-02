// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants.XboxController;
import frc.robot.commands.ClimberCmd;
import frc.robot.commands.CoralShooterCmd;
import frc.robot.commands.TankCmd;
import frc.robot.subsystems.ClimberSubsystem;
import frc.robot.subsystems.CoralShooterSubsystem;
import frc.robot.subsystems.TankSubsystem;

public class RobotContainer {
  TankCmd tankcmd;
  TankSubsystem tanksubsystem;
  CoralShooterSubsystem coralShooterSubsystem;
  CommandXboxController controller;
  ClimberSubsystem climberSubsystem;

  public RobotContainer() {
    controller = new CommandXboxController(XboxController.XboxControllerPort);
    tanksubsystem = new TankSubsystem();
    coralShooterSubsystem = new CoralShooterSubsystem();
    climberSubsystem = new ClimberSubsystem();
    configureBindings();
  }

  private void configureBindings() {
    tanksubsystem.setDefaultCommand(new TankCmd(tanksubsystem, controller));
    coralShooterSubsystem.setDefaultCommand(new CoralShooterCmd(coralShooterSubsystem, controller));
    controller.a().onTrue(new ClimberCmd(climberSubsystem));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
