package top.lothar.map;
/**
 * 对Map的简单实现，效率低
 * 取时候需要遍历，效率低
 * Demo02是对此问题的近一步解决
 * @author Lothar
 *
 */
public class MapDemo01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MapDemo01 mp = new MapDemo01();
		mp.put(new Integer(1), "23231");
//		mp.put(new Integer(1), "23232");
		
		System.out.println(mp.get(1));
	}
	
	Entry[] arr = new Entry[990];
	
	int size;
	/**
	 * 存放键值对，键值对对象放入数组
	 * @param key
	 * @param value
	 */
	public void put(Object key , Object value){
		
		Entry e = new Entry(key, value);
		
		for(int i = 0 ; i<size ; i++){
			if(arr[i].key.equals(key)){
				arr[i].value = value;
				return;
			}
		}
		arr[size++] = e;
	}
	/**
	 * 遍历数组，得到的key值与想要查询的一致急救返回该key值对应的value值
	 * @param key
	 * @return
	 */
	public Object get(Object key){
		
		for(int i = 0 ; i<size ; i++){
			if(arr[i].key.equals(key)){
				return arr[i].value;
			}
		}
		return null;
	}
	/**
	 * 判断是否有该key值
	 * @param key
	 * @return
	 */
	public boolean containsKey(Object key){
		for(int i = 0 ; i<size ; i++){
			if(arr[i].key.equals(key)){
				return true;
			}
		}
		return false;
	}
	/**
	 * 判断是否有该value值
	 * @param value
	 * @return
	 */
	public boolean containsValue(Object value){
		for(int i = 0 ; i<size ; i++){
			if(arr[i].value.equals(value)){
				return true;
			}
		}
		return false;
	}
	
}
/**
 * 存放键值对的一个实体
 * @author Lothar
 *
 */
class Entry{
	
	public Object key;
	public Object value;
	
	public Entry(Object key , Object value){
		this.key = key;
		this.value = value;
	}
}