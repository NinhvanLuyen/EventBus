package kenhlaptrinh.net.mytrackcharging.eventbus.events;

import kenhlaptrinh.net.mytrackcharging.eventbus.BaseEvent;

/**
 * Created by ninhvanluyen on 8/22/17.
 */

public class ChargeEvent extends BaseEvent {
    private String time;
    @Override
    public int getEventType() {
        return 0;
    }
    public String getChargeTime()
    {
        return time;
    }
    public void setTime(String time)
    {
        this.time =time;
    }

}
