/**
 * Sample Skeleton for 'factory.fxml' Controller Class
 */

package cn.edu.scau.cmi.lianzongsheng.SimpleFactory;

import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class SimpleFactoryController {

    public String kind;
    public static Factory factory = new Factory();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="beefitem"
    private MenuItem beefitem; // Value injected by FXMLLoader

    @FXML // fx:id="chickenitem"
    private MenuItem chickenitem; // Value injected by FXMLLoader

    @FXML // fx:id="fmArea"
    private TextArea fmArea; // Value injected by FXMLLoader

    @FXML // fx:id="porkitem"
    private MenuItem porkitem; // Value injected by FXMLLoader

    @FXML // fx:id="fmButton"
    private MenuButton fmButton; // Value injected by FXMLLoader

    @FXML
    void select(ActionEvent event) {

    }

    @FXML
    void selectPork(ActionEvent event) {
        kind = "pork";
        fmArea.appendText(factory.meatkind(kind) + "\n");
    }

    @FXML
    void selectBeef(ActionEvent event) {
        kind = "beef";
        fmArea.appendText(factory.meatkind(kind) + "\n");
    }

    @FXML
    void selectChicken(ActionEvent event) {
        kind = "chicken";
        fmArea.appendText(factory.meatkind(kind) + "\n");
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
        assert beefitem != null : "fx:id=\"beefitem\" was not injected: check your FXML file 'FactoryMethod.fxml'.";
        assert chickenitem != null : "fx:id=\"chickenitem\" was not injected: check your FXML file 'FactoryMethod.fxml'.";
        assert fmArea != null : "fx:id=\"fmArea\" was not injected: check your FXML file 'FactoryMethod.fxml'.";
        assert porkitem != null : "fx:id=\"porkitem\" was not injected: check your FXML file 'FactoryMethod.fxml'.";
        assert fmButton != null : "fx:id=\"fmButton\" was not injected: check your FXML file 'FactoryMethod.fxml'.";
    }
}
