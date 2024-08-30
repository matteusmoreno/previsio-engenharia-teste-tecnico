package org.example;

public class LightSwitchSimulation {

    public static void main(String[] args) {
        // Create switches and bulbs
        Switch switch1 = new Switch();
        Switch switch2 = new Switch();
        Switch switch3 = new Switch();

        LightBulb bulb1 = new LightBulb();
        LightBulb bulb2 = new LightBulb();
        LightBulb bulb3 = new LightBulb();

        // Connect bulbs to switches
        switch1.setConnectedBulb(bulb1);
        switch2.setConnectedBulb(bulb2);
        switch3.setConnectedBulb(bulb3);

        // Turn on switch1 for a while
        switch1.turnOn();
        simulateTimePassage();
        switch1.turnOff();

        // Turn on switch2
        switch2.turnOn();

        // Go to the room and check bulbs
        checkBulbs(bulb1, bulb2, bulb3);
    }

    // Simulate the passage of time
    private static void simulateTimePassage() {
        try {
            Thread.sleep(10000); // Simulate 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Check the state of the bulbs
    private static void checkBulbs(LightBulb bulb1, LightBulb bulb2, LightBulb bulb3) {
        System.out.println("Bulb 1 is " + (bulb1.isOn() ? "ON" : "OFF") + ", Temperature: " + bulb1.getTemperature() + "°C");
        System.out.println("Bulb 2 is " + (bulb2.isOn() ? "ON" : "OFF") + ", Temperature: " + bulb2.getTemperature() + "°C");
        System.out.println("Bulb 3 is " + (bulb3.isOn() ? "ON" : "OFF") + ", Temperature: " + bulb3.getTemperature() + "°C");
    }

    static class Switch {
        private LightBulb connectedBulb;

        public void setConnectedBulb(LightBulb bulb) {
            this.connectedBulb = bulb;
        }

        public void turnOn() {
            if (connectedBulb != null) {
                connectedBulb.turnOn();
            }
        }

        public void turnOff() {
            if (connectedBulb != null) {
                connectedBulb.turnOff();
            }
        }
    }

    static class LightBulb {
        private boolean isOn = false;
        private int temperature = 0;

        public void turnOn() {
            isOn = true;
            temperature = 60; // Assume it gets hot when on
        }

        public void turnOff() {
            isOn = false;
            temperature = 20; // Assume it cools down when off
        }

        public boolean isOn() {
            return isOn;
        }

        public int getTemperature() {
            return temperature;
        }
    }

}

