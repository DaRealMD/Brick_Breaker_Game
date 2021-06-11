/**
 *
 * @author debub
 */

package Game;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.EventQueue;


/*  UNUSED IMPORTS, for now
import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
*/



public class BrickBreaker extends JFrame {
    
    

    public BrickBreaker() {
        initUI();
    }
    
    public void initUI() {

        add(new Board1());
        setTitle("Brick Breaker");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //exit out of application
        setLocationRelativeTo(null);
        setResizable(false);  //prevent frame from being resized

        //Sets windows icon
        ImageIcon imageIC = new ImageIcon("src/resources/BBicon.png");  //create an ImageIcon
        setIconImage(imageIC.getImage()); //change icon of frame

        pack();

        /*
        //Add background image
        private ImageIcon bgImage;
        private JLabel myLabel;

        bgImage = new ImageIcon(this.getClass().getResource("src.resources/retroBG5.png"));
        myLabel = new JLabel(bgImage);
        myLabel.setSize(500, 700);

        add(myLabel);
        */

        /**
        ImageIcon image = new ImageIcon("src/resources/retroBG1.png");
        JLabel label = new JLabel(); //create a label
        label.setIcon(image);
        */

        //BACKGROUND IMAGE SECTION || LINK: https://stackoverflow.com/questions/1466240/how-to-set-an-image-as-a-background-for-frame-in-swing-gui-of-java
        // https://www.youtube.com/watch?v=yGcYoz0s94E 
        /*
        try {
            final Image backgroundImage = javax.imageio.ImageIO.read(new File("src/resources/retroBG5.png"));
            setContentPane(new JPanel(new BorderLayout()) {
                @Override public void paintComponent(Graphics g) {
                    g.drawImage(backgroundImage, 0, 0, null);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */
        
        /*
        //Sets an image as the background image
        ImageIcon imageBG = new ImageIcon("src/resources/retroBG5.png");
        Image img = imageBG.getImage();
        Image temp = img.getScaledInstance(500,700,Image.SCALE_SMOOTH);
        imageBG = new ImageIcon(temp);
        JLabel back = new JLabel(imageBG);
        back.setLayout(null);
        back.setBounds(0,0,500,700);
        */
        
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            var game = new BrickBreaker();
            game.setVisible(true);  //make frame visible
        });
    }
    
}
