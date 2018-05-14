package top.lothar.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 *1:Set<K> keySet() :获取到所有的键，存储到一个Set集合中，并返回该集合，因为Set有迭代器，
 *每次迭代出来的是一个键，再根据键来得到值
 *
 *2:Set<Map.Entry<K,V>> entrySet():获取到所有的键值对儿形成的映射关系，存到一个Set集合中，再迭代这个集合
 *每次迭代出来的是一个映射关系，从这个映射关系中既可以得到键，也可以得到值
 *这种映射关系是Map.Entry<K,V>类型的
 *Entry是定义在Map中的一个静态成员，是一个接口
 *Entry为什么定义在Map里边儿？
 *有了集合，有了集合中的键值对儿，才会存在映射关系，所以映射关系是对集合内部的事物描述
 *所以定义在Map的内部
 * @author bobge的IT专栏
 *
 */
public class MapTwoTraversal {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashMap<String,String>  map = new HashMap<String,String>();  
        map.put("001","zhangsan");  
        map.put("002","lutong");  
        map.put("003","lisi");  
         //使用 entrySet()遍历集合  
         Set<Map.Entry<String,String>> entry = map.entrySet();  
         Iterator<Map.Entry<String,String>>  ite = entry.iterator();  
         while(ite.hasNext())  
         {  
             Map.Entry<String,String> en = ite.next();  
             String key = en.getKey();  
             String value = en.getValue();  
             sop(key+"=="+value);  
         }  
        //使用keySet()遍历  
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

