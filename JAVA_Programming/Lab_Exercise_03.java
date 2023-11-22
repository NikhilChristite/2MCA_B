// Abstract class representing a generic device in a smart grid
abstract class SmartGridDevice {
    private String deviceId;

    public SmartGridDevice(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    // Abstract method to be implemented by subclasses
    public abstract void operate();

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: Operational");
    }
}

// Concrete class representing a smart meter, a type of SmartGridDevice
class SmartMeter extends SmartGridDevice {
    private int energyConsumed;

    public SmartMeter(String deviceId, int energyConsumed) {
        super(deviceId);
        this.energyConsumed = energyConsumed;
    }

    @Override
    public void operate() {
        System.out.println("Smart Meter is measuring energy consumption.");
    }

    public void displayEnergyConsumed() {
        System.out.println("Energy Consumed: " + energyConsumed + " kWh");
    }
}

// Concrete class representing a smart appliance, another type of SmartGridDevice
final class SmartAppliance extends SmartGridDevice {
    private String applianceType;

    public SmartAppliance(String deviceId, String applianceType) {
        super(deviceId);
        this.applianceType = applianceType;
    }

    @Override
    public void operate() {
        System.out.println("Smart Appliance is performing its function.");
    }

    public void displayApplianceType() {
        System.out.println("Appliance Type: " + applianceType);
    }
}

// Driver class to test the SmartGridDevice hierarchy
public class SmartGridSystem {
    public static void main(String[] args) {
        SmartMeter smartMeter = new SmartMeter("SM001", 150);
        SmartAppliance smartAppliance = new SmartAppliance("SA001", "Refrigerator");

        smartMeter.operate();
        smartMeter.displayStatus();
        smartMeter.displayEnergyConsumed();

        System.out.println();

        smartAppliance.operate();
        smartAppliance.displayStatus();
        smartAppliance.displayApplianceType();
    }
}
