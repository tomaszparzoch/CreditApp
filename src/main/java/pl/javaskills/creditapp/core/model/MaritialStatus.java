package pl.javaskills.creditapp.core.model;

public enum MaritialStatus {
    DIVORCED(0),
    SEPARATED(100),
    SINGLE(0),
    WIDOWED(0),
    MARRIED(100);

    int score;

    MaritialStatus(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
