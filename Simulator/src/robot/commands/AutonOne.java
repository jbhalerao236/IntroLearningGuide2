package robot.commands;

import robot.RobotMap.Direction;
import simulator.CommandGroup;

public class AutonOne extends CommandGroup {
 public static final int SECONDS_TO_DRIVE_FOR = 5;
 public static final double TURN_DISTANCE = 4.0;
	public AutonOne() {
		this.addSequential(new DriveFor(SECONDS_TO_DRIVE_FOR, Direction.FORWARD)); 
		this.addSequential(new DriveFor(SECONDS_TO_DRIVE_FOR, Direction.BACKWARD));
		this.addSequential(new DriveFor(SECONDS_TO_DRIVE_FOR, Direction.FORWARD)); 
        this.addSequential(new DriveFor(SECONDS_TO_DRIVE_FOR, Direction.BACKWARD));
		this.addSequential(new TurnFor(SECONDS_TO_DRIVE_FOR, Direction.RIGHT));
	}
}
 