package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Controlador {

	@FXML
	Label logoLabel ;

	@FXML
	Label sloganLabel;
	
	@FXML
	Label brandNameLabel;
	
	@FXML
	Pane spinnerPane;

	@FXML
	AnchorPane rootPane;
	
	public void mostarPantallaPrincipal() {
		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("PantallaPrincipal.fxml"));
			AnchorPane pagina = (AnchorPane) loader.load();
			
			Stage homeStage = new Stage();
			homeStage.setTitle("Página Bienvenida");
			Scene scene=new Scene(pagina);
			homeStage.setScene(scene);
			homeStage.setMaximized(true);
			homeStage.show();
			
			System.out.println("second stage: OK");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("second stage: KO");
		}
		
	}// fin mostrarPantallaPrincipal()
	
/*	public void initialize() {
		
		
		 * Movemos hacia arriba los elementos
		 
		TranslateTransition translateTransition = new TranslateTransition(
				Duration.seconds(0.1), logoLabel);
		translateTransition.setByY(700);
		translateTransition.play();
		
		TranslateTransition translateTransition0 = new TranslateTransition(
				Duration.seconds(0.1), brandNameLabel);
		translateTransition0.setByY(700);
		translateTransition0.play();

		TranslateTransition translateTransition00 = new TranslateTransition(
				Duration.seconds(0.1), sloganLabel);
		translateTransition00.setByY(700);
		translateTransition00.play();
		
		spinnerPane.setOpacity(0);
		FadeTransition fadeTransition0 = new FadeTransition(
				Duration.seconds(0.1), spinnerPane);
		fadeTransition0.setFromValue(1);
		fadeTransition0.setToValue(0);
		fadeTransition0.play();
		
		translateTransition
		.setOnFinished(event -> {
			
			
			TranslateTransition translateTransition1 = new TranslateTransition(
					Duration.seconds(1), logoLabel);
			translateTransition1.setByY(-700);
			
			translateTransition1.play();

			translateTransition1.setOnFinished(event1 -> {

				brandNameLabel.setVisible(true);

				TranslateTransition translateTransition11 = new TranslateTransition(
						Duration.seconds(1), brandNameLabel);
				translateTransition11.setByY(-700);
				translateTransition11.play();

				translateTransition11.setOnFinished(event2 -> {

//					sloganLabel.setVisible(true);
					TranslateTransition translateTransition111 = new TranslateTransition(
							Duration.seconds(1), sloganLabel);
					translateTransition111.setByY(-700);
					translateTransition111.play();

					translateTransition111.setOnFinished(event3 -> {


						FadeTransition fadeTransition = new FadeTransition(
								Duration.seconds(3), spinnerPane);
						fadeTransition.setFromValue(0);
						fadeTransition.setToValue(1);
						fadeTransition.play();

						fadeTransition.setOnFinished(event4 -> {

							FadeTransition fadeTransition1 = new FadeTransition(
									Duration.seconds(2), rootPane);
							fadeTransition1.setFromValue(1);
							fadeTransition1.setToValue(0.1);
							fadeTransition1.play();

							fadeTransition1.setOnFinished(event5 -> {
//								main.closeStage();
					    	    Stage thisStage = (Stage) rootPane.getScene().getWindow();
					    	    thisStage.close();
								mostarPantallaPrincipal();
								System.out
										.println("------- splash screen is closed --------");
							});

						});

					});

				});
			});

		});
	} // fin initialize()
	
	
*/
	/**
	 * Versión personalizada
	 */
	public void initialize() {
		
		logoLabel.setOpacity(0);
		sloganLabel.setOpacity(0);
		spinnerPane.setOpacity(0);
		
		TranslateTransition translateTransition = new TranslateTransition(
				Duration.seconds(0.1), brandNameLabel);
		translateTransition.setByY(-700);
		translateTransition.play();

		
		translateTransition
		.setOnFinished(event -> {
			
			
			TranslateTransition translateTransition1 = new TranslateTransition(
					Duration.seconds(1), brandNameLabel);
			translateTransition1.setByY(700);
			
			translateTransition1.play();

			translateTransition1.setOnFinished(event1 -> {

//				brandNameLabel.setVisible(true);

				TranslateTransition translateTransition11 = new TranslateTransition(
						Duration.seconds(0.3), brandNameLabel);
				translateTransition11.setByY(-80);
				translateTransition11.play();

				translateTransition11.setOnFinished(event2 -> {

//					sloganLabel.setVisible(true);
					TranslateTransition translateTransition111 = new TranslateTransition(
							Duration.seconds(0.4), brandNameLabel);
					translateTransition111.setByY(90);
					translateTransition111.play();

					translateTransition111.setOnFinished(event3 -> {
						
						TranslateTransition translateTransition1111 = new TranslateTransition(
								Duration.seconds(0.3), brandNameLabel);
						translateTransition1111.setByY(-30);
						translateTransition1111.play();

						translateTransition1111.setOnFinished(event4 -> {
							
							TranslateTransition translateTransition11111 = new TranslateTransition(
									Duration.seconds(0.3), brandNameLabel);
							translateTransition11111.setByY(20);
							translateTransition11111.play();
							
							translateTransition11111.setOnFinished(event5 -> {
								logoLabel.setOpacity(1);
								sloganLabel.setOpacity(1);

								FadeTransition fadeTransition = new FadeTransition(
										Duration.seconds(3), spinnerPane);
								fadeTransition.setFromValue(0);
								fadeTransition.setToValue(1);
								fadeTransition.play();

								fadeTransition.setOnFinished(event6 -> {

									FadeTransition fadeTransition1 = new FadeTransition(
											Duration.seconds(2), rootPane);
									fadeTransition1.setFromValue(1);
									fadeTransition1.setToValue(0.1);
									fadeTransition1.play();

									fadeTransition1.setOnFinished(event7 -> {
//										main.closeStage();
							    	    Stage thisStage = (Stage) rootPane.getScene().getWindow();
							    	    thisStage.close();
										mostarPantallaPrincipal();
										System.out
												.println("------- splash screen is closed --------");
									});

								});
							});
							
						});

					});

				});
			});

		});
	} // fin initialize()	
}
