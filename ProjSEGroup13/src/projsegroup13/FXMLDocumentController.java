/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projsegroup13;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private Tab drawTab;
    @FXML
    private ToggleButton lineToggle;
    @FXML
    private ToggleButton ellipseToggle;
    @FXML
    private ToggleButton rectangleToggle;
    @FXML
    private ColorPicker strokeColPick;
    @FXML
    private ColorPicker fillColPick;
    @FXML
    private Pane pane;
    
    private Tool tool;
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void lineToggleAction(ActionEvent event) {
    }

    @FXML
    private void ellipseToggleAction(ActionEvent event) {
    }

    @FXML
    private void rectangleToggleAction(ActionEvent event) {
    }

    @FXML
    private void paneClick(MouseEvent event) {
        tool.action(event, pane);
    }
    
}
