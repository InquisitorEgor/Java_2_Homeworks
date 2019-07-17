package FirstUnconventionalHomework;


import java.awt.*;


public class Background  {



    public Color changeColor() {
        Color color = new Color(
                (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255)
        );

        return color;


    }
}
