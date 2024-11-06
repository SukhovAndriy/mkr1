package mkr1;
public class TextMessage implements Message {
    private String text;
    public TextMessage(String text) {
        this.text = text;
    }
    @Override
    public String getText() {
        return text;
    }
}

