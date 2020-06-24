package dfcontrol;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static utils.ComUtil.imageSwitchByHover;

/**
 * @ClassName Tray
 * @Description 托盘栏
 * @Author hy
 * @Date 2020-06-18 13:27
 * @Version 1.0
 */
public class Tray extends HBox implements Initializable {

    public Tray(){
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("dfcontrol/tray.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        }catch (
                IOException exception){
            exception.getStackTrace();
        }
    }

    @FXML
    HBox minHBox;

    @FXML
    HBox closeHBox;

    @FXML
    ImageView minImg;

    @FXML
    ImageView closeImg;

    public HBox getMinHBox() {
        return minHBox;
    }

    public void setMinHBox(HBox minHBox) {
        this.minHBox = minHBox;
    }

    public HBox getCloseHBox() {
        return closeHBox;
    }

    public void setCloseHBox(HBox closeHBox) {
        this.closeHBox = closeHBox;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image min = new Image("img/min.png");
        Image minEnter = new Image("img/minenter.png");
        imageSwitchByHover(minHBox,minImg,min,minEnter);

        Image close = new Image("img/close.png");
        Image closeEnter = new Image("img/closeenter.png");
        imageSwitchByHover(closeHBox,closeImg,close,closeEnter);
    }
}
