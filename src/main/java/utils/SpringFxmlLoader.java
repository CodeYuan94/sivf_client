package utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.util.Callback;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author yuan
 * @project SIVF
 * @description TODO
 * @date 2020/6/24 12:00
 **/
@Component
public class SpringFxmlLoader extends FXMLLoader {

    public static final ApplicationContext APPLICATION_CONTEXT
            = new ClassPathXmlApplicationContext("classpath:spring.xml");

//    @Autowired
//    private ResourceBundle resourceBundle;

    public <T extends Node> T load(String url) {
        try (InputStream fxmlStream = getClass().getResourceAsStream(url)) {
            super.setLocation(this.getClass().getClassLoader().getResource("/"));
//            super.setResources(resourceBundle);
            super.setControllerFactory(new Callback<Class<?>, Object>() {
                @Override
                public Object call(Class<?> clazz) {
                    return APPLICATION_CONTEXT.getBean(clazz);
                }
            }); return this.load(fxmlStream);
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }
}

