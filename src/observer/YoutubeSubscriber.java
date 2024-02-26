package observer;

public class YoutubeSubscriber implements Observer{
    private String name;

    public YoutubeSubscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void notifyMe(String youtubeChannel, YoutubeEvent event) {
        System.out.println("Dear " + getName() + ", Notification from " + youtubeChannel + ": " + event);
    }
}
