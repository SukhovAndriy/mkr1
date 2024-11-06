package mkr1;
public class EncryptedMessage extends MessageDecorator {
    public EncryptedMessage(Message message) {
        super(message);
    }
    @Override
    public String getText() {
        return encryptText(super.getText());
    }
    private String encryptText(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
