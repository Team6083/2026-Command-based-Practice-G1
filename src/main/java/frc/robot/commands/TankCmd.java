// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.TankSubsystem;
import frc.robot.Constants.XboxController;
/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class TankCmd extends Command {
  private TankSubsystem tankSubsystem;
  CommandXboxController joy = new CommandXboxController(XboxController.XboxController); // Replace 0 with the appropriate port number

  public TankCmd(TankSubsystem tankSubsystem) {
    this.tankSubsystem = tankSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(tankSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  @Override
  public void execute() {
    // Example usage of tankSubsystem
    tankSubsystem.setTankSpeed(joy.getLeftY(), joy.getRightY()); // Replace with actual logic
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
