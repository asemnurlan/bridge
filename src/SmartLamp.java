public class SmartLamp extends SmartDevice {

    public SmartLamp(Control control,String deviceName){
        super(control,deviceName);
    }

    @Override
    public void turnOn() {
        control.sendCommand(deviceName,"Turn On for light");
    }

    @Override
    public void turnOff() {
        control.sendCommand(deviceName,"turn off");
    }
}
