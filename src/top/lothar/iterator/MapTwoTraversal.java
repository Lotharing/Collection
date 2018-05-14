package top.lothar.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 *1:Set<K> keySet() :��ȡ�����еļ����洢��һ��Set�����У������ظü��ϣ���ΪSet�е�������
 *ÿ�ε�����������һ�������ٸ��ݼ����õ�ֵ
 *
 *2:Set<Map.Entry<K,V>> entrySet():��ȡ�����еļ�ֵ�Զ��γɵ�ӳ���ϵ���浽һ��Set�����У��ٵ����������
 *ÿ�ε�����������һ��ӳ���ϵ�������ӳ���ϵ�мȿ��Եõ�����Ҳ���Եõ�ֵ
 *����ӳ���ϵ��Map.Entry<K,V>���͵�
 *Entry�Ƕ�����Map�е�һ����̬��Ա����һ���ӿ�
 *EntryΪʲô������Map��߶���
 *���˼��ϣ����˼����еļ�ֵ�Զ����Ż����ӳ���ϵ������ӳ���ϵ�ǶԼ����ڲ�����������
 *���Զ�����Map���ڲ�
 * @author bobge��ITר��
 *
 */
public class MapTwoTraversal {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		HashMap<String,String>  map = new HashMap<String,String>();  
        map.put("001","zhangsan");  
        map.put("002","lutong");  
        map.put("003","lisi");  
         //ʹ�� entrySet()��������  
         Set<Map.Entry<String,String>> entry = map.entrySet();  
         Iterator<Map.Entry<String,String>>  ite = entry.iterator();  
         while(ite.hasNext())  
         {  
             Map.Entry<String,String> en = ite.next();  
             String key = en.getKey();  
             String value = en.getValue();  
             sop(key+"=="+value);  
         }  
        //ʹ��keySet()����  
        /* 
        Set<String> keys = map.keySet(); 
        Iterator<String> ite = keys.iterator(); 
        while(ite.hasNext()) 
        { 
            String key = ite.next(); 
            String value = map.get(key); 
            sop(key+"=="+value); 
        } 
        */  
    }  
  
    public static void sop(Object obj){  
        System.out.println(obj);  
    }  
}

