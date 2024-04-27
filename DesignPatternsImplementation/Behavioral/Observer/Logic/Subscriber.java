package DesignPatternsImplementation.Observer.Logic;

public class Subscriber {
    private String subscriberName;

    public Subscriber(String subscriberName){
        this.subscriberName = subscriberName;
    }

    public void sendNotification(String videoName, String videoContent){
        System.out.println("To Subscriber: " + subscriberName + " Video: " + videoName + " Has been uploaded with content: " + videoContent);
    }
}
