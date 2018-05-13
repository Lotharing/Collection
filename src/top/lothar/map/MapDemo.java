package top.lothar.map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		MapDemo mp = new MapDemo();
		mp.put(new Integer(1), "23231");
//		mp.put(new Integer(1), "23232");
		
		System.out.println(mp.get(1));
	}
	
	Entry[] arr = new Entry[990];
	
	int size;
	/**
	 * ��ż�ֵ�ԣ���ֵ�Զ����������
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
	 * �������飬�õ���keyֵ����Ҫ��ѯ��һ�¼��ȷ��ظ�keyֵ��Ӧ��valueֵ
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
	 * �ж��Ƿ��и�keyֵ
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
	 * �ж��Ƿ��и�valueֵ
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
 * ��ż�ֵ�Ե�һ��ʵ��
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