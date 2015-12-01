import javax.swing.JOptionPane;

public class SoundObserver extends Observer {
	
	SoundObserver(Subject sub) {
		this.subject = sub;
		this.subject.registerObserver(this);
	}
	
	@Override
	public void update() {
		
//		Update sound
		System.out.println("Sound Observer observes the state is now: " + subject.getState());
		JOptionPane.showMessageDialog(null, "Hello");
		
	}
	
}
