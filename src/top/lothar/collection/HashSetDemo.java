package top.lothar.collection;

import java.util.HashMap;
/**
 * 无顺序，不重复，迭代器遍历
 * HashSet中的元素不可以重复，利用了map中key不可以重复
 * 相当于数据以map中的key方式存入，所以set中就只能存在不同的key值
 * @author Lothar
 *
 */
public class HashSetDemo {
	
	HashMap map;
	
	int size;
	
	private static final Object PRESENT = new Object();
	
	public HashSetDemo(){
		//因为map key值不可以重复，重复则会覆盖，所有检测map中两个相同元素时，其实只有一个被覆盖过的元素，size所以就是一
		map = new HashMap();
	}
	
	public int size(){
		return map.size();
	}
	public void add(Object obj){
		//set的不可重复就是利用了Map中的key值不可重复的原理，value指定一个相同对象，key值作为数据存入map，在存入set
		map.put(obj,PRESENT);
		size++;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSetDemo hs = new HashSetDemo();
		hs.add("aaa");
		hs.add(new String("aaa"));
		
		System.out.println(hs.size());
	}

}
