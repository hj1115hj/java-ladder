package ladder.domain;

import java.util.List;

public class Line {
	private final List<Boolean> points;

	public Line(int countOfPerson) {
		this(new RandomLineStrategy(), countOfPerson);
	}

	public Line(LineStrategy lineStrategy, int countOfPerson) {
		this.points = lineStrategy.points(countOfPerson);
	}

	public List<Boolean> getPoints() {
		return points;
	}
}