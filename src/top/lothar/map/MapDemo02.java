package top.lothar.map;

import java.util.LinkedList;


/**
 * Map底层用数组实现
 * 利用hashCode对键值编码，将键值对对象存放于数组中
 * 在编码对数组长度取余的过程中，会出现不同对象在同一个数组位置
 * 数组的每个位置存放链表这样就可以实现，同一位置存放多个hashCode对数组长度取余后相同的键值对对象
 * 如果链表上元素多点需要遍历，不过相对于遍历所有对象，效率是明显的提升
 * @author Lothar
 *
 */
public class MapDemo02 {
	
	LinkedList[] arr = new LinkedList[999];
	
	int size;
	
	/**
	 * 
	 * @param key
	 * @param value
	 */
	public void put(Object key , Object value){
		
		Entry e = new Entry(key, value);
		
		int a = key.hashCode()%arr.length;
		
		if(arr[a]==null){
			LinkedList list = new LinkedList();
			arr[a] = list;
			list.add(e);
		}else{
			//键值对key相同时遍历链表实现覆盖
			LinkedList list = arr[a];
			for(int i = 0 ; i < list.size();i++){
				Entry e2 = (Entry) list.get(i);
				if(e.key.equals(key)){
					e2.value = value;
					return;
				}
			}
			arr[a].add(e);
		}
	}
	/**
	 * 
	 * @param key
	 * @return
	 */
	public Object get(Object key){
		
		int a = key.hashCode()%arr.length;
		
		if(arr[a]!=null){
			LinkedList list = arr[a];
			for(int i = 0 ; i < list.size();i++){
				Entry e = (Entry) list.get(i);
				if(e.key.equals(key)){
					return e.value;
				}
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MapDemo02 mp = new MapDemo02();
		
		mp.put("赵", "路通");
		mp.put("赵", "路路");
		System.out.println(mp.get("赵"));
		
	}
}
