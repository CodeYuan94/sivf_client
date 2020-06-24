package dfcontrol;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @ClassName SubmitButton
 * @Description 提交按钮
 * @Author hy
 * @Date 2020-06-18 14:01
 * @Version 1.0
 */
public class SubmitButton extends Button implements Initializable {

    private boolean openEffect = true;

    public SubmitButton(){
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("dfcontrol/submitButton.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        }catch (IOException exception){
            exception.getStackTrace();
        }
    }

    /**
     * 鼠标悬停效果关闭
     */
    public void setOpenEffect(boolean eff){
        openEffect = eff;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.setText(name);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (openEffect){
            this.setOnMouseEntered(event -> {
                setCursor(Cursor.HAND);
                setStyle("-fx-background-color: #A4BAFF;");
            });

            this.setOnMouseExited(event -> {
                setStyle("-fx-background-color: #86A4FF;");
            });
        }
    }
}
