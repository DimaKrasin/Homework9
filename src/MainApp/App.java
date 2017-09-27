package MainApp;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
	
	public void getStarted(){
		launch();
		
	}
	
	public void start(Stage myStage) throws UnirestException{
		
		Pane root = new Pane();
		Scene myScene = new Scene(root,600,500);
		
		
		TextField textF = new TextField();
		textF.setPrefColumnCount(12);
		
		
		
		
		Button button = new Button();
		button.setTranslateX(100);
		button.setTranslateY(100);
		button.setText("search");
		button.setOnAction((event)->{
			
			String videoId = "fg-6QgO9Btc";
			
				
					
						try {
							HttpResponse<JsonNode> response = Unirest.get("https://www.googleapis.com/youtube/v3/search")
									.queryString("part","snippet")
									.queryString("relatedToVideoId",videoId)
									.queryString("type", "video")
									.queryString("key", "AIzaSyDwpFmzMqNGyB2vIaf__SMQY3cR2Kvm0YA")
							        .asJson();
						
							
							System.out.println(response.getBody());
						} catch (UnirestException e) {
						}
						
						
					
			
			
		});
		
		root.getChildren().addAll(button,textF);
		
		myStage.setScene(myScene);
		myStage.show();
	}

}
