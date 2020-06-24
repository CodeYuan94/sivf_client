package fxml;

import dfcontrol.DfTextField;
import dfcontrol.SubmitButton;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

import static fxml.Home.maskLayTitle;
import static utils.ComUtil.*;

/**
 * @ClassName UserInfoEdit
 * @Description 用户信息编辑页
 * @Author hy
 * @Date 2020-06-18 21:39
 * @Version 1.0
 */
public class UserInfoEdit extends VBox implements Initializable {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoEdit.class);

    public UserInfoEdit(){
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/userInfoEdit.fxml"));
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
    DfTextField realName;

    @FXML
    DfTextField userName;

    @FXML
    PasswordField psd;

    @FXML
    PasswordField surePsd;

    @FXML
    SubmitButton back;

    @FXML
    VBox outerVBox;

    String saveDir = System.getProperty("user.dir")
            + File.separator + "uploads"
            + File.separator + "userAvatar";
    File avaFolder = new File(saveDir);

    @FXML
    public void uploadAvatar(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("选择文件夹");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.dir")));
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images","*.*"),
                new FileChooser.ExtensionFilter("JPG","*.jpg"),
                new FileChooser.ExtensionFilter("PNG","*.png")
        );
        Stage stage = (Stage) outerVBox.getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);

        if (file != null){
            System.out.println("打印文件目录：" + file.getAbsolutePath());
            //写入文件
            if (!avaFolder.exists() && !avaFolder.isDirectory()){
                avaFolder.mkdirs();
            }
            saveLocalFile(file,avaFolder.getAbsolutePath());

            try {
                Platform.runLater(()->{
                    Image image = new Image("file:./uploads/useravatar/" + LOGINUSERCODE +".png");
                    userAvatarImg.setImage(image);
                });
            }catch (Exception e){
                logger.error("avatar img not found");
            }

        }else {
            logger.info("no avatar file");
        }

    }

    public void saveLocalFile(File file,String saveDir){

        try {
            String fileType = file.getName().substring(file.getName().lastIndexOf("."),file.getName().length());

            if (fileType.equals(".png")){
                FileInputStream fis = new FileInputStream(new File(file.getAbsolutePath()));
                FileOutputStream fos = new FileOutputStream(new File(saveDir+"/"+LOGINUSERCODE + ".png"));
                //缓冲
                byte[]  bytes = new byte[4096];
                while(fis.read(bytes) != -1){
                    fos.write(bytes);
                    fos.flush();
                }

                fis.close();
                fos.close();
            }else {
                BufferedImage bim = ImageIO.read(file);
                File output = new File(saveDir+"/"+LOGINUSERCODE +".png");
                ImageIO.write(bim,LOGINUSERCODE +".png",output);
            }

        } catch (IOException e) {
           logger.error("save avatar file false");
        }

    }

    @FXML
    public void toCommit(){
        commonUserAvatar.setImage(userAvatarImg.getImage());
    }
    @FXML
    public void toBack(){
        maskLayTitle.setText("USERINFOVIEW");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        back.setOpenEffect(false);
        loadUserAvatarImg(userAvatarImg);
    }
}
