
public class SoundObserver extends Observer {
	
	SoundObserver(Subject sub) {
		this.subject = sub;
	}
	
	@Override
	public void update() {
		
//		Update sound
		System.out.println("Sound Observer observes the state is now: " + subject.getState());
		
	}
	
}
