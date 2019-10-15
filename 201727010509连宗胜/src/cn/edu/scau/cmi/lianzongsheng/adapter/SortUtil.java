package cn.edu.scau.cmi.lianzongsheng.adapter;

import java.util.ArrayList;

public class SortUtil {
	public static ArrayList<Student> sortList(ArrayList<Student> stuList) {
		for(int i=0;i<stuList.size()-1;i++) {
			for(int j=i+1;j<stuList.size();j++) {
				if(stuList.get(i).stuID>stuList.get(j).stuID) {
					Student temp=stuList.get(i);
					stuList.set(i, stuList.get(j));
					stuList.set(j, temp);
				}
			}
			
		}
		return stuList;
	}

}
