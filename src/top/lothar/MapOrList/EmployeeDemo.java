package top.lothar.MapOrList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ��ʵ��Map��List���������
 * һ��Map�����һ������
 * ��Map������List��
 * ÿ����List��ȡ������Map����
 * ����Map�е�valueֵ
 * @author Lothar
 *
 */
public class EmployeeDemo {
	
	

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Map mp1 = new HashMap();
		mp1.put("id", 151164565);
		mp1.put("name", "��·ͨ");
		mp1.put("salary", 10000);
		mp1.put("department", "��Ŀ��");
		mp1.put("hireDate", "2018-06");
		
		Map mp2 = new HashMap();
		mp2.put("id", 151164566);
		mp2.put("name", "���Ĳ�");
		mp2.put("salary", 10000);
		mp2.put("department", "��Ŀ��");
		mp2.put("hireDate", "2018-07");
		
		Map mp3 = new HashMap();
		mp3.put("id", 151164563);
		mp3.put("name", "������");
		mp3.put("salary", 10000);
		mp3.put("department", "��Ŀ��");
		mp3.put("hireDate", "2018-08");
		
		
		List<Map> list = new ArrayList<Map>();
		list.add(mp1);
		list.add(mp2);
		list.add(mp3);
		
		printEmpName(list);
		
	}
	public static void printEmpName(List<Map> list){
		for(int i=0; i<list.size(); i++){
			Map tempMap = list.get(i);
			
			System.out.println(tempMap.get("name"));
		}
	}
}
