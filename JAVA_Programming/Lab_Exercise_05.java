import java.util.concurrent.*;

class SmartGridSystem {

    // Simulating a smart grid with a shared resource (e.g., power consumption data)
    private static class SmartGrid {
        private int powerConsumption;

        public synchronized void updatePowerConsumption(int amount) {
            powerConsumption += amount;
            System.out.println("Power Consumption: " + powerConsumption);
        }
    }

    // Task representing a device in the smart grid
    private static class Device implements Runnable {
        private final String name;
        private final SmartGrid smartGrid;
        private final int powerConsumptionChange;

        public Device(String name, SmartGrid smartGrid, int powerConsumptionChange) {
            this.name = name;
            this.smartGrid = smartGrid;
            this.powerConsumptionChange = powerConsumptionChange;
        }

        @Override
        public void run() {
            while (true) {
                smartGrid.updatePowerConsumption(powerConsumptionChange);
                try {
                    Thread.sleep(1000); // Simulate some processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SmartGrid smartGrid = new SmartGrid();

        // Create devices with different power consumption changes
        Device device1 = new Device("Device 1", smartGrid, 10);
        Device device2 = new Device("Device 2", smartGrid, -5);

        // Create threads for each device
        Thread thread1 = new Thread(device1);
        Thread thread2 = new Thread(device2);

        // Start the threads
        thread1.start();
        thread2.start();

        // Allow the simulation to run for a while
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the threads to stop the simulation
        thread1.interrupt();
        thread2.interrupt();
    }
}
