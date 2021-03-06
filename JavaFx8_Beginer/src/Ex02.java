import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/*
 * ClassExercise 02 of JavaFx8!
 * 103021045
 * 邱頎夫
 * 20150916 22:08 (save)
 */
public class Ex02 extends Application{
	@Override 
	public void start(Stage stage) {
		Label lb = new Label("我上修了 HTML5 爽到一個!");
		lb.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		StackPane SPane = new StackPane();
		SPane.getChildren().add(lb);
		SPane.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
		
		Scene scene = new Scene(SPane, 300, 200);
		stage.setTitle("ckc. ver. 1.0.1");
		stage.setX(320);
		stage.setY(240);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args){
		launch(args);
	}
}