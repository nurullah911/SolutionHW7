package Mediator;

public class Plane extends Aircraft {
    Plane(String id, Tower t) {
        super(id, t);
    }

    @Override
    void receive(String msg) {
        System.out.println(id + " hears: " + msg);
        if (msg.endsWith("CLEARED")) send("DONE");
    }
}