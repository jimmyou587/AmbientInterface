import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RestExecuter {
	
	public static void main(String[] args) throws ParseException {
		
		DateFormat format = new SimpleDateFormat("yyMMddHHmmssZ");
		Date from = format.parse("151129170000-0800");
		Date to = format.parse("151129170800-0800");
		WorkDuration wd = new WorkDuration("Rest1", from, to, 2, false, false, false);
		Observer brObserver = new BrightnessObserver(wd.getSub());
		Observer sndObserver = new SoundObserver(wd.getSub());
		wd.regSub(brObserver);
		wd.regSub(sndObserver);
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date curr = new Date();
			wd.setDistance(curr);
		}
		
	}
	
}
