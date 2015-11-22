import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RestExecuter {
	
	public static void main(String[] args) throws ParseException {
		
		DateFormat format = new SimpleDateFormat("yyMMddHHmmssZ");
		Date from = format.parse("151121143500-0800");
		Date to = format.parse("151121150000-0800");
		WorkDurationSubject sub = new WorkDurationSubject("Rest1", from, to, 2, false, false, false);
		Observer brObserver = new BrightnessObserver(sub);
		Observer sndObserver = new SoundObserver(sub);
		sub.registerObserver(brObserver);
		sub.registerObserver(sndObserver);
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date curr = new Date();
			sub.setDistance(curr);
		}
		
	}
	
}
