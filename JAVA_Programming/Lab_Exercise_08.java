import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Define a SmartDevice class to represent individual devices in the Smart Grid
class SmartDevice {
    private String deviceId;
    private String deviceType;

    public SmartDevice(String deviceId, String deviceType) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "deviceId='" + deviceId + '\'' +
                ", deviceType='" + deviceType + '\'' +
                '}';
    }
}

// SmartGrid class to manage a collection of SmartDevices
class SmartGrid {
    private Map<String, SmartDevice> deviceMap;

    public SmartGrid() {
        this.deviceMap = new HashMap<>();
    }

    // Add a new device to the SmartGrid
    public void addDevice(SmartDevice device) {
        deviceMap.put(device.getDeviceId(), device);
    }

    // Retrieve a device based on its ID
    public SmartDevice getDeviceById(String deviceId) {
        return deviceMap.get(deviceId);
    }

    // Get a list of all devices in the SmartGrid
    public List<SmartDevice> getAllDevices() {
        return new ArrayList<>(deviceMap.values());
    }
}

public class SmartGridExample {
    public static void main(String[] args) {
        SmartGrid smartGrid = new SmartGrid();

        SmartDevice device1 = new SmartDevice("001", "SmartMeter");
        SmartDevice device2 = new SmartDevice("002", "SmartThermostat");

        smartGrid.addDevice(device1);
        smartGrid.addDevice(device2);

        // Retrieve and print information about a specific device
        SmartDevice retrievedDevice = smartGrid.getDeviceById("001");
        System.out.println("Retrieved Device: " + retrievedDevice);

        // Print information about all devices in the SmartGrid
        List<SmartDevice> allDevices = smartGrid.getAllDevices();
        System.out.println("All Devices in SmartGrid:");
        for (SmartDevice device : allDevices) {
            System.out.println(device);
        }
    }
}
