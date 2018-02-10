// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1591.Powerup;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_TalonSRX driveTrainleftTalon;
    public static WPI_TalonSRX driveTrainrightTalon;
    public static RobotDrive driveTrainrobotDrive;
    public static AnalogPotentiometer liftpot;
    public static WPI_TalonSRX liftliftTalon;
    public static SpeedController clampclampSpark;
    public static DigitalInput clamprightPincherClosed;
    public static DigitalInput clampleftPincherClosed;
    public static DigitalInput clampblockIn;
    public static SpeedController elevatorelevatorSpark;
    public static Ultrasonic sensorssonicLeft;
    public static Ultrasonic sensorssonicRight;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainleftTalon = new WPI_TalonSRX(5);
        
        
        driveTrainrightTalon = new WPI_TalonSRX(7);
        
        
        driveTrainrobotDrive = new RobotDrive(driveTrainleftTalon, driveTrainrightTalon);
        
        driveTrainrobotDrive.setSafetyEnabled(true);
        driveTrainrobotDrive.setExpiration(0.1);
        driveTrainrobotDrive.setSensitivity(0.5);
        driveTrainrobotDrive.setMaxOutput(1.0);

        driveTrainrobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        liftpot = new AnalogPotentiometer(0, 270.0, -135.0);
        LiveWindow.addSensor("Lift", "pot", liftpot);
        
        liftliftTalon = new WPI_TalonSRX(3);
        
        
        clampclampSpark = new Spark(1);
        LiveWindow.addActuator("clamp", "clampSpark", (Spark) clampclampSpark);
        clampclampSpark.setInverted(false);
        clamprightPincherClosed = new DigitalInput(2);
        LiveWindow.addSensor("clamp", "rightPincherClosed", clamprightPincherClosed);
        
        clampleftPincherClosed = new DigitalInput(1);
        LiveWindow.addSensor("clamp", "leftPincherClosed", clampleftPincherClosed);
        
        clampblockIn = new DigitalInput(0);
        LiveWindow.addSensor("clamp", "blockIn", clampblockIn);
        
        elevatorelevatorSpark = new Spark(2);
        LiveWindow.addActuator("elevator", "elevatorSpark", (Spark) elevatorelevatorSpark);
        elevatorelevatorSpark.setInverted(false);
        sensorssonicLeft = new Ultrasonic(5, 6);
        LiveWindow.addSensor("sensors", "sonicLeft", sensorssonicLeft);
        
        sensorssonicRight = new Ultrasonic(7, 8);
        LiveWindow.addSensor("sensors", "sonicRight", sensorssonicRight);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
