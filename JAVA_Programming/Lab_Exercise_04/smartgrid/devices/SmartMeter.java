// SmartMeter.java
package smartgrid.devices;

public class SmartMeter implements Device {
    private boolean isRunning;

    @Override
    public void turnOn() {
        isRunning = true;
        System.out.println("Smart Meter is now running.");
    }

    @Override
    public void turnOff() {
        isRunning = false;
        System.out.println("Smart Meter is now turned off.");
    }

    @Override
    public boolean isOn() {
        return isRunning;
    }
}
