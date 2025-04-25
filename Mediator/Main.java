package Mediator;

public class Main {
    public static void main(String[] args) {
        ControlTower tower = new ControlTower();
        Aircraft a1 = new Plane("P1", tower);
        Aircraft a2 = new Plane("P2", tower);
        Aircraft h1 = new Helicopter("H1", tower);

        a1.send("REQUEST_LAND");
        a2.send("REQUEST_LAND");
        h1.send("REQUEST_TAKEOFF");


        a2.send("MAYDAY");

    }
}
