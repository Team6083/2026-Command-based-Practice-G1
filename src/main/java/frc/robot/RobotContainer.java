// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.TankCmd;
import frc.robot.commands.climberCmd;
import frc.robot.commands.coralShooterCmd;
import frc.robot.subsystems.ClimberSubsystem;
import frc.robot.subsystems.CoralShooterSubsystem;
import frc.robot.subsystems.TankSubsystem;
import frc.robot.Constants.XboxController;

public class RobotContainer {
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
    coralShooterSubsystem.setDefaultCommand(new coralShooterCmd(coralShooterSubsystem, controller));
    controller.a().onTrue(new climberCmd(climberSubsystem));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
