package top.lothar.collection;
/**
 * ͨ��JDKԴ�룬ʵ��LinkedList�ĵײ�ṹ
 * @author Lothar
 * 
 */
public class LinkedListDemo {
	
	private Node first;
	
	private Node last;
	
	private int size;
	/**
	 * ����������
	 * @return
	 */
	public int size(){
		return size;
	}
	/**
	 * ��������ӽ�����
	 * @param obj
	 */
	public void add(Object obj){
		//������
		Node n = new Node();
		if(first==null){
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			//��ǰ���Ϊ�����ͷ���,ͬʱҲ��β���
			first = n;
			last = n;
		}else{
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			//���������Ϊlastβ���
			last.setNext(n);
			//��ǰ������β���
			last = n;
		}
		size++;
	}
	/**
	 * �ȵ�indexλ�õĽ�����
	 * @return
	 */
	public Object get(int index){
		rangeCheck(index);
		
		Node temp = node(index);
		if(temp!=null){
			return temp.obj;
		}
		return null;
	}
	/**
	 * �Ƴ����
	 * �Ѹý�����һ������ͷ������ӵ���һ������β���
	 * �Ѹý�����һ������β������ӵ���һ������ͷ���
	 * ÿ�Ƴ�һ�������ȼ�һ
	 * @param index
	 */
	public void reMove(int index){
		
		Node temp = node(index);
		if (temp!=null) {
			Node up = temp.previous;
			Node down = temp.next;
			
			up.next = down;
			down.previous = up;
		}
		size--;
	}
	/**
	 * ͨ������Ľ�����ֵ���Ƴ����
	 * ͨ����������õ��������ͬ���Ǹ����λ��
	 * �����Ƴ��ý��
	 * ����������ж���ظ����󣬲���ȫ���Ƴ���ֻ���Ƴ�����ʱ��һ�γ��ֵģ�����������
	 * @param obj
	 */
	public void reMove(Object obj){
		LinkedListDemo list = new LinkedListDemo();
		for(int i = 0 ; i < list.size() ; i++){
			if(list.get(i).equals(obj)){
				reMove(i);
			}
		}
	}
	public void add(int index , Object obj){
		Node temp = node(index);
		
		//�����½��,װ�ظý������
		Node newNode = new Node();
		newNode.obj = obj;
		
		if(temp!=null){
			//�ó�ԭ����ǰ��ָ��
			Node up = temp.previous;
			//�½ڵ����ԭ���ǰ��ָ��ĺ��  ˫������
			//�½ڵ�ǰ����ԭ�ڵ�ǰ��ָ���λ��
			up.next = newNode;
			newNode.previous = up;
			//���½ڵ��ָ����һ����ָ���ԭ�ȵ��Ǹ����  ��ʾ����
			//���½ڵ����ԭ����ͷָ��ǰ��   ʵ��˫������
			newNode.next = temp;
			temp.previous = newNode;
		}
		size++;
	}
	/**
	 * ��������ĳ������ֵ������ԭ���ֵ
	 * @param index
	 * @param obj
	 */
	public void set(int index , Object obj){
		Node temp = node(index);
		
		if(temp!=null){
			temp.obj = obj;
		}
	}
	/**
	 * �����Ӧλ�ý��
	 * 
	 * �㷨�Ż�ͨ���۰룬���ٲ�������Ҫ�Ľ��λ��
	 * @param index
	 * @return
	 */
	public Node node(int index){
		Node temp = null;
		if(first!=null){
			
			if(index < (size >> 1)){
				temp = first;
				for(int i = 0 ; i <index ; i++){
					temp = temp.next;
				}
			}else{
				temp = last;
				for(int i =size-1 ;i >index; i--){
					temp = temp.previous;
				}
			}
		}
		return temp;
	}
	/**
	 * �ж��Ƿ�Խ�繤��
	 * @param index
	 */
	public void rangeCheck(int index){
		if(index<0 || index>=size){
			try {
				throw new Exception("Length Error");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		LinkedListDemo list = new LinkedListDemo();
		list.add("000");
		list.add("111");
		list.add("222");
//		list.add(1, "101");
//		list.reMove(1);
//		list.set(1, "101");
		System.out.println("������:"+list.size());
		
		for(int i = 0; i <list.size();i++){
			System.out.println("��"+i+"��:"+list.get(i));
		}
	}
	
}
