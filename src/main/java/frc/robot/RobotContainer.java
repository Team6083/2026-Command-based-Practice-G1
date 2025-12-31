// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants.XboxController;
import frc.robot.subsystems.TankSubsystem;
import frc.robot.commands.TankCmd;


public class RobotContainer {
  TankCmd tankcmd;
  TankSubsystem tanksubsystem;
  CommandXboxController controller;

  public RobotContainer() {
    controller = new CommandXboxController(XboxController.XboxControllerPort);
    tanksubsystem = new TankSubsystem();
    configureBindings();
  }

  private void configureBindings() {
    tanksubsystem.setDefaultCommand(new TankCmd(tanksubsystem, controller));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
