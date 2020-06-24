package fxml;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static fxml.Home.maskLayTitle;
import static utils.ComUtil.*;

/**
 * @ClassName Menu
 * @Description 顶部菜单栏
 * @Author hy
 * @Date 2020-06-18 17:40
 * @Version 1.0
 */
public class Menu extends VBox implements Initializable {
    private static final Logger logger = LoggerFactory.getLogger(Menu.class);

    public Menu(){
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/menu.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        }catch (IOException exception){
            logger.error("error occur :" + exception);
        }
    }

    @FXML
    ImageView userImg;

    @FXML
    Label userName;

    @FXML
    ComboBox funcList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        userName.setText(LOGINUSERNAME);

        userImg.imageProperty().bindBidirectional(commonUserAvatar.imageProperty());

        ObservableList options = FXCollections.observableArrayList("基本信息","退出登录");
        funcList.setItems(options);

        funcList.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                if (newValue.equals("基本信息")){
                    maskLayTitle.setText("USERINFOVIEW");
                }else if (newValue.equals("退出登录")){
                    System.exit(0);
                }
                Platform.runLater(()->{
                    funcList.setValue("");
                    }
                );
            }
        });
    }
}
