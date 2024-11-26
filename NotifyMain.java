public class NotifyMain {
    public static void main(String[] args){
        Notifier basicNotifier = new BasicNotifier();
        Notifier smsNotifier = new SMSNotifier(basicNotifier);
        Notifier emailAndSlackNotifier = new SlackNotifier(new EmailNotifier(smsNotifier));

        emailAndSlackNotifier.send("System update: hello everyone :)");

        Notifier emailSlackNotifier = new EmailNotifier(new SlackNotifier(new BasicNotifier()));
        emailSlackNotifier.send("Hello Everyone!");

        Notifier emailNotifier = new EmailNotifier(new SlackNotifier(new BasicNotifier()));
        emailNotifier.send("The quick brown fox jumps over the lazy dog.");

    }
}
