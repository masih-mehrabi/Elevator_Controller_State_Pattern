package de.tum.in.ase.pse;

public class MovingState extends ElevatorState {
	
	
	public MovingState() {
		setName("Moving");
	}
	
	@Override
	public void request(int floor, Controller controller) {
		controller.setNextStop(controller.getPool().get(0));
	}
	@Override
	public void signal(int floor, Controller controller) {
		if (controller.getNextStop() == floor) {
			controller.setState(new StopState());
			controller.setCurrentFloor(controller.getNextStop());
			controller.getPool().remove(Integer.valueOf(floor));
		}
	}
}
