package cn.edu.scau.cmi.lianzongsheng.adapter;

import java.util.List;

public class SortUtil {
	int tmp, a, b;
	public void sortInt(List<Integer> intList){
		for(int i = 0; i < intList.size() - 1; i++) {
			for(int j = 0; j < intList.size() - i - 1; j++) {
				a = intList.get(j);
				b = intList.get(j + 1);
				if(a > b) {
					tmp = a;
					intList.set(j, b);
					intList.set(j + 1, a);
				}
			}
		}
	}
}
