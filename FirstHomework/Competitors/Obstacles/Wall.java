package FirstHomework.Competitors.Obstacles;
import FirstHomework.Competitors.Competitors.*;



public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
