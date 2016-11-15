package robot.commands;

import robot.RobotMap.Direction;
import simulator.CommandGroup;

public class AutonTwo extends CommandGroup {
 public static final int SECONDS_TO_DRIVE_FOR = 5;
 public static final double TURN_DISTANCE = 2.35;
	public AutonTwo() {
		this.addSequential(new TurnFor(TURN_DISTANCE, Direction.LEFT));
		this.addSequential(new DriveFor(SECONDS_TO_DRIVE_FOR, Direction.FORWARD));
		this.addSequential(new TurnFor(TURN_DISTANCE, Direction.RIGHT));
		this.addSequential(new DriveFor(SECONDS_TO_DRIVE_FOR, Direction.FORWARD));
	}
}
 