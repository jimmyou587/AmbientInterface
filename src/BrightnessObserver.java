import java.util.Hashtable;;

public class BrightnessObserver extends Observer {
	
private static Hashtable<Integer, String> hmp = new Hashtable<Integer, String>();
	
	static {  
		hmp.put(1, "Clock's ticking!");
		hmp.put(2, "Coffee break?");
		hmp.put(3, "Take it easy!");
		hmp.put(4, "Lunch break!");
		hmp.put(5, "Go out for a walk, man!");
		}
	
	public BrightnessObserver(Subject sub) {
		this.subject = sub;
		this.subject.registerObserver(this);
	}
	
	@Override
	public void update() {
		
//		update Brightness
		System.out.println("Brightness Observer observes the state is now: " + subject.getState());
		
	}
	
}
