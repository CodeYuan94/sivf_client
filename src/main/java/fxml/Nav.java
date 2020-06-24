package fxml;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static utils.ComUtil.*;

/**
 * @ClassName Nav
 * @Description 功能操作台画面
 * @Author hy
 * @Date 2020-06-19 21:27
 * @Version 1.0
 */
public class Nav extends HBox implements Initializable {

    private static final Logger logger = LoggerFactory.getLogger(Nav.class);

    public Nav(){
        FXMLLoader fl = new FXMLLoader(getClass().getClassLoader().getResource("fxml/nav.fxml"));
        fl.setRoot(this);
        fl.setController(this);
        try{
            fl.load();
        }
        catch (IOException e){
            e.printStackTrace();
            logger.error("Nav init error :" + e);
        }
    }

    @FXML
    VBox funcRow;

    @FXML
    ToggleButton funcTag;

    @FXML
    VBox optionRow;

    @FXML
    VBox optionList;

    NavCode medicalManage = new NavCode("icon/medicalmanage.png","病历管理");
    NavCode allPatients = new NavCode("icon/allpatients.png","全部患者");
    NavCode bookingManage = new NavCode("icon/bookingmanage.png","预约管理");
    NavCode dataView = new NavCode("icon/dataview.png","数据视图");

    /**
     * 操作台选中/取消画面控制
     */
    private void setNavNodeControl(NavCode code){
        CheckBox cb = new CheckBox();
        code.setOnMouseClicked(event -> {
            cb.setSelected(true);
            switchContentByNav.setText(code.getNodeImgName());
        });

        cb.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (newValue){
                    for (int i=0;i<optionList.getChildren().size();i++){
                        NavCode oldSelectCode = (NavCode) optionList.getChildren().get(i);
                        if (cb.isSelected()){
                            oldSelectCode.setNavCodeImg("icon/"+oldSelectCode.getNodeImgName()+".png");
                        }
                    }
                    cb.setSelected(false);
                    code.setNavCodeImg("icon/"+code.getNodeImgName()+"selected.png");
                }
            }
        });
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        double screenWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();

        double funcWidth = screenWidth * 0.015;
        double navWidth = screenWidth * 0.052;

        setAbsoluteWidth(funcRow,funcWidth);
        setAbsoluteWidth(optionList,navWidth);

        funcTag.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (newValue){
                    funcTag.setStyle("-fx-background-color: black;");
                    if (optionRow.getChildren().size() == 0){
                        optionRow.getChildren().add(optionList);
                    }
                }else {
                    funcTag.setStyle("-fx-background-color: transparent;");
                    optionRow.getChildren().remove(optionList);
                }
            }
        });
        funcTag.setSelected(true);

        medicalManage.setNodeImgName("medicalmanage");
        allPatients.setNodeImgName("allpatients");
        bookingManage.setNodeImgName("bookingmanage");
        dataView.setNodeImgName("dataview");

        optionList.getChildren().addAll(medicalManage,allPatients,bookingManage,dataView);

        setButtonStyle(medicalManage);
        setButtonStyle(allPatients);
        setButtonStyle(bookingManage);
        setButtonStyle(dataView);

        setNavNodeControl(medicalManage);
        setNavNodeControl(allPatients);
        setNavNodeControl(bookingManage);
        setNavNodeControl(dataView);

        medicalManage.setNavCodeImg("icon/medicalmanageselected.png");
    }

}
