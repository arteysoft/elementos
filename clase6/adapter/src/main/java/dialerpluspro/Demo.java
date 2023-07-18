package dialerpluspro;

public class Demo implements Runnable {
    public void run() {
        DialerPro dialerPro = new DialerPro();

        InfoCall infoCall = dialerPro.dial(new User());
        dialerPro.playMessage(infoCall);
        dialerPro.hangup(infoCall);
    }
}
