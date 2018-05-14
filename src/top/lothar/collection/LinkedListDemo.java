package top.lothar.collection;
/**
 * 通过JDK源码，实现LinkedList的底层结构
 * @author Lothar
 * 
 */
public class LinkedListDemo {
	
	private Node first;
	
	private Node last;
	
	private int size;
	/**
	 * 返回链表长度
	 * @return
	 */
	public int size(){
		return size;
	}
	/**
	 * 链表中添加结点对象
	 * @param obj
	 */
	public void add(Object obj){
		//结点对象
		Node n = new Node();
		if(first==null){
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			//当前结点为链表的头结点,同时也是尾结点
			first = n;
			last = n;
		}else{
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			//新增结点作为last尾结点
			last.setNext(n);
			//当前结点就是尾结点
			last = n;
		}
		size++;
	}
	/**
	 * 等到index位置的结点对象
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
	 * 移除结点
	 * 把该结点的下一个结点的头结点连接到上一个结点的尾结点
	 * 把该结点的上一个结点的尾结点连接到下一个结点的头结点
	 * 每移除一个链表长度减一
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
	 * 通过传入的结点对象值，移除结点
	 * 通过遍历链表得到与对象相同的那个结点位置
	 * 调用移除该结点
	 * 如果链表中有多个重复对象，不能全部移除，只能移除遍历时第一次出现的！！！！！！
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
		
		//创建新结点,装载该结点数据
		Node newNode = new Node();
		newNode.obj = obj;
		
		if(temp!=null){
			//拿出原结点的前边指针
			Node up = temp.previous;
			//新节点放在原结点前边指针的后边  双向连接
			//新节点前边是原节点前边指针的位置
			up.next = newNode;
			newNode.previous = up;
			//把新节点的指向下一个的指针后方原先的那个结点  表示插入
			//把新节点放在原结点的头指针前边   实现双向连接
			newNode.next = temp;
			temp.previous = newNode;
		}
		size++;
	}
	/**
	 * 设置链表某个结点的值，覆盖原结点值
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
	 * 获得相应位置结点
	 * 
	 * 算法优化通过折半，快速查找所需要的结点位置
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
	 * 判断是否越界工具
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
		// TODO 自动生成的方法存根
		LinkedListDemo list = new LinkedListDemo();
		list.add("000");
		list.add("111");
		list.add("222");
//		list.add(1, "101");
//		list.reMove(1);
//		list.set(1, "101");
		System.out.println("链表长度:"+list.size());
		
		for(int i = 0; i <list.size();i++){
			System.out.println("第"+i+"个:"+list.get(i));
		}
	}
	
}
