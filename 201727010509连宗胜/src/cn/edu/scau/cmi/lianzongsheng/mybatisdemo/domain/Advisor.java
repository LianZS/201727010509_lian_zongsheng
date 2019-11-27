package cn.edu.scau.cmi.lianzongsheng.mybatisdemo.domain;

public class Advisor {
    private int student_id;
    private int teacher_id;

    public Advisor(){
    }

    public Advisor(int student_id, int teacher_id){
        this.student_id = student_id;
        this.teacher_id = teacher_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    @Override
    public String toString() {
        return "Advisor{" +
                "student_id=" + student_id +
                ", teacher_id=" + teacher_id +
                '}';
    }
}
