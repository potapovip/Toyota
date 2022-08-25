package detail;

public class Usb extends DetailWithBrokenState {
    public Usb() {
        super(false);
    }
    public void deviceConnected(){
        System.out.println("Device connected");
    }
}
