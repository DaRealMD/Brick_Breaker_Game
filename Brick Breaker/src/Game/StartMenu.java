package Game;

/* IMPORTANT LINKS
https://www.youtube.com/watch?v=As7TEjqJ3Ao&list=PLZPZq0r_RZOM-8vJA3NQFZB7JroDcMwev&index=3&t=515s
https://www.youtube.com/watch?v=7nlU3_kEjTE&list=PLZPZq0r_RZOM-8vJA3NQFZB7JroDcMwev&index=5
https://www.youtube.com/watch?v=-Obxf6NjnbQ&list=PLZPZq0r_RZOM-8vJA3NQFZB7JroDcMwev&index=6
https://www.youtube.com/watch?v=qIr2XYZrznI
https://www.youtube.com/watch?v=BJ7fr9XwS2o&t=1s
*/


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
/**
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
*/

public class StartMenu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root);

        stage.show();
    }

}