package nextstep.ladder.model;

public class Point {
    private static final int MINIMUM_USED_NUMBER = 0;
    private int goal = -1;

    public boolean isUsed() {
        return goal >= MINIMUM_USED_NUMBER;
    }

    public void use(int goal) {
        if (isUsed()) {
            throw new IllegalArgumentException("이미 사용된 point 입니다. ");
        }

        if (goal < MINIMUM_USED_NUMBER) {
            throw new IllegalArgumentException("음수 값을 목표로 받을 수 없습니다. goal : " + goal);
        }

        this.goal = goal;
    }

    public int getGoal() {
        return goal;
    }

    public int moveHorizontal(int x) {
        if (!isUsed()) {
            return x;
        }

        return goal;
    }
}