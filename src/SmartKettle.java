public class SmartKettle extends SmartDevice{
    public SmartKettle(Control control, String deviceName){
        super(control,deviceName);

    }

    @Override
    public void turnOn() {
        control.sendCommand(deviceName,"turn on to boil water");
    }

    @Override
    public void turnOff() {
        control.sendCommand(deviceName, "turn off");
    }
}
