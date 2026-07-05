public class JedliksToyCar {
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public int distance = 0;
    public int battery = 100;

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        } else {
            return "Battery at " + battery + "%";
        }
    }

    public void drive() {
        if (battery > 0) {
            distance += 20;
            battery -= 1;
        }
    }
}
