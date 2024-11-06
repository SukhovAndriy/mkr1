package mkr1;
public class Main {
    public static void main(String[] args) {
        Message message = new TextMessage("Якийсь текст    для   прикладу.");
        System.out.println("Оригінальне повідомлення: " + message.getText());

        message = new CompressedMessage(message);
        System.out.println("Після стискання: " + message.getText());

        message = new EncryptedMessage(message);
        System.out.println("Після шифрування: " + message.getText());

        message = new TimeMessage(message);
        System.out.println("Після додавання дати та часу: " + message.getText());

        message = new NameMessage(message);
        System.out.println("Після додавання автора: " + message.getText());
    }
}
