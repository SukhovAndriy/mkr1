package mkr1;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TimeMessage extends MessageDecorator {
    public TimeMessage(Message message) {
        super(message);
    }
    @Override
    public String getText() {
        return addTimestamp(super.getText());
    }
    private String addTimestamp(String text) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "[" + formatter.format(new Date()) + "] " + text;
    }
}

