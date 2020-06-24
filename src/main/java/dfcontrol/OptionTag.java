package dfcontrol;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @ClassName OptionTag
 * @Description 图标 文字 toggleButton
 * @Author hy
 * @Date 2020-06-22 17:47
 * @Version 1.0
 */
public class OptionTag extends VBox implements Initializable {

    public OptionTag(String imgUrl,String text){
        FXMLLoader fl = new FXMLLoader(getClass().getClassLoader().getResource("dfcontrol/optionTag.fxml"));
        fl.setRoot(this);
        fl.setController(this);
        try{
            fl.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        setOptionImg(imgUrl);
        itemText.setText(text);
    }

    double screenWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();

    double rootWidth = screenWidth * 0.025;
    double imgWidth = screenWidth * 0.020;

    @FXML
    VBox optionRoot;

    @FXML
    ImageView optionImg;

    @FXML
    Text itemText;


    public void setOptionImg(String imgUrl){
        Image img = new Image(imgUrl);
        optionImg.setFitWidth(imgWidth);
        optionImg.setFitHeight(imgWidth);
        optionImg.setImage(img);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        optionRoot.setPrefWidth(rootWidth);
    }
}
