package ElevatorController;

import java.util.ArrayList;
import java.util.List;

public class Controller {

	// TODO: implement attributes
	// TODO: implement methods
	private ElevatorState state;
	
	private int nextStop;
	
	private int currentFloor;
	private List<Integer> pool;

	public Controller(int currentFloor) {
		this.currentFloor = currentFloor;
		pool = new ArrayList<>();
		state = new IdleState();
	}

	public void request(int floor) {
		pool.add(floor);
		getState().request(floor, this);
		
	}

	public void signal(int floor) {
	
		getState().signal(floor, this);
		
		// TODO
	}

	public ElevatorState getState() {
		
		// TODO
		return this.state;
	}
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	
	public List<Integer> getPool() {
		return pool;
	}
	
	
	public void setState(ElevatorState state) {
		this.state = state;
	}
	
	public int  getNextStop() {
		return nextStop;
	}
	
	public void setNextStop(int nextStop) {
		this.nextStop = nextStop;
	}
	
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
}
