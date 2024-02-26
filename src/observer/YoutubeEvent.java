package observer;

public class YoutubeEvent {
    private EventType eventType;
    private String topic;

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public YoutubeEvent(EventType eventType, String topic) {
        this.eventType = eventType;
        this.topic = topic;
    }


    @Override
    public String toString() {
        return eventType.name() + " on " +  topic;
    }
}
