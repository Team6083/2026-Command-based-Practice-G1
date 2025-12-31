// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.CoralShooterSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class coralShooterCmd extends Command {
  private CoralShooterSubsystem coralShooterSubsystem;
  private CommandXboxController Controller;
  /** Creates a new coralShooterCmd. */
  public coralShooterCmd(CoralShooterSubsystem coralShooterSubsystem, CommandXboxController controller) {
    this.coralShooterSubsystem = coralShooterSubsystem;
    this.Controller = controller;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    coralShooterSubsystem.setShooterForword(Controller.x().getAsBoolean(), 0.5);
    coralShooterSubsystem.setShooterBackword(Controller.y().getAsBoolean(), -0.5);
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
