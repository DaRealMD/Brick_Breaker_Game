/**
 *
 * @author debub
 */
package Game;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Paddle extends Sprite {

    private int dx;

    public Paddle() {
        initPaddle();
    }

    private void initPaddle() {
        loadImage();
        getImageDimensions();

        resetState();

    }

    // This loads the image that will be used to represent the paddle
    private void loadImage() {

        var mp = new ImageIcon("src/resources/mariopaddle.png");
        image = mp.getImage();

    }

    void move() {
        x += dx;

        if (x <= 0) {
            x = 0;

        }

        if (x >= Commons.WIDTH - imageWidth) {
            x =  Commons.WIDTH - imageWidth;

        }

    }

    // Handles the movement of the paddle, left and right via keylistener
    void keyPressed(KeyEvent e) {
        int gkc = e.getKeyCode();

        if (gkc == KeyEvent.VK_LEFT) {

            dx = -3;
        }

        if (gkc == KeyEvent.VK_RIGHT) {

            dx = 3;
        }

    }

    // When keys are released, the paddle will not move
    void keyReleased(KeyEvent e) {
        int gkc = e.getKeyCode();

        if (gkc == KeyEvent.VK_LEFT) {

            dx = 0;
        }

        if (gkc == KeyEvent.VK_RIGHT) {

            dx = 0;
        }

    }

    // Resets the paddle position on program restart
    private void resetState() {

        x = Commons.INIT_PADDLE_X;
        y = Commons.INIT_PADDLE_Y;
    }
}
