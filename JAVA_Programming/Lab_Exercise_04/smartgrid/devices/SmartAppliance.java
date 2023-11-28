// SmartAppliance.java
package smartgrid.devices;

public class SmartAppliance implements Device {
    private boolean isTurnedOn;

    @Override
    public void turnOn() {
        isTurnedOn = true;
        System.out.println("Smart Appliance is now turned on.");
    }

    @Override
    public void turnOff() {
        isTurnedOn = false;
        System.out.println("Smart Appliance is now turned off.");
    }

    @Override
    public boolean isOn() {
        return isTurnedOn;
    }
}
