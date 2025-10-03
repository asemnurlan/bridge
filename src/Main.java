//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Control wifi=new WiFi();
        SmartDevice lamp=new SmartLamp(wifi,"living room");
        lamp.turnOn();
        lamp.turnOff();

        Control bluetooth=new Bluetooth();
        SmartDevice kettle=new SmartKettle(bluetooth,"kitchen");
        kettle.turnOn();
        kettle.turnOff();
    }
}