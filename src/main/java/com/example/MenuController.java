package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

public class MenuController implements Initializable {

    @FXML
    private Text txtProgramming;

    @FXML
    private Pane paneContainer;

    @FXML
    private Button btnLeft;

    @FXML
    private Button btnRight;

    @FXML
    private ToggleGroup color;

    @FXML
    private RadioButton rdbRed;

    @FXML
    private RadioButton rdbYellow;

    @FXML
    private RadioButton rdbBlack;

    @FXML
    private RadioButton rdbGreen;

    @FXML
    private RadioButton rdbOrange;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        rdbRed.setUserData(Color.RED);
        rdbYellow.setUserData(Color.YELLOW);
        rdbBlack.setUserData(Color.BLACK);
        rdbGreen.setUserData(Color.GREEN);
        rdbOrange.setUserData(Color.ORANGE);

        color.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue,
            Toggle newValue) {
                txtProgramming.setFill((Paint) newValue.getUserData());
            }
        });
    }
    
    public void moveLeft() {
        if(txtProgramming.getLayoutX() - 1 > 0) {
            txtProgramming.setLayoutX(txtProgramming.getLayoutX() - 1);
        }
    }

    public void moveRight() {
        if(txtProgramming.getLayoutX() + txtProgramming.getWrappingWidth() + 1 < paneContainer.getWidth()) {
            txtProgramming.setLayoutX(txtProgramming.getLayoutX() + 1);
        }
    }

}
