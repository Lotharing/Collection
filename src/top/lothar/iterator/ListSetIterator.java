package top.lothar.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/**
 * List 可以用索引for循环的方式遍历数据，也可以用Iterator迭代器遍历
 * Set 因为里边的数据无序，所以遍历时用Iterator遍历合适
 * hasNext() 判断有没有下一个结点 boolean型，游标指数不等于size，可以一直往下查
 * next 返回游标当前位置的元素，并将游标移动到下一个位置
 * remove() 删除游标左侧的元素，执行完next该操作只能执行一次，因为游标一次移动一个位置，返回一个数据
 * 游标查下一个时，返回上一个数据，移动次数等于长度size-1
 * @author Lothar
 *
 */
public class ListSetIterator {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List list = new ArrayList();
		list.add("z1");
		list.add("z2");
		list.add("z3");
		//for循环遍历
		for(int i=0;i<list.size();i++){
			String str = (String)list.get(i);
			System.out.println(str);
		}
		for(Iterator iter2 = list.iterator();iter2.hasNext();){
			String str = (String)iter2.next();
			System.out.println(str);
			iter2.remove();
		}
		
		Set set = new HashSet();
		set.add("z1");
		set.add("z2");
		set.add("z3");
		
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			String str = (String)iter.next();
			System.out.println(str);
		}
	}

}
