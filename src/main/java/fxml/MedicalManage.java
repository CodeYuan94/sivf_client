package fxml;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @ClassName MedicalManage
 * @Description 病历管理
 * @Author hy
 * @Date 2020-06-22 16:38
 * @Version 1.0
 */
public class MedicalManage extends HBox {

    private static final Logger logger = LoggerFactory.getLogger(MedicalManage.class);

    public MedicalManage(){
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/medicalmanage.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        }catch (IOException exception){
            exception.getStackTrace();
            logger.error("MedicalManage init error :" + exception);
        }
    }

    @FXML
    MedicalManageList medicalManageList;
}
