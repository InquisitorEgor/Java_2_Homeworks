package FirstHomework.Competitors.Obstacles;

import FirstHomework.Competitors.Competitors.*;


public class Cross implements Obstacle {

    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(distance);
    }
}



