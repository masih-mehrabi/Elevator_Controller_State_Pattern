package de.tum.in.ase.pse;

public class IdleState extends ElevatorState {
	
	
	public IdleState() {
		setName("Idle");
	}
	@Override
	public void request(int floor, Controller controller) {
	controller.setNextStop(floor);
	controller.setState(new MovingState());
	}
	
	@Override
	public void signal(int floor, Controller controller) {
	
	}
}
