# EventBus
Event Bus is library for broadcast event in app.

## Getting Started

Event Bus is a model publish/subscribe broadcast event.
Simplity for comunity betweent component Activity, Fragment, Services, Broadcast Receiver,v.v.v

### EventBus On Two Steps

Step 1: Clone source and copy to your project

```
https://github.com/NinhvanLuyen/EventBus.git
```
Step 2: Using :

1. Create awesome your event extends BaseEvent :
Example ChargeEvent:
```
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
```
2. Post Event:
Example here is Receiver for listent event Charging. And when you plugin charge to your phone this will be broadcast event charge for all Component has registed this.
```
public class ReceiverCharging extends BroadcastReceiver
{
    private Bus eventBus = EventBus.getInstance();

    @Override
    public void onReceive(Context context, Intent intent) {
        ChargeEvent chargeEvent =new ChargeEvent();
        chargeEvent.setTime("10:13");
        eventBus.post(chargeEvent);

    }
}
```

3.  Regist Listener for event:
Example in my MainActivity :
```

public class MainActivity extends AppCompatActivity {

    private Bus evenbus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        evenbus = EventBus.getInstance();
        evenbus.register(this);


    }

    @Subscribe
    public void onEvent(BaseEvent event) {
        if (event instanceof ChargeEvent)
        {
            ChargeEvent charge = (ChargeEvent) event;
            Toast.makeText(this,"charge"+charge.getChargeTime(),Toast.LENGTH_LONG).show();
        }

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        evenbus.unregister(this);
    }
}
```

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

## Versioning

v1.0

## Authors

* **JakeWharton** - 
See also the list of [contributors](https://github.com/square/okio) who participated in this project.
* **LuyenNinh**- Editor.


