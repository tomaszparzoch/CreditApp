package core.model;

public enum Education {
    PRIMARY(-100),
    MIDDLE(0),
    SECONDARY(0),
    POST_SECONDARY(0),
    TERTIARY(100),
    NONE(-200);

    int score;

    Education(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
