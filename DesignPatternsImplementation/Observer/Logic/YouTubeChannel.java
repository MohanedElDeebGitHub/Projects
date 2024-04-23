package DesignPatternsImplementation.Observer.Logic;

import java.util.*;

// YouTube follows the Singleton Design Pattern aswell

public class YouTubeChannel {
    private List<Subscriber> subscribers;
    private static YouTubeChannel youTube;

    private YouTubeChannel(){
        this.subscribers = new ArrayList();
    }

    public static YouTubeChannel getOrCreateInstance(){
        if(youTube == null){
            youTube = new YouTubeChannel();
            
            System.out.println("Instance created successfully.");
        }else{
            System.out.println("YouTube instance has already been created before.");
        }

        return youTube;
    }

    public void createVideo(String videoName, String videoContent){
        System.out.println("Video created successfully.");
    
        notifySubscribers(videoName, videoContent);
    }

    public void addSubscriber(Subscriber subscriber){
        if(!subscribers.contains(subscriber)){
            subscribers.add(subscriber);
        }
    }

    private void notifySubscribers(String videoName, String videoContent){
        for(Subscriber subscriber : subscribers){
            subscriber.sendNotification(videoName, videoContent);
        }
    }

}
