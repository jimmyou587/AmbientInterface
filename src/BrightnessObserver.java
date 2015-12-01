import java.util.HashMap;

public class BrightnessObserver extends Observer {
	
	static HashMap<Integer, String> hm = new HashMap<Integer, String>() {{
		put(1, "");
		put(2, "");
		put(3, "");
		put(4, "");
		put(5, "");
	}};
	
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
