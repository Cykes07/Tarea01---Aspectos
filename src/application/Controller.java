package application;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class Controller {
    @FXML
    private Pane myPane;
    
    public void red(ActionEvent e) {
       myPane.setStyle("-fx-background-color: #FF0000; -fx-border-color: #000000;");
    }

    public void yellow(ActionEvent e) {
        myPane.setStyle("-fx-background-color: #FFFF00; -fx-border-color: #000000;");
    }

    public void blue(ActionEvent e) {
        myPane.setStyle("-fx-background-color: #0000FF; -fx-border-color: #000000;");
    }
}
