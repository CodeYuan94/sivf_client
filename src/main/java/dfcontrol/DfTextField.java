package dfcontrol;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static utils.ComUtil.enterToTab;
import static utils.ComUtil.fontSize;

public class DfTextField extends TextField implements Initializable {

    public DfTextField(){
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("dfcontrol/dfTextField.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        }catch (IOException exception){
            exception.getStackTrace();
        }

        focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (newValue){
                    setStyle("-fx-background-color: white;-fx-border-color: #86A1FF;-fx-border-radius: 3px;-fx-background-radius: 3px;");
                }else {
                    setStyle("-fx-background-color: white;-fx-border-color: #DCDCDC;-fx-border-radius: 3px;-fx-background-radius: 3px;");
                }
            }
        });

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        enterToTab(this);
        if (fontSize > 0){
            this.setFont(Font.font(fontSize));
        }

    }
}
