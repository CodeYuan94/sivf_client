package fxml;

import dfcontrol.Tray;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.StringUtils;

import java.net.URL;
import java.util.ResourceBundle;

import static utils.ComUtil.commonUserAvatar;
import static utils.ComUtil.loadUserAvatarImg;

/**
 * @ClassName Home
 * @Description todo
 * @Author hy
 * @Date 2020-06-18 17:29
 * @Version 1.0
 */
public class Home implements Initializable {

    private static final Logger logger = LoggerFactory.getLogger(Home.class);

    public static Stage homeStage = new Stage();

    @FXML
    StackPane outerPane;

    @FXML
    VBox maskLayer;

    @FXML
    VBox popScene;

    @FXML
    HBox popContent;

    @FXML
    Tray tray;

    public static Label maskLayTitle = new Label();

    UserInfoView infoView = new UserInfoView();

    UserInfoEdit infoEdit = new UserInfoEdit();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        outerPane.getChildren().removeAll(maskLayer,popScene);

        maskLayTitle.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (StringUtils.isNotNullOrEmpty(newValue) && !newValue.equals("0")){
                    if (!outerPane.getChildren().contains(maskLayer)){
                        outerPane.getChildren().addAll(maskLayer, popScene);
                    }
                    switch (newValue){
                        case "USERINFOVIEW":
                            popContent.getChildren().clear();
                            popContent.getChildren().add(infoView);
                            break;
                        case "USERINFOEDIT":
                            popContent.getChildren().clear();
                            popContent.getChildren().add(infoEdit);
                            break;
                    }
                }else if (newValue.equals("0")){//关闭遮罩层
                    outerPane.getChildren().removeAll(maskLayer,popScene);
                }

            }
        });

        tray.getMinHBox().setDisable(true);
        tray.getMinHBox().setVisible(false);
        tray.getCloseHBox().setOnMouseClicked(event -> {
            outerPane.getChildren().removeAll(maskLayer,popScene);
        });

        loadUserAvatarImg(commonUserAvatar);
    }
}
