package cn.edu.scau.cmi.lianzongsheng.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterOfClass extends SortUtil implements Target{
	
	@Override
	public void sortStudent(List<Student> stuList) {
		// TODO Auto-generated method stub

		// Id sort
		List<Integer> intList = new ArrayList<Integer>();
		for (Student stu : stuList) {
			intList.add(stu.getStudentId());
		}
		sortInt(intList);

		// refer to student
		List<Student> sturesultList = new ArrayList<Student>();
		for (int id : intList) {
			for (Student stu : stuList) {
				if (id == stu.getStudentId()) {
					sturesultList.add(stu);
				}
			}
		}
		stuList.clear();
		stuList.addAll(sturesultList);
	}
}
