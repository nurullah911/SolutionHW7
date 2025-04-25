package Mediator;

public class ControlTower implements Tower {
    private Aircraft runwayUser = null;

    @Override
    public synchronized void send(String msg, Aircraft sender) {
        switch (msg) {
            case "MAYDAY":
                System.out.println(sender.id + " declares EMERGENCY! Clearing runway—everyone hold.");
                if (runwayUser != null) runwayUser.receive("RUNWAY CLEARED");
                runwayUser = sender;
                sender.receive("EMERGENCY LANDING CLEARED");
                break;

            case "REQUEST_LAND":
                if (runwayUser == null) {
                    runwayUser = sender;
                    sender.receive("LANDING CLEARED");
                } else {
                    sender.receive("HOLD for LANDING; runway busy by " + runwayUser.id);
                }
                break;

            case "REQUEST_TAKEOFF":
                if (runwayUser == null) {
                    runwayUser = sender;
                    sender.receive("TAKE-OFF CLEARED");
                } else {
                    sender.receive("HOLD for TAKE-OFF; runway busy by " + runwayUser.id);
                }
                break;

            case "DONE":
                System.out.println(sender.id + " done—runway now free.");
                runwayUser = null;
                break;

            default:
                break;
        }
    }
}
