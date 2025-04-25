package Mediator;

public class Helicopter extends Aircraft {
    Helicopter(String id, Tower t) { super(id, t); }
    @Override void receive(String msg) {
        System.out.println(id + " (heli) hears: " + msg);
        if (msg.endsWith("CLEARED")) send("DONE");
    }
}