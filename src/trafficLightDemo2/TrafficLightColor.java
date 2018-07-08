package trafficLightDemo2;

public enum TrafficLightColor {
    RED(12_000), GREEN(10_000), YELLOW(2_000);

    int delay;

    public int getDelay() {
        return delay;
    }

    TrafficLightColor(int delay) {
        this.delay = delay;
    }
}
