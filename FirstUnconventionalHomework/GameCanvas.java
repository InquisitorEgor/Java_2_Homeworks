package FirstUnconventionalHomework;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.TimeZone;

public class GameCanvas extends JPanel {

    Background background = new Background();
    MainCircles gameWindow;
    Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    private long lastFrameTime;

    private long milis2 = 0;
    private long milis1 = 10000;

    GameCanvas(MainCircles gameWindow) {
        this.gameWindow = gameWindow;


        lastFrameTime = System.nanoTime();
    }

    @Override
    protected void paintComponent(Graphics g) {

        if (milis1 > milis2) {
            setBackground(background.changeColor());
            milis2 = milis1 + 10000;


        }
        milis1 += cal.getTimeInMillis() % 1000;

        super.paintComponent(g);


        long currentTime = System.nanoTime();
        float delta = (currentTime - lastFrameTime) * 0.000000001f;
        lastFrameTime = currentTime;
        try {
            Thread.sleep(17);
            gameWindow.onDrawFrame(this, g, delta);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        repaint();
    }

    public int getLeft() {
        return 0;
    }

    public int getRight() {
        return getWidth() - 1;
    }

    public int getTop() {
        return 0;
    }

    public int getBottom() {
        return getHeight() - 1;
    }
}
