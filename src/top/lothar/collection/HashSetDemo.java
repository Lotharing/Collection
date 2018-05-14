package top.lothar.collection;

import java.util.HashMap;
/**
 * ��˳�򣬲��ظ�������������
 * HashSet�е�Ԫ�ز������ظ���������map��key�������ظ�
 * �൱��������map�е�key��ʽ���룬����set�о�ֻ�ܴ��ڲ�ͬ��keyֵ
 * @author Lothar
 *
 */
public class HashSetDemo {
	
	HashMap map;
	
	int size;
	
	private static final Object PRESENT = new Object();
	
	public HashSetDemo(){
		//��Ϊmap keyֵ�������ظ����ظ���Ḳ�ǣ����м��map��������ͬԪ��ʱ����ʵֻ��һ�������ǹ���Ԫ�أ�size���Ծ���һ
		map = new HashMap();
	}
	
	public int size(){
		return map.size();
	}
	public void add(Object obj){
		//set�Ĳ����ظ�����������Map�е�keyֵ�����ظ���ԭ��valueָ��һ����ͬ����keyֵ��Ϊ���ݴ���map���ڴ���set
		map.put(obj,PRESENT);
		size++;
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		HashSetDemo hs = new HashSetDemo();
		hs.add("aaa");
		hs.add(new String("aaa"));
		
		System.out.println(hs.size());
	}

}
