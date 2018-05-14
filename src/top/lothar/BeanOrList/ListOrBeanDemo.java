package top.lothar.BeanOrList;

import java.util.ArrayList;
import java.util.List;

public class ListOrBeanDemo {
	/**
	 * ������Bean�����Listֱ�ӵ�ʹ�ù�ϵ,������ϵ
	 * ʵ����װ�õ�Bean���󣬲��������
	 * �ѵõ�Я�����ݵĲ�ͬ��������List�У�Listʹ��
	 * ����List�����е�ĳ�����󣬶����е�ĳ������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Employee ll = new Employee(151164563, "����~", 10000, "��Ŀ��", "2018-06");
		Employee gt = new Employee(151164564, "��ͩ~", 10000, "��Ŀ��", "2018-07");
		Employee lt = new Employee(151164565, "��·ͨ", 10000, "��Ŀ��", "2018-08");
		Employee wb = new Employee(151164566, "���Ĳ�", 10000, "��Ŀ��", "2018-09");
		
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
