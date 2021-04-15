package ladder.domain;

import ladder.util.RandomUtil;

public class FirstPointStrategy implements PointStrategy {

    public FirstPointStrategy() {
    }

    @Override
    public Point point() {
        return new Point(0, new Direction(false, RandomUtil.trueOrFalse()));
    }
}
