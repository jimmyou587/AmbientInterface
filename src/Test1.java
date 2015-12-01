public class Test1 { 

    static {
        //System.loadLibrary("HelloWorld");
        System.load("D:/Fresno data/Human Computer Interaction/Ambient assignment/Brightness/Brightness.dll");
		
    }

    public native void SetBrightness(int a);

    public static void main (String[] args) {
        Test1 t = new Test1();
        t.SetBrightness(255);
    }
}