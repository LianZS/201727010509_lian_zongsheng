package cn.edu.scau.cmi.lianzongsheng.adapterObject;

import java.util.ArrayList;
import java.util.List;

public class AdapterOfObject implements Target {
	@Override
	public void sortStudent(List<Student> stuList) {
		// TODO Auto-generated method stub

		// Id sort
		List<Integer> intList = new ArrayList<Integer>();
		SortUtil adaptee = new SortUtil();
		for(Student stu:stuList) {
			intList.add(stu.getStudentId());
		}

		adaptee.sortInt(intList);

		// refer to student
		List<Student> sturesultList = new ArrayList<Student>();
		for(int id:intList) {
			for(Student stu:stuList) {
				if(id == stu.getStudentId()) {
					sturesultList.add(stu);
					break;
				}
			}
		}

		stuList.clear();
		stuList.addAll(sturesultList);
	}

}
