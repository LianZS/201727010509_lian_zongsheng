/**
 * Sample Skeleton for 'factory.fxml' Controller Class
 */

package cn.edu.scau.cmi.lianzongsheng.FactoryMethod;

import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class FactoryMethodController {

    public String output = "";
    public static PorkMeatFactory porkMeatFactory = new PorkMeatFactory();
    public static BeefMeatFactory beefMeatFactory = new BeefMeatFactory();
    public static ChickenMeatFactory chickenMeatFactory = new ChickenMeatFactory();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="produce"
    private Button produceButton; // Value injected by FXMLLoader

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
    void produce(){
        fmArea.appendText(output + "\n");
    }

    @FXML
    void selectPork(ActionEvent event) {
        output = porkMeatFactory.produceMeat();
    }

    @FXML
    void selectBeef(ActionEvent event) {
        output = beefMeatFactory.produceMeat();
    }

    @FXML
    void selectChicken(ActionEvent event) {
        output = chickenMeatFactory.produceMeat();
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
