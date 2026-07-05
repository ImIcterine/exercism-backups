
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds: birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int res = 0;
        
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            res += birdsPerDay[i];
        }

        return res;
    }

    public int getBusyDays() {
        int res = 0;

        for (int birds: birdsPerDay) {
            if (birds >= 5) {
                res++;
            }
        }

        return res;
    }
}
