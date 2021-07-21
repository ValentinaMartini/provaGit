


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainApplication extends Application {	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception{
		
		VBox root = new VBox();
		Label label = new Label();
		label.setText("Prova Label");
		
		root.getChildren().add(label);
		Scene scene = new Scene(root, 400, 400);
		stage.setScene(scene);
		stage.show();		
	}
	
	

}
