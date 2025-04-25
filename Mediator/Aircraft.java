package Mediator;

public abstract class Aircraft {
    final String id;
    final Tower tower;
    Aircraft(String id, Tower tower) { this.id = id; this.tower = tower; }
    void send(String msg) { tower.send(msg, this); }
    abstract void receive(String msg);
}


