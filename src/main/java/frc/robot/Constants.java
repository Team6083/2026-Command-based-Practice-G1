package frc.robot;

public final class Constants {
  public static final class tankConstants {
    public static final int leftMotorSPX = 31;
    public static final int leftMotorSRX = 32;
    public static final int rightMotorSPX = 33;
    public static final int rightMotorSRX = 34;
  }

  public static final class shooterConstants {
    public static final int shooterMotorSPX = 21;
  }

  public static final class climberConstants {
    public static final int climberMotorSPX = 22;
    public static final int climberEncoderA = 9;
    public static final int climberEncoderB = 8;
    public static final int climberLimitSwitch = 0;
  }

  public static final class XboxController {
    public static final int XboxControllerPort = 0;
  }

  public static final class climberPID {
    public static final double kP = 0.1;
    public static final double kI = 0.0;
    public static final double kD = 0.0;
  }
}
