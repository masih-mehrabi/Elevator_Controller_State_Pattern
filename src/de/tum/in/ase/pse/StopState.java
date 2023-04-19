package de.tum.in.ase.pse;


public class StopState extends ElevatorState {
	
	public StopState() {
		
		setName("Stop");
		
	}
	
	
	@Override
	public void request(int floor, Controller controller) {
	
	
	}
	
	@Override
	public void signal(int floor, Controller controller) {
		
		if (controller.getPool().size() ==  0) {
			controller.setState(new IdleState());
			controller.setCurrentFloor(floor);
		}  else {
				controller.setState(new MovingState());
			controller.setNextStop(controller.getPool().get(0));
		}
		
	}
}
