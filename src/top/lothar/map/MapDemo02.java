package top.lothar.map;

import java.util.LinkedList;


/**
 * Map�ײ�������ʵ��
 * ����hashCode�Լ�ֵ���룬����ֵ�Զ�������������
 * �ڱ�������鳤��ȡ��Ĺ����У�����ֲ�ͬ������ͬһ������λ��
 * �����ÿ��λ�ô�����������Ϳ���ʵ�֣�ͬһλ�ô�Ŷ��hashCode�����鳤��ȡ�����ͬ�ļ�ֵ�Զ���
 * ���������Ԫ�ض����Ҫ��������������ڱ������ж���Ч�������Ե�����
 * 
 * hashCode��ȵ�����key��һ��equals��ȣ�equals��ȵ�����key hashCodeһ����ͬ���������ʱ�ĸ��ݡ�
 * @author Lothar
 *
 */
public class MapDemo02 {
	
	LinkedList[] arr = new LinkedList[999];
	
	int size;
	
	/**
	 * 
	 * hash�Ż���ֹ���ָ����쳣���
	 * ������ֵ�Զ���
	 * ��keyֵ��hashCode���б��룬������ȡ����
	 * ����������λ��null �����������������������λ�ã�Ȼ��Ѽ�ֵ�Զ������������
	 * ������λ�ò���null �õ���λ�õ�������󣬱���������������е��Ѵ���keyֵ�뽫Ҫ�����key�������ֵ��ͬ�򸲸�
	 * �������ͬ��ֱ�ӰѼ�ֵ�Զ���ֱ����ӽ�������
	 * @param key
	 * @param value
	 */
	public void put(Object key , Object value){
		
		Entry e = new Entry(key, value);
		
		int hash = key.hashCode();
		hash = hash<0?-hash:hash;
	
		int a = hash%arr.length;
		
		if(arr[a]==null){
			LinkedList list = new LinkedList();
			arr[a] = list;
			list.add(e);
		}else{
			//��ֵ��key��ͬʱ��������ʵ�ָ���
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
	 * �Ż�hashCode
	 * �õ���Ҫ��ȡkey��hashCode������ȡ���ı���
	 * ��Ϊ��ʱ������λ�õ�����ȡ�����keyֵ��ͬ��valueֵ
	 * @param key
	 * @return
	 */
	public Object get(Object key){
		
		int hash = key.hashCode();
		hash = hash<0?-hash:hash;
		int a = hash%arr.length;
		
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
		// TODO �Զ����ɵķ������
		MapDemo02 mp = new MapDemo02();
		
		mp.put("��", "·ͨ");
		mp.put("��", "··");
		System.out.println(mp.get("��"));
		
	}
}
