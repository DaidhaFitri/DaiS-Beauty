/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dai.s_beauty;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Daida
 */
public class Total implements Initializable {

    @FXML
    private TextArea TA;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void myFunction(Integer taideal ){
       
         TA.setText("Anda Harus Membayar : "+taideal);
     }

      public void myFunction1(Integer ta, String Nama,String Tempat,
              String Alamat,String Keluhan ,Integer Umur , LocalDate Tanggal){
    
         TA.setText("Nama : "+Nama+"\nTempat Lahir : "+Tempat+"\nTanggal Lahir : "
                 +Tanggal+"\nUmur : "+Umur+"Alamat : "+Alamat+"\nKeluhan : "+Keluhan+
                 "\nAnda Harus Membayar : "+ta);
     }
    
    @FXML
    private void textarea(MouseEvent event) {
    }

    void myFunction(int totalbayar) {
        TA.setText("Anda Harus Membayar : "+totalbayar);
    }

    void myFunction1(Integer ta, String Nama, String Tempat, String Alamat,
            String Keluhan, int Umur, LocalDate Tanggal, int biaya) {
        TA.setText("Nama : "+Nama+"\nTempat Lahir : "+Tempat+"\nTanggal Lahir : "
                +Tanggal+"\nUmur : "+Umur+"Alamat : "+Alamat+"\nKeluhan : "+Keluhan+
                 "\nAnda Harus Membayar : "+biaya);
    }

    void myFunction1(String Nama, String Tempat, String Alamat, String Keluhan,
            int Umur, LocalDate Tanggal, int biaya) {
       TA.setText("Nama : "+Nama+"\nTempat Lahir : "+Tempat+"\nTanggal Lahir : "
               +Tanggal+"\nUmur : "+Umur+"\nAlamat : "+Alamat+"\nKeluhan : "+Keluhan+
                 "\nAnda Harus Membayar : "+biaya);
    }
}
