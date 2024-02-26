package observer;

public class ObserverMain {
    public static void main(String[] args) throws InterruptedException {
        YoutubeChannel myChannel = new YoutubeChannel("MyChannel");

        Observer john = new YoutubeSubscriber("John");
        Observer bob = new YoutubeSubscriber("Bob");
        Observer tom = new YoutubeSubscriber("Tom");

        myChannel.addSubscriber(john);
        myChannel.addSubscriber(bob);
        myChannel.addSubscriber(tom);

        myChannel.notifyAllSubscribers(new YoutubeEvent(EventType.NEW_VIDEO, "Design patterns"));
        myChannel.removeSubscriber(tom);
        System.out.println();
        Thread.sleep(5000);
        myChannel.notifyAllSubscribers(new YoutubeEvent(EventType.LIVE_STREAM, "JAVA for beginners"));

    }
}
