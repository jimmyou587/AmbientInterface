
public class BrightnessObserver extends Observer {
	
	BrightnessObserver(Subject sub) {
		this.subject = sub;
	}
	
	@Override
	public void update() {
		
//		update Brightness
		System.out.println("Brightness Observer observes the state is now: " + subject.getState());
		
	}
	
}
