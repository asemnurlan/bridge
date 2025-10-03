public class WiFi implements Control{
    @Override
    public void sendCommand(String device, String command) {
        System.out.println("Sending via WiFi: "+device+" "+command);
    }
}
