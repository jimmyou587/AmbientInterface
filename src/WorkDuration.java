import java.util.Calendar;

public class WorkDuration {
	private String label;
	private Calendar from, to;
	private int frequency;
	private int distance = 0, preDistance = 0;
	private boolean sound, vibration, isActive;
	private Subject sub;
	
	public WorkDuration(String label, Calendar from, Calendar to, int frequency, boolean sound,
			boolean vibration, boolean isActive) {
		this.setLabel(label);
		this.setFrom(from);
		this.setTo(to);
		this.setFrequency(frequency);
		this.setSound(sound);
		this.setVibration(vibration);
		this.setActive(isActive);
		this.sub = new Subject();
		this.sub.setState(0);
	}
	
	public Subject getSub() {
		return this.sub;
	}
	
	public void regSub(Observer ob) {
		this.sub.registerObserver(ob);
	}
	
	public void unRegSub(Observer ob) {
		this.sub.unRegisterObserver(ob);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Calendar getFrom() {
		return from;
	}

	public void setFrom(Calendar from) {
		this.from = from;
	}

	public Calendar getTo() {
		return to;
	}

	public void setTo(Calendar to) {
		this.to = to;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public boolean isSound() {
		return sound;
	}

	public void setSound(boolean sound) {
		this.sound = sound;
	}

	public boolean isVibration() {
		return vibration;
	}

	public void setVibration(boolean vibration) {
		this.vibration = vibration;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public void setDistance(Calendar curr) {
		
		this.distance = (int)((curr.getTime().getTime() - from.getTime().getTime()) / 1000);
		if (this.distance - this.preDistance >= this.frequency) {
			this.preDistance = this.distance;
			this.sub.setState(this.distance/this.frequency);
		}
		
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
}