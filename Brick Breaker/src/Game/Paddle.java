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

    void keyPressed(KeyEvent e) {
        int gkc = e.getKeyCode();

        if (gkc == KeyEvent.VK_LEFT) {

            dx = -3;
        }

        if (gkc == KeyEvent.VK_RIGHT) {

            dx = 3;
        }

    }

    void keyReleased(KeyEvent e) {
        int gkc = e.getKeyCode();

        if (gkc == KeyEvent.VK_LEFT) {

            dx = 0;
        }

        if (gkc == KeyEvent.VK_RIGHT) {

            dx = 0;
        }

    }

    private void resetState() {

        x = Commons.INIT_PADDLE_X;
        y = Commons.INIT_PADDLE_Y;
    }
}
