package fxml;

import dao.impl.PatInfMapperImpl;
import dfcontrol.ListNode;
import dfcontrol.OptionTag;
import entity.view.PatInf;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import org.controlsfx.glyphfont.Glyph;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import utils.ApplicationUtil;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import static utils.ComUtil.*;

/**
 * @ClassName MedicalManageList
 * @Description 患者列表
 * @Author hy
 * @Date 2020-06-22 16:55
 * @Version 1.0
 */

public class MedicalManageList extends VBox implements Initializable {

    private static final Logger logger = LoggerFactory.getLogger(MedicalManageList.class);

    private PatInfMapperImpl patInfMapperImpl = (PatInfMapperImpl)ApplicationUtil.getApplicationXML().getBean("patInfMapperImpl");

    public MedicalManageList(){
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/medicalmanagelist.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        }catch (IOException exception){
            exception.getStackTrace();
        }
    }

    @FXML
    VBox listRoot;

    @FXML
    Button searchBtn;

    @FXML
    Glyph searchTag;

    @FXML
    HBox cycleCondition;

    @FXML
    Text noSeeNum;

    @FXML
    TreeView noSeeTree;

    @FXML
    Text seeNum;

    @FXML
    TreeView seeTree;

    OptionTag ivfTag = new OptionTag("icon/ivf.png","IVF");
    OptionTag iuiTag = new OptionTag("icon/iui.png","IUI");
    OptionTag fsTag = new OptionTag("icon/fs.png","复苏");

    private Label cycleFlg = new Label("");

    private void setChooseEvent(OptionTag ot,String tag){
        ot.setOnMouseClicked(event -> {
            if (cycleFlg.getText().equals(tag)){
                cycleFlg.setText(tag + "no");
            }else {
                cycleFlg.setText(tag);
            }
        });
    }



    String loginName = "王二";
    String passWord = "123";

    @FXML
    public void toSearch(){
        System.out.println("spring-mybatis成功，输出：" );

        List<PatInf> patInfs = patInfMapperImpl.selectAll();

        for (PatInf patInf : patInfs) {
            System.out.println("患者信息："+patInf);
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        double screenWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();

        double patientListWidth = screenWidth * 0.111;
        setAbsoluteWidth(listRoot,patientListWidth);
        setDropShadow(listRoot,1.0,0.3);

        setButtonStyle(searchBtn);

        searchTag.setColor(javafx.scene.paint.Color.LIGHTGRAY);

        setChooseEvent(ivfTag,"ivf");
        setChooseEvent(iuiTag,"iui");
        setChooseEvent(fsTag,"fs");

        cycleCondition.getChildren().addAll(ivfTag,iuiTag,fsTag);

        cycleFlg.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!oldValue.equals(newValue)){
                    if (newValue.equals("ivf")){
                        ivfTag.setOptionImg("icon/ivfselected.png");
                        iuiTag.setOptionImg("icon/iui.png");
                        fsTag.setOptionImg("icon/fs.png");
                    }else if (newValue.equals("ivfno")){
                        ivfTag.setOptionImg("icon/ivf.png");
                    }else if (newValue.equals("iui")){
                        iuiTag.setOptionImg("icon/iuiselected.png");
                        ivfTag.setOptionImg("icon/ivf.png");
                        fsTag.setOptionImg("icon/fs.png");
                    }else if (newValue.equals("iuino")){
                        iuiTag.setOptionImg("icon/iui.png");
                    }else if (newValue.equals("fs")){
                        fsTag.setOptionImg("icon/fsselected.png");
                        ivfTag.setOptionImg("icon/ivf.png");
                        iuiTag.setOptionImg("icon/iui.png");
                    }else if (newValue.equals("fsno")){
                        fsTag.setOptionImg("icon/fs.png");
                    }
                }
            }
        });

        shareFocusByTreeViews(noSeeTree,seeTree);
        shareFocusByTreeViews(seeTree,noSeeTree);

    }
}
