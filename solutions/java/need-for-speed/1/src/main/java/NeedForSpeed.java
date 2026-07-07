class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int driven;
    public int battery;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.driven = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        if (battery < batteryDrain) {
            return true;
        }
        return false;
    }

    public int distanceDriven() {
        return driven;
    }

    public void drive() {
        if (!batteryDrained()) {
            driven += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.battery / car.batteryDrain * car.speed >= distance;
    }
}
