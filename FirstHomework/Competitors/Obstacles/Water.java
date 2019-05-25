package FirstHomework.Competitors.Obstacles;

import FirstHomework.Competitors.Competitors.*;

public class Water implements Obstacle {
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(distance);
    }
}
