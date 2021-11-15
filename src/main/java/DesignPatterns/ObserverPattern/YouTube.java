package DesignPatterns.ObserverPattern;

public class YouTube {
    public static void main(String[] args) {
        Channel tech = new Channel();
        Subscriber s1 = new Subscriber("yokesh");
        Subscriber s2 = new Subscriber("logan");
        Subscriber s3 = new Subscriber("james");
        Subscriber s4 = new Subscriber("kayla");

        tech.Subscribe(s1);
        tech.Subscribe(s2);
        tech.Subscribe(s3);
        tech.Subscribe(s4);

        tech.unSubscribe(s3);

        s1.subscribeChannel(tech);
        s2.subscribeChannel(tech);
        s3.subscribeChannel(tech);
        s4.subscribeChannel(tech);

        tech.upload("Design Patterns");
    }
}
