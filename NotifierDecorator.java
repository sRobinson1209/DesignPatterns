import javax.management.openmbean.InvalidOpenTypeException;
import java.util.Map;

public class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier){
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message){
        wrappedNotifier.send(message);
    }
}
