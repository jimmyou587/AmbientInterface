import java.util.Hashtable;;

public class BrightnessObserver extends Observer {
	
private static Hashtable<Integer, Integer> hmp = new Hashtable<Integer, Integer>();
static {
    //System.loadLibrary("HelloWorld");
    System.load("D:/Fresno data/Human Computer Interaction/Ambient assignment/Brightness/Brightness.dll");
		
}

	
	static {  
		hmp.put(1, 255);
		hmp.put(2, 180);
		hmp.put(3, 112);
		hmp.put(4, 80);
		hmp.put(5, 0);
		}
//	public native void SetBrightness(int a);
	
	public BrightnessObserver(Subject sub) {
		this.subject = sub;
		this.subject.registerObserver(this);
	}
	Test1 t = new Test1();
	@Override
	public void update() {
		
//		update Brightness
	    t.SetBrightness(hmp.get(this.subject.getState()));
		
	}
	
}
