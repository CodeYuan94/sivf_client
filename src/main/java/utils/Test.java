package utils;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLController;
import de.felixroske.jfxsupport.FXMLView;
import entity.view.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeView;
import org.springframework.beans.factory.annotation.Autowired;
import service.view.UserMapper;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @ClassName Test
 * @Description todo
 * @Author hy
 * @Date 2020-06-23 10:11
 * @Version 1.0
 */
@FXMLView
public class Test extends AbstractFxmlView implements Initializable {
    @Autowired
    UserMapper userMapper;

    List<User> userInfo = userMapper.getusers();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("spring-mybatis成功，输出：" + userInfo);
    }


}
