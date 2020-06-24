package fxml;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static utils.ComUtil.setAbsoluteWidth;

/**
 * @ClassName NavCode
 * @Description 选项菜单表
 * @Author hy
 * @Date 2020-06-22 10:38
 * @Version 1.0
 */
public class NavCode extends VBox implements Initializable {

    private static final Logger logger = LoggerFactory.getLogger(NavCode.class);

    public NavCode(String navImgUrl,String navText){
        FXMLLoader fl = new FXMLLoader(getClass().getClassLoader().getResource("fxml/navcode.fxml"));
        fl.setRoot(this);
        fl.setController(this);
        try{
            fl.load();
        }
        catch (IOException e){
           logger.error("NavCode init false :" + e);
        }

        this.setNavCodeImg(navImgUrl);
        this.navTitle.setText(navText);
    }

    double screenWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();

    double navWidth = screenWidth * 0.050;
    double sepWidth = screenWidth * 0.048;
    double navImgWidth = screenWidth * 0.025;

    @FXML
    VBox navRoot;

    @FXML
    ImageView nodeImg;

    @FXML
    Label navTitle;

    @FXML
    Separator navSep;

    public void setNavCodeImg(String imgUrl){
        Image img = new Image(imgUrl);
        nodeImg.setFitHeight(navImgWidth);
        nodeImg.setFitWidth(navImgWidth);
        nodeImg.setImage(img);
    }

    String navCodeImgName;

    public String getNodeImgName() {
        return navCodeImgName;
    }

    public void setNodeImgName(String nodeImgName) {
        this.navCodeImgName = nodeImgName;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setAbsoluteWidth(navRoot,navWidth);
        setAbsoluteWidth(navSep,sepWidth);
    }
}
