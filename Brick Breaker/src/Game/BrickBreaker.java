/**
 *
 * @author debub
 */

package Game;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class BrickBreaker extends JFrame {
    
    public BrickBreaker() {
        initUI();
    }
    
    public void initUI() {
        add(new Board1());

        setTitle("Brick Breaker");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            var game = new BrickBreaker();
            game.setVisible(true);
        });
    }
    
}
