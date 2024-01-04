import java.util.List;
import java.util.function.Consumer;

public class SmartGridSystem {
    public static void main(String[] args) {
        List<Device> devices = List.of(
                new Device("SmartMeter", true, 10),
                new Device("Thermostat", true, 5),
                new Device("LightBulb", false, 8)
        );

        // Using lambda expression to print the details of active devices
        performOperation(devices, device -> {
            if (device.isActive()) {
                System.out.println("Active Device: " + device);
            }
        });

        // Using lambda expression to turn off all devices
        performOperation(devices, device -> device.setActive(false));

        // Print all devices after turning them off
        System.out.println("Devices after turning off:");
        performOperation(devices, device -> System.out.println(device));
    }

    // A generic method that performs an operation on a list of devices using a lambda expression
    private static void performOperation(List<Device> devices, Consumer<Device> operation) {
        for (Device device : devices) {
            operation.accept(device);
        }
    }
}

class Device {
    private String name;
    private boolean isActive;
    private int powerConsumption;

    // Constructor
    public Device(String name, boolean isActive, int powerConsumption) {
        this.name = name;
        this.isActive = isActive;
        this.powerConsumption = powerConsumption;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    // Setter methods (if needed)
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", isActive=" + isActive +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
}
