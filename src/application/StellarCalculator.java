package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
//import javafx.scene.control.ChoiceBox;


  

public class StellarCalculator {
	Stage applicationStage;

    @FXML
    private Button parallax;

    @FXML
    private Button hourAngle;

    @FXML
    private Button resolution;
    
    
    
    /**Changing the scene for each of the formula given which will be 
     * linked with its respective calculations
     * 
     **/
    
    @FXML
    void angularSize(ActionEvent angularSizeEvent) {
    	Scene mainScene= applicationStage.getScene();
    	
    	HBox angularSizeContainer = new HBox ();
    	Label angularSizeLabel = new Label(" Angular Size");
    	TextField angularSizeTextfield= new TextField();
    	
    	Button doneButton= new Button("Done");
    	doneButton.setOnAction(doneEvent -> applicationStage.setScene(mainScene));
    	
    	angularSizeContainer.getChildren().addAll(angularSizeLabel, angularSizeTextfield, doneButton);
    	System.out.println("Button pressed");
    	Scene angularSizeScene = new Scene(angularSizeContainer);
    	applicationStage.setScene(angularSizeScene);
    }
    
    
    @FXML
    void resolution(ActionEvent resolutionEvent) {
    	
    	Scene mainScene= applicationStage.getScene();
    	
    	HBox resolutionContainer = new HBox ();
    	Label resolutionLabel = new Label(" Resolution ");
    	TextField resolutionTextfield= new TextField();
    	
    	Button doneButton= new Button("Done");
    	doneButton.setOnAction(doneEvent -> applicationStage.setScene(mainScene));
    	
    	resolutionContainer.getChildren().addAll(resolutionLabel, resolutionTextfield, doneButton);
    	System.out.println("Button pressed");
    	Scene resolutionScene = new Scene(resolutionContainer);
    	applicationStage.setScene(resolutionScene);
    }
    
    
    @FXML
    void parallax(ActionEvent parallaxEvent) {
    	
    	Scene mainScene= applicationStage.getScene();
    	
    	HBox parallaxContainer = new HBox ();
    	Label parallaxLabel = new Label(" Angular Size");
    	TextField parallaxTextfield= new TextField();
    	
    	Button doneButton= new Button("Done");
    	doneButton.setOnAction(doneEvent -> applicationStage.setScene(mainScene));
    	
    	parallaxContainer.getChildren().addAll(parallaxLabel, parallaxTextfield, doneButton);
    	System.out.println("Button pressed");
    	Scene parallaxScene = new Scene(parallaxContainer);
    	applicationStage.setScene(parallaxScene);
    }

    
    @FXML
    void hourAngle(ActionEvent hourAngleEvent) {
    	
    	
    	Scene mainScene= applicationStage.getScene();
    	
    	HBox hourAngleContainer = new HBox ();
    	Label hourAngleLabel = new Label(" Angular Size");
    	TextField hourAngleTextfield= new TextField();
    	
    	Button doneButton= new Button("Done");
    	doneButton.setOnAction(doneEvent -> applicationStage.setScene(mainScene));
    	
    	hourAngleContainer.getChildren().addAll(hourAngleLabel, hourAngleTextfield, doneButton);
    	System.out.println("Button pressed");
    	Scene hourAngleScene = new Scene(hourAngleContainer);
    	applicationStage.setScene(hourAngleScene);
    }
    
    
    
    
}
