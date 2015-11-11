import java.util.ArrayList;

public class Subject {
	
	public int state;
	public ArrayList<Observer> observers = new ArrayList<Observer>();;
	
	public void registerObserver(Observer ob) {
		observers.add(ob);
	}
	
	public void unRegisterObserver(Observer ob) {
		observers.remove(ob);
	}
	
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
	public void setState(int s) {
		
		state = s;
		notifyAllObservers();
		
	}
	
	public int getState() {
		
		return state;
		
	}
	
}