package kenhlaptrinh.net.mytrackcharging.eventbus;

import kenhlaptrinh.net.mytrackcharging.eventbus.Bus;

public final class EventBus {
    private static final Bus BUS = new Bus();
    public static Bus getInstance() {
        return BUS;
    }
    private EventBus() {
        // No instances.
    }
}