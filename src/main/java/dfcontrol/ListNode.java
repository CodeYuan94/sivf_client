package dfcontrol;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import java.io.IOException;

/**
 * @ClassName ListNode
 * @Description 患者列表选项
 * @Author hy
 * @Date 2020-06-22 20:18
 * @Version 1.0
 */
public class ListNode extends HBox {

    public ListNode(String pid,String name,String sex,String age,String phone,String hosCard,String treatStage,String operated){
        FXMLLoader fl = new FXMLLoader(getClass().getClassLoader().getResource("dfcontrol/listNode.fxml"));
        fl.setRoot(this);
        fl.setController(this);
        try{
            fl.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        this.name.setText(name);
        this.sex.setText(sex);
        this.pid.setText(pid);
        this.name.setText(name);
        this.age.setText(age);
        this.phone.setText(phone);
        this.hosCard.setText(hosCard);
        this.treatStage.setText(treatStage);
        this.operated.setText(operated);
    }

    @FXML Label name;//姓名
    @FXML Label treatStage;//就诊阶段
    @FXML Label pid;//pid
    @FXML Label sex;//性别
    @FXML Label age;//年龄
    @FXML Label phone;//联系方式
    @FXML Label hosCard;//就诊卡号
    @FXML Label operated; //操作标记

    public void setSelected(){
        name.setStyle("-fx-text-fill: white;");
        treatStage.setStyle("-fx-text-fill: white;");
    }

    public void unSelected(){
        name.setStyle("-fx-text-fill: black;");
        treatStage.setStyle("-fx-text-fill: black;");
    }

    public String getName() {
        return name.getText();
    }

    public String getTreatStage() {
        return treatStage.getText();
    }

    public String getPid() {
        return pid.getText();
    }

    public String getSex() {
        return sex.getText();
    }

    public String getAge() {
        return age.getText();
    }

    public String getPhone() {
        return phone.getText();
    }

    public String getHosCard() {
        return hosCard.getText();
    }

    public String getOperated() {
        return operated.getText();
    }

}
