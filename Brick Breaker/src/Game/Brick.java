/**
 *
 * @author debub
 */
package Game;

import javax.swing.ImageIcon;

public class Brick extends Sprite {

    private boolean destroyed;

    public Brick(int x, int y) {

        initBrick(x, y);
    }

    private void initBrick(int x, int y) {

        this.x = x;
        this.y = y;

        //Default destroyed state
        destroyed = false;

        loadImage();
        getImageDimensions();
    }

    // This loads the image that will be used to represent the brick
    private void loadImage() {

        var tb = new ImageIcon("src/resources/terrabrick.png");
        image = tb.getImage();
    }

    // Destroyed state
    boolean isDestroyed() {

        return destroyed;
    }

    void setDestroyed(boolean val) {

        destroyed = val;
    }
}
