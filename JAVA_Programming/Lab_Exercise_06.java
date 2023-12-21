// Generic interface representing a connectable device
interface Connectable<T> {
    void connect(T device);
}

// Generic class representing a smart device
class SmartDevice<T> implements Connectable<T> {
    private String name;

    public SmartDevice(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void connect(T device) {
        System.out.println(this.getName() + " is connecting to " + ((SmartDevice<?>) device).getName());
        // Add your connection logic here
    }
}

// Generic method to connect two devices
class SmartGroidSystem {
    public static <T extends Connectable<U>, U> void connectDevices(T device1, U device2) {
        device1.connect(device2);
    }
}


public class GenericsExample {
    public static void main(String[] args) {
        // Create smart devices
        SmartDevice<SmartDevice<?>> smartphone = new SmartDevice<>("Smartphone");
        SmartDevice<SmartDevice<?>> smartTV = new SmartDevice<>("Smart TV");

        // Connect devices using the generic method
        SmartGroidSystem.connectDevices(smartphone, smartTV);
    }
}
