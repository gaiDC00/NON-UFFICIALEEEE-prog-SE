/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettose;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

/**
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Button buttonRectangleID;
    @FXML
    private AnchorPane A1;
    @FXML
    private AnchorPane A2;    
    @FXML
    private Button buttonCerchioID;
    @FXML
    private AnchorPane A3;
    
    private Rectangle r = createRectangle();
    private Circle c = createCircle();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
  
    }    

    @FXML
    private void OnClickbuttonChangeColor(MouseEvent event) {
    }
    
    class Measure {
    double x, y;

    public Measure() {
        x = 0; y = 0;
    }
}
    
    private void move (Shape s){
        final Measure dragMeasure = new Measure();
        final Measure position = new Measure();
        
        s.setOnMousePressed(mouseEvent -> {
            position.x = s.getTranslateX();
            position.y = s.getTranslateY();
            dragMeasure.x = mouseEvent.getSceneX() - position.x;
            dragMeasure.y = mouseEvent.getSceneY() - position.y;
            s.setCursor(Cursor.MOVE);
        });
        
        s.setOnMouseDragged(mouseEvent -> {
            position.x = mouseEvent.getSceneX() - dragMeasure.x;
            position.y = mouseEvent.getSceneY() - dragMeasure.y;
            s.setTranslateX(position.x);
            s.setTranslateY(position.y);
        });
        
        s.setOnMouseReleased(mouseEvent -> s.setCursor(Cursor.HAND));
        s.setOnMouseEntered(mouseEvent -> s.setCursor(Cursor.HAND)); 
    }

    
    @FXML
    private void OnClickbuttonRectangleID(MouseEvent event) {
          A1.getChildren().add(r);
        
    }
 

    private void OnClickbuttonChangeColor(MouseEvent event, Shape s) {
       r.setFill(Color.GREEN);
    }


    @FXML
    private void OnClickbuttonCerchio(MouseEvent event) {
        
        A3.getChildren().add(c);
    }

    
   
    
  
    private Rectangle createRectangle(){
        Rectangle rect = new Rectangle();
        rect.setX(50);
        rect.setY(50);
        rect.setWidth(200);
        rect.setHeight(100);
        rect.setFill(Color.TRANSPARENT);
        rect.setStroke(Color.BLACK);
        return rect;
    }
    
    
    private Circle createCircle(){
        Circle cir = new Circle();
        cir.setCenterX(100.0f);
        cir.setCenterY(100.0f);
        cir.setRadius(50.0f);
        cir.setFill(Color.TRANSPARENT);
        cir.setStroke(Color.BLACK); 
        return cir;
    }
    
    private boolean Selected(boolean isSelect){
        return isSelect;
    }

    
    
    
    
    
    @FXML
    private void OnClickAnchorPane(MouseEvent event) {
          r.setOnMouseClicked((e) -> {
          Selected(true);
          r.getStrokeDashArray().addAll(2d, 5d);
          r.setStroke(Color.RED);
          move(r);
          });
          
          
          
          c.setOnMouseClicked((e) -> {
          c.getStrokeDashArray().addAll(2d, 5d);
          c.setStroke(Color.RED);
          move(c);
          });
    }


    
    
  
}


