package cn.edu.scau.cmi.lianzongsheng.safeComposite;

import com.alibaba.fastjson.JSON;
import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class SafeCompositeController {

    @FXML
    private TextArea result;

    @FXML
    void show(ActionEvent event) {
        SafeComposite_dept company = new SafeComposite_dept();
        SafeComposite_dept xuanchuan_dept = new SafeComposite_dept();
        SafeComposite_dept IT_dept = new SafeComposite_dept();
        SafeComposite_dept kaifa_dept = new SafeComposite_dept();
        SafeComposite_dept ceshi_dept = new SafeComposite_dept();

        company.setDept_name("**直播");
        xuanchuan_dept.setDept_name("宣传部");
        IT_dept.setDept_name("IT部");
        kaifa_dept.setDept_name("开发组");
        ceshi_dept.setDept_name("测试组");

        SafeLeaf_employee xuanchuan1 = new SafeLeaf_employee();
        SafeLeaf_employee xuanchuan2 = new SafeLeaf_employee();
        SafeLeaf_employee kaifa1 = new SafeLeaf_employee();
        SafeLeaf_employee kaifa2 = new SafeLeaf_employee();
        SafeLeaf_employee kaifa3 = new SafeLeaf_employee();
        SafeLeaf_employee ceshi1 = new SafeLeaf_employee();

        xuanchuan1.setEmp_name("xuanchuan1");
        xuanchuan2.setEmp_name("xuanchuan2");
        kaifa1.setEmp_name("kaifa1");
        kaifa2.setEmp_name("kaifa2");
        kaifa3.setEmp_name("kaifa3");
        ceshi1.setEmp_name("ceshi1");

        xuanchuan_dept.addChild(xuanchuan1);
        xuanchuan_dept.addChild(xuanchuan2);
        kaifa_dept.addChild(kaifa1);
        kaifa_dept.addChild(kaifa2);
        kaifa_dept.addChild(kaifa3);
        ceshi_dept.addChild(ceshi1);

        IT_dept.addChild(kaifa_dept);
        IT_dept.addChild(ceshi_dept);
        company.addChild(xuanchuan_dept);
        company.addChild(IT_dept);

        List employee = company.getChildren();

        result.appendText(JSON.toJSONString(employee, true));
    }

    @FXML
    void back(ActionEvent event) throws IOException {
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/zonghexingshiyan/fxml/MainInterface.fxml")));
        stage.get(0).setTitle("综合性实验");
        stage.get(0).setScene(scene);
    }
}
