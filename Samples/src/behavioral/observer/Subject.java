package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers=new ArrayList<Observer>();
	private int state;
	
	public void setState(int state) {
		this.state=state;
		notifyAllObservers();
	}
	
	public int getState() {
		return state;
	}
	
	public void notifyAllObservers() {
		for(Observer observerObj:observers) {
			observerObj.update();
		}
	}
	
	public void attach(Observer observerInst) {
		observers.add(observerInst);
	}
}
