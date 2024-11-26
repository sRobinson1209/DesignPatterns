public class BasicNotifier  implements  Notifier{
    @Override
    public void send(String message){
        System.out.println("Basic Notifivation: "+ message);
    }

}
