package dialerpluspro;

public class DialerPro {
    public InfoCall dial(User usuer) {
        System.out.println("Start dialing ...");
        try { Thread.sleep(5000); } catch (Exception ex) {}
        return new InfoCall();
    }
    public InfoCall playMessage(InfoCall infoCall) {
        System.out.println("Start playing message ...");
        try { Thread.sleep(5000); } catch (Exception ex) {}
        return infoCall;
    }
    public InfoCall hangup(InfoCall infoCall) {
        System.out.println("Start hanging out ...");
        try { Thread.sleep(5000); } catch (Exception ex) {}
        return infoCall;
    }
}
