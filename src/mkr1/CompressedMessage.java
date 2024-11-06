package mkr1;
public class CompressedMessage extends MessageDecorator {
    public CompressedMessage(Message message) {
        super(message);
    }
    @Override
    public String getText() {
        return compressText(super.getText());
    }
    private String compressText(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }
}

