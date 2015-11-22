import java.util.Date;

public class WorkDurationSubject extends Subject {
	private String label;
	private Date from, to;
	private int frequency;
	private int distance = 0;
	private boolean sound, vibration, isActive;
	
	public WorkDurationSubject(String label, Date from, Date to, int frequency, boolean sound,
			boolean vibration, boolean isActive) {
		this.setLabel(label);
		this.setFrom(from);
		this.setTo(to);
		this.setFrequency(frequency);
		this.setSound(sound);
		this.setVibration(vibration);
		this.setActive(isActive);
		this.setState(0);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
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
	
	public void setDistance(Date curr) {
		
		this.distance = (int)((curr.getTime() - from.getTime()) / 1000);
		this.setState(this.distance/this.frequency);
		
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
}