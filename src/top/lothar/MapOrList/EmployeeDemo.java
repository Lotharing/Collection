package top.lothar.MapOrList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 简单实现Map和List的组合运用
 * 一个Map对象放一组数据
 * 把Map对象存进List中
 * 每次在List中取出的是Map对象
 * 遍历Map中的value值
 * @author Lothar
 *
 */
public class EmployeeDemo {
	
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map mp1 = new HashMap();
		mp1.put("id", 151164565);
		mp1.put("name", "赵路通");
		mp1.put("salary", 10000);
		mp1.put("department", "项目部");
		mp1.put("hireDate", "2018-06");
		
		Map mp2 = new HashMap();
		mp2.put("id", 151164566);
		mp2.put("name", "张文波");
		mp2.put("salary", 10000);
		mp2.put("department", "项目部");
		mp2.put("hireDate", "2018-07");
		
		Map mp3 = new HashMap();
		mp3.put("id", 151164563);
		mp3.put("name", "刘雷雷");
		mp3.put("salary", 10000);
		mp3.put("department", "项目部");
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
