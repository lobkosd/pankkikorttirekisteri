package PankkiRekisteri;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


/**
 * @author OMISTAJA
 * @version 23.1.2025
 *
 */
public class PankkiRekkariMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader ldr = new FXMLLoader(getClass().getResource("PankkiRekkariGUIView.fxml"));
            final Pane root = ldr.load();
            //final PankkiRekkariGUIController pankkirekkariCtrl = (PankkiRekkariGUIController) ldr.getController();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("pankkirekkari.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("PankkiRekkari");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args Ei kaytossa
     */
    public static void main(String[] args) {
        launch(args);
        
    }
}