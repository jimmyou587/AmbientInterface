import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

@SuppressWarnings("restriction")
public class SoundObserver extends Observer {
	private static String filePath = "/Users/LO/Documents/workspace/AmbientInterface/src/beep.wav"; 
		
	SoundObserver(Subject sub) {
		this.subject = sub;
		this.subject.registerObserver(this);
	}
	
	@Override
	public void update() {
		
//		Update sound
	 
	    // create an audiostream from the inputstream
	    AudioStream audioStream = null;
		try {
			audioStream = new AudioStream(new FileInputStream(filePath));
			AudioData data = audioStream.getData();
			ContinuousAudioDataStream cas = new ContinuousAudioDataStream (data);
			AudioPlayer.player.start(cas);
			 
		   	try {
				Thread.sleep(1000 * this.subject.getState());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    	
		   	AudioPlayer.player.stop(cas);
		   	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	}
	
}
