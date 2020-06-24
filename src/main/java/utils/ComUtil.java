package utils;

import dfcontrol.ListNode;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.io.File;

/**
 * @ClassName ComUtil
 * @Description 画面工具类
 * @Author hy
 * @Date 2020-06-18 11:48
 * @Version 1.0
 */
public class ComUtil{

    public static int fontSize = 12;

    public static String LOGINUSERCODE = "0812";
    public static String LOGINUSERNAME = "何艺";

    public static ImageView commonUserAvatar = new ImageView();

    public static Label switchContentByNav = new Label();

    /**
     * 控件焦点以回车跳转
     */
    public static void enterToTab(Node node){
        node.setOnKeyPressed(event -> {
            if (event.getCode().equals(KeyCode.ENTER)){
                KeyEvent tabKey = new KeyEvent(KeyEvent.KEY_PRESSED,
                        KeyCode.TAB.toString(), KeyCode.TAB.toString(), KeyCode.TAB,
                        event.isShiftDown(), false, false, false);
                node.fireEvent(tabKey);
            }
        });
    }

    /**
     * 鼠标悬停图标切换
     */
    public static void imageSwitchByHover(HBox reg, ImageView img, Image i1,Image i2){
        img.setImage(i1);
        reg.setOnMouseExited(event -> {
            img.setImage(i1);
        });
        reg.setOnMouseEntered(event -> {
            img.setImage(i2);
        });
    }

    /**
     * 加载用户头像
     */
    public static void loadUserAvatarImg(ImageView view){
        Image avator = new Image("file:./uploads/useravatar/default.png");
        File file = new File(System.getProperty("user.dir") + "/uploads/useravatar/" + LOGINUSERCODE + ".png");

        if (!file.exists()){
            view.setImage(avator);
        }else {
            Image userAva = new Image("file:./uploads/useravatar/"  + LOGINUSERCODE + ".png");
            view.setImage(userAva);
        }
    }

    /**
     * 鼠标悬停、改变手势
     * Pane
     */
    public static void setButtonStyle(Pane pane){
        pane.setOnMouseEntered(event -> {
            pane.setCursor(Cursor.HAND);
        });
    }

    /**
     * 鼠标悬停、改变手势
     * Node
     */
    public static void setButtonStyle(Node node){
        node.setOnMouseEntered(event -> {
            node.setCursor(Cursor.HAND);
        });
    }

    /**
     * 定义绝对宽度
     * Pane
     */
    public static void setAbsoluteWidth(Pane pane,double width){
        pane.setPrefWidth(width);
        pane.setMaxWidth(width);
        pane.setMinWidth(width);
    }

    /**
     * 定义绝对宽度
     * Control
     */
    public static void setAbsoluteWidth(Control control, double width){
        control.setPrefWidth(width);
        control.setMaxWidth(width);
        control.setMinWidth(width);
    }

    /**
     * 设置背景虚化阴影
     */
    public static void setDropShadow(Pane pane,double offsetX,double offsetY){
        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(new Color(0,0,0,0.15));
        dropShadow.setOffsetX(offsetX);
        dropShadow.setSpread(offsetY);
        pane.setEffect(dropShadow);
    }

    /**
     * 多组treeview共用一个焦点
     */
    public static void shareFocusByTreeViews(TreeView tv1, TreeView tv2){
        tv1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<HBox>>() {
            @Override
            public void changed(ObservableValue<? extends TreeItem<HBox>> observable, TreeItem<HBox> oldValue, TreeItem<HBox> newValue) {
                if (!tv2.getSelectionModel().isEmpty() && null != newValue){
                    TreeItem<HBox> ti = (TreeItem<HBox>) tv2.getSelectionModel().getSelectedItem();

                    ListNode node = (ListNode) ti.getValue();
                    node.unSelected();

                    ListNode node1 = (ListNode) newValue.getValue();
                    node1.setSelected();
                    tv2.getSelectionModel().select(-1);
                }

            }
        });
    }



}
