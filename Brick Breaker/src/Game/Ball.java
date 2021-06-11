/**
 *
 * @author debub
 */
package Game;

import javax.swing.ImageIcon;

public class Ball extends Sprite {

    private int xdir;
    private int ydir;

    public Ball() {

        initBall();
    }

    private void initBall() {

        xdir = 1;
        ydir = -1;

        loadImage();
        getImageDimensions();
        resetState();
    }

    // This loads the image that will be used to represent the ball
    private void loadImage() {

        var cb = new ImageIcon("src/resources/creepball.png");
        image = cb.getImage();
    }

    // Movement for the ball
    void move() {

        x += xdir;
        y += ydir;

        if (x == 0) {

            setXDir(1);
        }

        if (x == Commons.WIDTH - imageWidth) {

            setXDir(-1);
        }

        if (y == 0) {

            setYDir(1);
        }
    }

    // Resets the ball position on program restart
    private void resetState() {

        x = Commons.INIT_BALL_X;
        y = Commons.INIT_BALL_Y;
    }

    void setXDir(int x) {

        xdir = x;
    }

    void setYDir(int y) {

        ydir = y;
    }

    int getYDir() {

        return ydir;
    }
}
