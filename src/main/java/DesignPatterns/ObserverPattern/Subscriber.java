package DesignPatterns.ObserverPattern;

public class Subscriber {
    private final String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Hey "+name + ", Video Uploaded !" +channel.title);
    }
    public void subscribeChannel(Channel ch){
        channel = ch;
    }

}
