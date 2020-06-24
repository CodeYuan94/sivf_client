package fxml;

import dfcontrol.SubmitButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static fxml.Home.maskLayTitle;
import static utils.ComUtil.*;

/**
 * @ClassName UserInfoView
 * @Description 用户信息展示页
 * @Author hy
 * @Date 2020-06-18 20:42
 * @Version 1.0
 */
public class UserInfoView extends VBox implements Initializable {

    public UserInfoView(){
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/userInfoView.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        }catch (IOException exception){
            exception.getStackTrace();
        }
    }

    @FXML
    ImageView userAvatarImg;

    @FXML
    Text realname;

    @FXML
    Text username;

    @FXML
    Text position;

    @FXML
    SubmitButton off;

    @FXML
    public void toEdit(){
        maskLayTitle.setText("USERINFOEDIT");
    }

    @FXML
    public void toOff(){
        maskLayTitle.setText("0");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        off.setOpenEffect(false);
        userAvatarImg.imageProperty().bindBidirectional(commonUserAvatar.imageProperty());
    }
}
