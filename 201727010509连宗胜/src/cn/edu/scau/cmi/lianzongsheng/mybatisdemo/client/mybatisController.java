package cn.edu.scau.cmi.lianzongsheng.mybatisdemo.client;

import cn.edu.scau.cmi.lianzongsheng.mybatisdemo.dao.advisorDao;
import cn.edu.scau.cmi.lianzongsheng.mybatisdemo.dao.studentDao;
import cn.edu.scau.cmi.lianzongsheng.mybatisdemo.dao.teacherDao;
import cn.edu.scau.cmi.lianzongsheng.mybatisdemo.domain.Advisor;
import cn.edu.scau.cmi.lianzongsheng.mybatisdemo.domain.Student;
import cn.edu.scau.cmi.lianzongsheng.mybatisdemo.domain.Teacher;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.List;

public class mybatisController {
    @FXML
    private TextField teacher_name;

    @FXML
    private TextField teacher_id;

    @FXML
    private TextField teacher_id1;

    @FXML
    private TextField student_id;

    @FXML
    private TextField student_id1;

    @FXML
    private Button allRelation;

    @FXML
    private TextField relation_sid;

    @FXML
    private TextField relation_tid1;

    @FXML
    private TextField student_name;

    @FXML
    private Button allStudent;

    @FXML
    private TextField relation_sid1;

    @FXML
    private TextField relation_tid;

    @FXML
    private TextArea information;

    @FXML
    private Button allTeacher;

    public mybatisController() throws IOException {
    }

    public void addStudent(){
        int id = Integer.valueOf(student_id.getText());
        String name = student_name.getText();
        Student student = new Student(id, name);

        studentDao student_insert = AppContext.getBean(studentDao.class);
        student_insert.add(student);
        information.setText("教师信息成功增加");
    }

    public void addTeacher(){
        int id = Integer.valueOf(teacher_id.getText());
        String name = teacher_name.getText();
        Teacher teacher = new Teacher(id, name);

        teacherDao teacher_insert = AppContext.getBean(teacherDao.class);
        teacher_insert.add(teacher);
        information.setText("关系信息成功增加");
    }

    public void addAdvisor(){
        int sid = Integer.valueOf(relation_sid.getText());
        int tid = Integer.valueOf(relation_tid.getText());
        Advisor advisor = new Advisor(sid, tid);
        advisorDao advisor_insert = AppContext.getBean(advisorDao.class);
        advisor_insert.add(advisor);
        information.setText("学生信息成功修改");
    }

    public void updateStudent(){
        int id = Integer.valueOf(student_id.getText());
        String name = student_name.getText();
        Student student = new Student(id, name);
        AppContext.getBean(studentDao.class).update(student);
        information.setText("教师信息成功修改");
    }

    public void updateTeacher(){
        int id = Integer.valueOf(teacher_id.getText());
        String name = teacher_name.getText();
        Teacher teacher = new Teacher(id, name);
        AppContext.getBean(teacherDao.class).update(teacher);
        information.setText("��ʦ��Ϣ�ɹ��޸�");
    }

    public void updateAdvisor(){
        int sid = Integer.valueOf(relation_sid.getText());
        int tid = Integer.valueOf(relation_tid.getText());
        Advisor advisor = new Advisor(sid, tid);
        AppContext.getBean(advisorDao.class).update(advisor);
        information.setText("关系信息成功修改");
    }

    public void deleteStudent(){
        int id = Integer.valueOf(student_id1.getText());
        AppContext.getBean(studentDao.class).delete(id);
        Advisor advisor = new Advisor(id, 0);
        AppContext.getBean(advisorDao.class).delete(advisor);
        information.setText("学生信息成功删除");
    }

    public void deleteTeacher(){
        int id = Integer.valueOf(teacher_id1.getText());
        AppContext.getBean(teacherDao.class).delete(id);
        Advisor advisor = new Advisor(0, id);
        AppContext.getBean(advisorDao.class).delete(advisor);
        information.setText("教师信息成功删除");
    }

    public void deleteAdvisor(){
        int sid = Integer.valueOf(relation_sid1.getText());
        int tid = Integer.valueOf(relation_tid1.getText());
        Advisor advisor = new Advisor(sid, tid);
        AppContext.getBean(advisorDao.class).delete(advisor);
        information.setText("关系信息成功删除");
    }

    public void allStudent(){

        List<Student> stuList = AppContext.getBean(studentDao.class).getAll();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("所有学生信息如下：\n");
        for(Student stu:stuList){
            stringBuilder.append(stu.getId() + " " + stu.getName() + "\n");
        }
        information.setText(stringBuilder.toString());
    }

    public void allTeacher(){
        List<Teacher> teachers = AppContext.getBean(teacherDao.class).getAll();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("所有教师信息如下：\n");
        for(Teacher teacher:teachers){
            stringBuilder.append(teacher.getId() + " " + teacher.getName() + "\n");
        }
        information.setText(stringBuilder.toString());
    }

    public void allRelation(){
        List<Advisor> advisors = AppContext.getBean(advisorDao.class).getAll();


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("所有关系信息如下:\n");
        for(Advisor advisor:advisors){
            stringBuilder.append(advisor.getStudent_id() + " " + advisor.getTeacher_id() + "\n");
        }
        information.setText(stringBuilder.toString());
    }
}
