/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dai.s_beauty;

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
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Daida
 */
public class product implements Initializable {

    @FXML
    private Button kembali;
    @FXML
    private Button bar;
    @FXML
    private CheckBox cb1;
    @FXML
    private CheckBox cb2;
    @FXML
    private CheckBox cb5;
    @FXML
    private CheckBox cb4;
    @FXML
    private CheckBox cb3;
    @FXML
    private CheckBox cb10;
    @FXML
    private CheckBox cb9;
    @FXML
    private CheckBox cb8;
    @FXML
    private CheckBox cb7;
    @FXML
    private CheckBox cb6;
    
   int total,totalbayar,jumlah;
   int total1,total2,total3,total4,total5,total6,total7,total8,total9,total10;
   int harga1,harga2,harga3,harga4,harga5,harga6,harga7,harga8,harga9,harga10;
   String barang1,barang2,barang3,barang4,barang5,barang6,barang7,barang8,barang9,barang10;
   String TampilTotalBayar;
   String barang="";
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back(ActionEvent event) throws IOException {
         ((Node) (event.getSource())).getScene().getWindow().hide();
            //Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("fxmlutama.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setTitle("Home");
            stage.show();
    }
    

    @FXML
    private void selesai(ActionEvent event) throws IOException {
        if (!(cb1.isSelected()) && !(cb2.isSelected()) && !(cb3.isSelected()) && 
            !(cb4.isSelected()) && !(cb5.isSelected()) && !(cb6.isSelected()) && 
            !(cb7.isSelected()) && !(cb8.isSelected()) && !(cb9.isSelected()) && 
            !(cb10.isSelected())){
            JOptionPane.showMessageDialog(null, "Hayoo belum di centang ya");
        }
        else{
        if(cb1.isSelected()){     
            harga1 = 125000;
            barang1 += cb1.getText()+", ";
            total1=harga1;
            System.out.println(total1);
         }
         if(cb2.isSelected()){     
            harga2 = 125000;
            barang2 += cb2.getText()+", ";
            total2=harga2;
            System.out.println(total2);
         }
        if(cb3.isSelected()){     
            harga3 = 35000;
            barang3 += cb3.getText()+", ";
            total3=harga3;
            System.out.println(total3);
         }
        if(cb4.isSelected()){     
            harga4 = 30000;
            barang4 += cb4.getText()+", ";
            total4=harga4;
            System.out.println(total4);
         }
        if(cb5.isSelected()){     
            harga5 = 30000;
            barang5 += cb5.getText()+", ";
            total5=harga5;
            System.out.println(total5);
         }
        if(cb6.isSelected()){     
            harga6 = 75000;
            barang6 += cb6.getText()+", ";
            total6=harga6;
            System.out.println(total6);
         }
        if(cb7.isSelected()){     
            harga7 = 50000;
            barang7 += cb7.getText()+", ";
            total7=harga7;
            System.out.println(total7);
         }
        if(cb8.isSelected()){     
            harga8 = 85000;
            barang8 += cb8.getText()+", ";
            total8=harga8;
            System.out.println(total8);
         }
        if(cb9.isSelected()){     
            harga9 = 85000;
            barang9 += cb1.getText()+", ";
            total9=harga9;
            System.out.println(total9);
         }
        if(cb10.isSelected()){     
            harga10 = 71000;
            barang10 += cb10.getText()+", ";
            total10=harga10;
            System.out.println(total10);
         }
        totalbayar = total1+total2+total3+total4+total5+total6+total7+total8+total9+total10;
        
        
        ((Node) (event.getSource())).getScene().getWindow().hide();
            //Load the new fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("total.fxml"));
            Parent root = (Parent) loader.load();
            Total a = loader.getController();
          
            a.myFunction(totalbayar);
           
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();  
        }
        
        
            
    }
    
}
