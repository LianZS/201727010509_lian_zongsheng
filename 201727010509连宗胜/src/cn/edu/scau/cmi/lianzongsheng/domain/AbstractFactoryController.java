package cn.edu.scau.cmi.lianzongsheng.domain;

import cn.edu.scau.cmi.lianzongsheng.abstractFactory.AbstractFactory;
import cn.edu.scau.cmi.lianzongsheng.domainAbstractClass.Meat;

import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AbstractFactoryController {

        AbstractFactory factory = null;
        Meat meat = null;

        @FXML
        private MenuButton afBrand;

        @FXML
        private MenuItem afWens;

        @FXML
        private MenuItem afTianbang;

        @FXML
        private MenuItem afPork;

        @FXML
        private MenuItem afAonong;

        @FXML
        private MenuItem afChicken;

        @FXML
        private MenuButton afMeat;

        @FXML
        private TextField factoryText;

        @FXML
        private TextArea fmArea;

        @FXML
        private MenuItem afBeef;

        @FXML
        private TextField meatText;

        @FXML
        void selectBrand(ActionEvent event) {

        }

        @FXML
        void selectWens(ActionEvent event) {
            factory = AbstractFactory.getFactory("温氏");
            factoryText.setText("温氏");
        }

        @FXML
        void selectAonong(ActionEvent event) {
            factory = AbstractFactory.getFactory("安农");
            factoryText.setText("安农");
        }

        @FXML
        void selectTianbang(ActionEvent event) {
            factory = AbstractFactory.getFactory("天邦");
            factoryText.setText("天邦");
        }

        @FXML
        void selectMeat(ActionEvent event) {

        }

        @FXML
        void selectPork(ActionEvent event) {
            meat = factory.producePork();
            fmArea.appendText(meat.produce() + "\n");
            meatText.setText("猪肉");
        }

        @FXML
        void selectBeef(ActionEvent event) {
            meat = factory.produceBeef();
            fmArea.appendText(meat.produce() + "\n");
            meatText.setText("牛肉");
        }

        @FXML
        void selectChicken(ActionEvent event) {
            meat = factory.produceChicken();
            fmArea.appendText(meat.produce() + "\n");
            meatText.setText("鸡肉");
        }

        @FXML
        void back(ActionEvent event) throws IOException {
            ObservableList<Stage> stage = FXRobotHelper.getStages();
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/zonghexingshiyan/fxml/MainInterface.fxml")));
            stage.get(0).setTitle("综合性实验");
            stage.get(0).setScene(scene);
        }

        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
            assert afBrand != null : "fx:id=\"afBrand\" was not injected: check your FXML file 'AbstractFactory.fxml'.";
            assert afWens != null : "fx:id=\"afWens\" was not injected: check your FXML file 'AbstractFactory.fxml'.";
            assert afTianbang != null : "fx:id=\"afTianbang\" was not injected: check your FXML file 'AbstractFactory.fxml'.";
            assert afPork != null : "fx:id=\"afPork\" was not injected: check your FXML file 'AbstractFactory.fxml'.";
            assert afAonong != null : "fx:id=\"afAonong\" was not injected: check your FXML file 'AbstractFactory.fxml'.";
            assert afChicken != null : "fx:id=\"afChicken\" was not injected: check your FXML file 'AbstractFactory.fxml'.";
            assert afMeat != null : "fx:id=\"afMeat\" was not injected: check your FXML file 'AbstractFactory.fxml'.";
            assert factoryText != null : "fx:id=\"factoryText\" was not injected: check your FXML file 'AbstractFactory.fxml'.";
            assert fmArea != null : "fx:id=\"fmArea\" was not injected: check your FXML file 'AbstractFactory.fxml'.";
            assert afBeef != null : "fx:id=\"afBeef\" was not injected: check your FXML file 'AbstractFactory.fxml'.";
            assert meatText != null : "fx:id=\"meatText\" was not injected: check your FXML file 'AbstractFactory.fxml'.";

        }
    }
