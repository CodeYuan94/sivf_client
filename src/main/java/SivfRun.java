import dao.PatInfMapper;
import dao.impl.PatInfMapperImpl;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import utils.SpringFxmlLoader;


public class SivfRun extends Application {

//    private ApplicationContext applicationContext;


    @Override
    public void start(Stage primaryStage) throws Exception {
        SpringFxmlLoader springFxmlLoader = SpringFxmlLoader.APPLICATION_CONTEXT.getBean(SpringFxmlLoader.class);
        Parent root = springFxmlLoader.load(getClass().getClassLoader().getResource("fxml/login.fxml"));

//        applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        FXMLLoader loader = new FXMLLoader();
//        loader.setControllerFactory(applicationContext::getBean);
//        loader.setLocation(getClass().getClassLoader().getResource("fxml/login.fxml"));
//        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.getIcons().add(new Image("img/app.png"));
        primaryStage.setTitle("登录");
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                System.exit(0);
            }
        });
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
