public class Bluetooth implements Control{
    @Override
    public void sendCommand(String device, String command) {
        System.out.println("Sending via bluetooth: "+device+" "+command);
    }
}
