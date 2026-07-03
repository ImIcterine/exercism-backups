public class CarsAssemble {
    int prodRatePerHour = 221;
    
    public double productionRatePerHour(int speed) {
        if (speed >= 5 && speed <= 8) {
            return prodRatePerHour * speed * 0.9;
        } else if (speed == 9) {
            return prodRatePerHour * speed * 0.8; 
        } else if (speed >= 10) {
            return prodRatePerHour * speed * 0.77;
        } else if (speed <= 0) {
            return 0;
        }

        return prodRatePerHour * speed;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
