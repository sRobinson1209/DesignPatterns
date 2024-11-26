public class SMSNotifier extends NotifierDecorator{
    public SMSNotifier(Notifier notifier){
        super(notifier);
    }

    @Override
    public void send(String message){
        super.send(message);
        sendSMS(message);
    }

    private void sendSMS(String message){
        System.out.println("SMS Notification: "+ message);
    }
}
