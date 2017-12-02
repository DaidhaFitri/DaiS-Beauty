/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dai.s_beauty;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Daida
 */
public class FXMLutama implements Initializable {

    @FXML
    private JFXButton produk;
    @FXML
    private JFXButton rawat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void beli(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
            //Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("fxmlproduct.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setTitle("Product");
            stage.show();   
    }

    @FXML
    private void perawatan(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
            //Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("perawatan.fxml"));
            Parent root = (Parent)fxmlLoader.load();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Perawatan");
            stage.show();   
    }
    
}
