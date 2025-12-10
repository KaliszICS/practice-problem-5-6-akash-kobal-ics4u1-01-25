public class Display {
    private double sizeInches;
    private String resolution;
    private boolean isOn;

    public Display(double sizeInches, String resolution) {
        this.sizeInches = sizeInches;
        this.resolution = resolution;
    }

    public String turnOn() {
        isOn = true;
        return "Display turned on. [" + sizeInches + "]-inch, [" + resolution + "]";
    }

    public String turnOff() {
        isOn = false;
        return "Display turned off.";
    }

    public double getSizeInches() {
        return this.sizeInches;
    }

    public String getResolution() {
        return this.resolution;
    }

    @Override
    public String toString() {
        return "Display: [" + sizeInches + "] inches, [" + resolution + "]";
    }

    public boolean onOff() {
        return isOn;
    }
}
