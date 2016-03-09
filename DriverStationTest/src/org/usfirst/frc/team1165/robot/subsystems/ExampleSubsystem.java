
package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.commands.ExampleCommand;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ExampleSubsystem extends Subsystem
{
	private DriverStation driverStation;
	
	
	public ExampleSubsystem()
	{
		driverStation = DriverStation.getInstance();
	}
	
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand()
	{
		setDefaultCommand(new ExampleCommand());
	}
	
	public void report()
	{
		SmartDashboard.putBoolean("Autonomous", driverStation.isAutonomous());
		SmartDashboard.putBoolean("Teleop", driverStation.isOperatorControl());
		SmartDashboard.putNumber("Match Time", driverStation.getMatchTime());
	}
}
