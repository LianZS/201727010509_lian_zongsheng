package cn.edu.scau.cmi.lianzongsheng.transparentcomposite;

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

public class TransparentCompositeController {
    @FXML
    private TextArea result;

    @FXML
    void back(ActionEvent event) throws IOException {
        ObservableList<Stage> stage = FXRobotHelper.getStages();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/cn/edu/scau/cmi/lianzongsheng/zonghexingshiyan/fxml/MainInterface.fxml")));
        stage.get(0).setTitle("综合性实验");
        stage.get(0).setScene(scene);
    }

    @FXML
    void show(ActionEvent event) throws IOException {
        TransparentComponent_company company = new TransparentComposite_dept();
        TransparentComponent_company xuanchuan_dept = new TransparentComposite_dept();
        TransparentComponent_company IT_dept = new TransparentComposite_dept();
        TransparentComponent_company kaifa_dept = new TransparentComposite_dept();
        TransparentComponent_company ceshi_dept = new TransparentComposite_dept();
     

        ((TransparentComposite_dept)company).setDept_name("**ֱ直播");
        ((TransparentComposite_dept)xuanchuan_dept).setDept_name("宣传部");
        ((TransparentComposite_dept)IT_dept).setDept_name("IT部");
        ((TransparentComposite_dept)kaifa_dept).setDept_name("开发组");
        ((TransparentComposite_dept)ceshi_dept).setDept_name("测试组");

        TransparentComponent_company xuanchuan1 = new TransparentLeaf_employee();
        TransparentComponent_company xuanchuan2 = new TransparentLeaf_employee();
        TransparentComponent_company kaifa1 = new TransparentLeaf_employee();
        TransparentComponent_company kaifa2 = new TransparentLeaf_employee();
        TransparentComponent_company kaifa3 = new TransparentLeaf_employee();
        TransparentComponent_company ceshi1 = new TransparentLeaf_employee();

        ((TransparentLeaf_employee)xuanchuan1).setEmp_name("xuanchuan1");
        ((TransparentLeaf_employee)xuanchuan2).setEmp_name("xuanchuan2");
        ((TransparentLeaf_employee)kaifa1).setEmp_name("kaifa1");
        ((TransparentLeaf_employee)kaifa2).setEmp_name("kaifa2");
        ((TransparentLeaf_employee)kaifa3).setEmp_name("kaifa3");
        ((TransparentLeaf_employee)ceshi1).setEmp_name("ceshi1");

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

        List employees = company.getChildren();
        result.appendText(JSON.toJSONString(employees, true));


    }
}
