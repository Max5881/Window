import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Program extends Application {

    @Override
    public void start (Stage primaryStage){
        primaryStage.setTitle("MyWindow");
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);

        Pane root = new Pane();
        Font txtFont=new Font(20);


        Label label = new Label("Hi");
        label.setFont(txtFont);
        label.setLayoutY(130);

        TextField txtName= new TextField();
        txtName.setFont(txtFont);


        Button btn = new Button("Click");
        btn.setLayoutX(0);
        btn.setLayoutY(100);
        btn.setPrefSize(70,20);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            int count = 0;
            @Override
            public void handle(ActionEvent actionEvent) {
                count++;
                String str=txtName.getText();
                if (str.isEmpty()){
                    str="Not found";
                }
                label.setText(str);


            }
        });


        Scene scene = new Scene(root);

        root.getChildren().add(txtName);
        root.getChildren().add(label);
        root.getChildren().add(btn);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
