package fxml;

import dfcontrol.Tray;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static fxml.Home.homeStage;

/**
 * @ClassName Login
 * @Description todo
 * @Author hy
 * @Date 2020-06-18 11:59
 * @Version 1.0
 */
public class Login implements Initializable {

    private static final Logger logger = LoggerFactory.getLogger(Login.class);

    @FXML
    Pane loginRoot;

    @FXML
    TextField username;

    @FXML
    PasswordField password;

    @FXML
    TextField passwordText;

    @FXML
    ImageView seePsdView;

    @FXML
    Text tip;

    @FXML
    Text findPsd;

    @FXML
    Tray tray;

    @FXML
    public void toLogin(){
        //登录发起netty请求，错误信息需要返回在tip上提示

        try {
            Stage stage = (Stage) loginRoot.getScene().getWindow();
            stage.close();
            Parent root  = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/home.fxml"));
            Scene scene = new Scene(root);
            homeStage.setScene(scene);
            homeStage.initStyle(StageStyle.DECORATED);
            homeStage.setMaximized(true);
            homeStage.setTitle("sivf");
            homeStage.setOnCloseRequest(event -> {
                System.exit(0);
            });
            homeStage.show();

        } catch (IOException e) {
            e.printStackTrace();
            logger.error("toLogin() error occur :" + e);
        }
    }

    private void clearTip(TextField textField){
        textField.setOnMouseClicked(event -> {
            tip.setText("");
        });
    }

    private double xOffset = 0;
    private double yOffset = 0;

    private Image noeye = new Image("img/noeye.png");
    private Image eye = new Image("img/eye.png");

    private CheckBox seePsdFlg = new CheckBox();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tray.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });

        tray.setOnMouseDragged(event -> {
            Stage stage = (Stage) loginRoot.getScene().getWindow();
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        });

        tray.getMinHBox().setOnMouseClicked(event -> {
            Stage stage = (Stage) loginRoot.getScene().getWindow();
            stage.setIconified(true);
        });

        tray.getCloseHBox().setOnMouseClicked(event -> {
            Stage stage = (Stage) loginRoot.getScene().getWindow();
            stage.close();
        });

        clearTip(username);
        clearTip(passwordText);
        clearTip(password);

        passwordText.managedProperty().bind(seePsdFlg.selectedProperty());
        passwordText.visibleProperty().bind(seePsdFlg.selectedProperty());

        password.managedProperty().bind(seePsdFlg.selectedProperty().not());
        password.visibleProperty().bind(seePsdFlg.selectedProperty().not());

        passwordText.textProperty().bindBidirectional(password.textProperty());

        seePsdView.setOnMouseClicked(event -> {
            if (seePsdFlg.isSelected()){
                seePsdFlg.setSelected(false);
                seePsdView.setImage(noeye);
            }else {
                seePsdFlg.setSelected(true);
                seePsdView.setImage(eye);
            }
        });

        findPsd.setOnMouseClicked(event -> {
            tip.setText("忘记密码请联系管理人员");
            findPsd.setDisable(true);
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(2000);
                    Platform.runLater(()->{
                        tip.setText("");
                        findPsd.setDisable(false);
                    });
                } catch (InterruptedException e) {
                    logger.error("findpsd method error occured :" + e);
                }
            });
            thread.setDaemon(true);
            thread.start();
        });
    }
}
