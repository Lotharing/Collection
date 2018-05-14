package top.lothar.BeanOrList;

import java.util.ArrayList;
import java.util.List;

public class ListOrBeanDemo {
	/**
	 * 简答测试Bean对象和List直接的使用关系,保存表关系
	 * 实例封装好的Bean对象，并填充数据
	 * 把得到携带数据的不同对象存放于List中，List使用
	 * 遍历List对象中的某个对象，对象中的某个属性
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Employee ll = new Employee(151164563, "刘雷~", 10000, "项目部", "2018-06");
		Employee gt = new Employee(151164564, "关桐~", 10000, "项目部", "2018-07");
		Employee lt = new Employee(151164565, "赵路通", 10000, "项目部", "2018-08");
		Employee wb = new Employee(151164566, "张文波", 10000, "项目部", "2018-09");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(ll);
		list.add(gt);
		list.add(lt);
		list.add(wb);
		
		printEmpName(list);
	}
	
	public static void printEmpName(List<Employee> list){
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i).getName());
		}
	}

}
