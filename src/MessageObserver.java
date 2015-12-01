import java.util.Hashtable;

import javax.swing.JOptionPane;

public class MessageObserver extends Observer {
	
	private static Hashtable<Integer, String> hmp = new Hashtable<Integer, String>();
	
	static {  
		hmp.put(1, "Clock's ticking!");
		hmp.put(2, "Coffee break?");
		hmp.put(3, "Take it easy!");
		hmp.put(4, "Lunch break!");
		hmp.put(5, "Go out for a walk, man!");
		}
	
	public MessageObserver(Subject sub) {
		// TODO Auto-generated constructor stub
		this.subject = sub;
		this.subject.registerObserver(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, hmp.get(this.subject.getState()));
	}
	
}
