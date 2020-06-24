package fxml;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.StringUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static utils.ComUtil.switchContentByNav;

/**
 * @ClassName Content
 * @Description 主画面内容区域
 * @Author hy
 * @Date 2020-06-22 16:20
 * @Version 1.0
 */
public class Content extends HBox implements Initializable {

    private static final Logger logger = LoggerFactory.getLogger(Content.class);

    public Content(){
        FXMLLoader fl = new FXMLLoader(getClass().getClassLoader().getResource("fxml/content.fxml"));
        fl.setRoot(this);
        fl.setController(this);
        try{
            fl.load();
        }
        catch (IOException e){
            e.printStackTrace();
            logger.error("Content init error :" + e);
        }
    }

    @FXML
    HBox contentArea;

    private MedicalManage manageManage = new MedicalManage();

    private AllPatients allPatients = new AllPatients();

    private BookingManage bookingManage = new BookingManage();

    private DataView dataView = new DataView();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        switchContentByNav.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                contentArea.getChildren().clear();
                if (newValue.equals("medicalmanage")){
                    contentArea.getChildren().add(manageManage);
                }else if (newValue.equals("allpatients")){
                    contentArea.getChildren().add(allPatients);
                }else if (newValue.equals("bookingmanage")){
                    contentArea.getChildren().add(bookingManage);
                }else if (newValue.equals("dataview")){
                    contentArea.getChildren().add(dataView);
                }else {
                    logger.warn("laber switchContentByNav is null!");
                }
            }
        });

        contentArea.getChildren().add(manageManage);
    }
}
