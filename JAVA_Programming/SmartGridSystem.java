public class SmartGridSystem {
    // Data members
    private String systemName;
    private int maxCapacity;

    // Default constructor
    public SmartGridSystem() {
        systemName = "Default Smart Grid";
        maxCapacity = 100;
    }

    // Parameterized constructor
    public SmartGridSystem(String name, int capacity) {
        systemName = name;
        maxCapacity = capacity;
    }

    // Method to set the system name
    public void setSystemName(String name) {
        systemName = name;
    }

    // Method to get the system name
    public String getSystemName() {
        return systemName;
    }

    // Method to set the maximum capacity
    public void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }

    // Method to get the maximum capacity
    public int getMaxCapacity() {
        return maxCapacity;
    }

    // Method overloading - Calculate power consumption
    public int calculatePowerConsumption(int appliances, int hours) {
        return appliances * hours;
    }

    public double calculatePowerConsumption(double appliances, double hours) {
        return appliances * hours;
    }

    public double calculatePowerConsumption(double appliances, int hours) {
        return appliances * hours;
    }

    // Method overloading - Display system information
    public void displaySystemInfo() {
        System.out.println("System Name: " + systemName);
        System.out.println("Max Capacity: " + maxCapacity + " kW");
    }

    public void displaySystemInfo(boolean verbose) {
        if (verbose) {
            System.out.println("System Name: " + systemName);
            System.out.println("Max Capacity: " + maxCapacity + " kW");
            System.out.println("Location: XYZ");
        } else {
            displaySystemInfo();
        }
    }

    public static void main(String[] args) {
        SmartGridSystem defaultSystem = new SmartGridSystem();
        SmartGridSystem customSystem = new SmartGridSystem("Custom Smart Grid", 200);

        defaultSystem.displaySystemInfo();
        customSystem.displaySystemInfo(true);

        int powerConsumption1 = defaultSystem.calculatePowerConsumption(5, 8);
        double powerConsumption2 = defaultSystem.calculatePowerConsumption(4.5, 6.5);

        System.out.println("Power Consumption 1: " + powerConsumption1 + " kWh");
        System.out.println("Power Consumption 2: " + powerConsumption2 + " kWh");
    }
}
