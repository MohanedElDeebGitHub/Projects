package DesignPatternsImplementation.Observer;

import DesignPatternsImplementation.Observer.Logic.Subscriber;
import DesignPatternsImplementation.Observer.Logic.YouTubeChannel;

public class App {
    public static void main(String[] args) {
        YouTubeChannel channel = YouTubeChannel.getOrCreateInstance();
        
        Subscriber sub1 = new Subscriber("Name1");
        Subscriber sub2 = new Subscriber("Name2");
        Subscriber sub3 = new Subscriber("Name3");

        channel.addSubscriber(sub1);
        channel.addSubscriber(sub2);
        channel.addSubscriber(sub3);

        channel.createVideo("Video Title", "Video Content");
    }
}
