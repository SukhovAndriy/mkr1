package mkr1;
public class NameMessage extends MessageDecorator {
    public NameMessage(Message message) {
        super(message);
    }
    @Override
    public String getText() {
        return addAuthor(super.getText());
    }
    private String addAuthor(String text) {
        return text + " - Автор: Сухов Андрій";
    }
}

