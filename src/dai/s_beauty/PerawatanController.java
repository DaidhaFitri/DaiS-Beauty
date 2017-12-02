/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dai.s_beauty;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Daida
 */
public class PerawatanController implements Initializable {

    @FXML
    private JFXButton pesan;
    @FXML
    private TextArea alamat;
    @FXML
    private TextArea keluhan;
    @FXML
    private DatePicker tanggal;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField tempat;
    @FXML
    private JFXTextField umur;
        @FXML
    private ComboBox<String> jenis_kelamin;

    @FXML
    private ComboBox<String> biasa_menggunakan;
    
   int total,totalbayar,jumlah;
   int total1,total2,total3,total4,total5,total6,total7,total8,total9,total10;
   int harga1,harga2,harga3,harga4,harga5,harga6,harga7,harga8,harga9,harga10;
   String barang1,barang2,barang3,barang4,barang5,barang6,barang7,barang8,barang9,barang10;
   String TampilTotalBayar;
   String barang="";


    /**
     * Initializes the controller class.
     */
    
    ObservableList<String>  gender = FXCollections
            .observableArrayList(
                    "Perempuan",
                    "Laki-Laki");
    ObservableList<String>  treatment = FXCollections
            .observableArrayList(
                    "Fruit Facial (95.000)",
                    "Anti Ance Facial (120.000)",
                    "Brihtening Facial (210.000)",
                    "Mouisturizing Facial (210.000)",
                    "Whitening Facial (250.000)",
                    "Bio Light Teraphy (300.000)",
                    "Organic Facial (350.000)");
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        biasa_menggunakan.setItems(treatment);
        jenis_kelamin.setItems(gender);
    }    

    @FXML
    private void pesanpesan(ActionEvent event) throws IOException {
        if(nama.getText().equals("")||tempat.getText().equals("")||
            alamat.getText().equals("")||keluhan.getText().equals("")||
            umur.getText().equals("")||tanggal.getValue().equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi data terlebih dahulu");
        }
        String Nama,Tempat,Alamat,Keluhan;
        int Umur;
        LocalDate Tanggal;
        
        String t = biasa_menggunakan.getValue();
        Nama = nama.getText();
        Tempat = tempat.getText();
        Alamat = alamat.getText();
        Keluhan = keluhan.getText();
        Umur = Integer.parseInt(umur.getText());
        Tanggal = tanggal.getValue();
        int biaya = 0;
        
        
        
        
        if(null != t)
            switch(t){
                case "Fruit Facial (95.000)":
                    biaya = 95000;
                    break;
                 
                case "Anti Ance Facial (120.000)":
                    biaya = 120000;
                    break;
                    
                case "Brihtening Facial (210.000)":
                    biaya = 210000;
                    break;
                    
                case "Mouisturizing Facial (210.000)":
                    biaya = 210000;
                    break;
                    
                case "Whitening Facial (250.000)":
                    biaya = 120000;
                    break;
                    
                case "Bio Light Teraphy (300.000)":
                    biaya = 300000;
                    break;
                    
                case "Organic Facial (350.000)":
                    biaya = 120000;
                    break;
                default:
                    break;
                
         }
        else{
        System.exit(0);
        }
       
        ((Node) (event.getSource())).getScene().getWindow().hide();
            //Load the new fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("total.fxml"));
            Parent root = (Parent) loader.load();
            Total a = loader.getController();
          
            a.myFunction1(Nama, Tempat, Alamat, Keluhan, Umur, Tanggal, biaya);
           
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();   
        
    }
    
}
