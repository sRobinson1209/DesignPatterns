public class SlackNotifier extends NotifierDecorator{
    public SlackNotifier(Notifier notifier){
        super(notifier);
    }
    @Override
    public void send(String message){
        super.send(message);
    }
    private void sendSlackMessage(String message){
        System.out.println("Slack Notification: "+ message);
    }
}
