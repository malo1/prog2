package hci.uni.hannover.de;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import hci.uni.hannover.de.Controller;
import hci.uni.hannover.de.Client;
import hci.uni.hannover.de.GameServer;
import hci.uni.hannover.de.Server;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
		try { 
			final FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml_menu.fxml"));
			final Parent root = (Parent) loader.load();
			Server startServer = new Server();
			Scene scene = new Scene(root, 640, 360);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("Schwimmen");
			primaryStage.setResizable(false);
            primaryStage.setScene(scene);           
            primaryStage.show();
			
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
	
    public static void main(String[] args) {
        launch(args);
    }
}
