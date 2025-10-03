public abstract class SmartDevice {
    public Control control;
    public String deviceName;

    public SmartDevice(Control control, String deviceName){
        this.control=control;
        this.deviceName=deviceName;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
