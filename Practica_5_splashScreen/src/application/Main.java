package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	Stage stage;
	
	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		mainWindow();
	}
	
	private void mainWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("SplashScreen.fxml"));
			AnchorPane pane = loader.load();

			Scene scene = new Scene(pane);

			// adding Google fonts
			scene.getStylesheets().add(
					"https://fonts.googleapis.com/css?family=Baloo+Bhaijaan");

			// adding Custom fonts
			//Font.loadFont(getClass().getResourceAsStream("assets/Sacramento-Regular.ttf"), 20);

			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
