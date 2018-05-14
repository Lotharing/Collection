package top.lothar.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/**
 * List ����������forѭ���ķ�ʽ�������ݣ�Ҳ������Iterator����������
 * Set ��Ϊ��ߵ������������Ա���ʱ��Iterator��������
 * hasNext() �ж���û����һ����� boolean�ͣ��α�ָ��������size������һֱ���²�
 * next �����α굱ǰλ�õ�Ԫ�أ������α��ƶ�����һ��λ��
 * remove() ɾ���α�����Ԫ�أ�ִ����next�ò���ֻ��ִ��һ�Σ���Ϊ�α�һ���ƶ�һ��λ�ã�����һ������
 * �α����һ��ʱ��������һ�����ݣ��ƶ��������ڳ���size-1
 * @author Lothar
 *
 */
public class ListSetIterator {
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		List list = new ArrayList();
		list.add("z1");
		list.add("z2");
		list.add("z3");
		//forѭ������
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
