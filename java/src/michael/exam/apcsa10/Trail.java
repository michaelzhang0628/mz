package michael.exam.apcsa10;

public class Trail {
    private int[] markers;

    public Trail(int[] markers) {
        super();
        this.markers = markers;
    }

    public boolean isLevelTrailSegment(int start, int end) {
        int minElevation = markers[start];
        int maxElevation = markers[start];
        for (int i = start + 1; i < end; i++) {
            if (markers[i] < minElevation) {
                minElevation = markers[i];
            } else if (markers[i] > maxElevation) {
                maxElevation = markers[i];
            }
        }
        if (maxElevation - minElevation <= 10) {
            return true;
        }
        return false;
    }

    public boolean isDifficult() {
        int significantChanges = 0;
        for (int i = 1; i < markers.length; i++) {
            if (Math.abs(markers[i - 1] - markers[i]) >= 30) {
                significantChanges++;
            }
        }
        if (significantChanges >= 3) {
            return true;
        }
        return false;
    }
}
