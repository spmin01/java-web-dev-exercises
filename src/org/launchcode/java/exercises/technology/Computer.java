package org.launchcode.java.exercises.technology;

public class Computer {
    private String operatingSystem;
    private String cpu;
    private boolean hasMonitor;

    public Computer() {}

    public Computer(String operatingSystem, String cpu, boolean hasMonitor) {
        this.operatingSystem = operatingSystem;
        this.cpu = cpu;
        this.hasMonitor = hasMonitor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public boolean isHasMonitor() {
        return hasMonitor;
    }

    public void setHasMonitor(boolean hasMonitor) {
        this.hasMonitor = hasMonitor;
    }
}
