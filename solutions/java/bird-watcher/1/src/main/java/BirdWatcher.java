
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] { 0, 2, 5, 3, 7, 8, 4 };

    }

    public int getToday() {
        if (birdsPerDay.length == 0)
            return 0;
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        if (birdsPerDay.length == 0)
            return;
        birdsPerDay[birdsPerDay.length - 1]++;

    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays <= 0) {
            return 0;
        }
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busy = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busy++;
            }
        }
        return busy;
    }
}
