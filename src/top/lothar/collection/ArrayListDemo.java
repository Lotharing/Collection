package top.lothar.collection;


public class ArrayListDemo /*implements List*/{
	/**
	 * 通过JDK源码，实现ArrayList的底层结构
	 * @param args
	 * @author Lothar
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayListDemo list = new ArrayListDemo(3);
		list.add("000");
		list.add("111");
		list.add("222");
//		list.remove(1);
//		list.remove("000");
//		list.set(0, "010");
		list.add(2, "101");
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	//底层数组对象
	private Object[] elementData;
	//数组长度
	private int size;
	/**
	 *返回数组长度 
	 */
	public int size(){
		return size;
	}
	/**
	 * 判断数组是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return size == 0;
	}
	/**
	 * 无参构造，内部调用有参构造
	 */
	public ArrayListDemo(){
		//调用本身有参构造传递参数
		this(10);
	}
	/**
	 * 有参构造，参数是数组长度,构造object型数组
	 * @param initialCapacity
	 */
	public ArrayListDemo(int initialCapacity){
		if (initialCapacity<0) {
			try {
				throw new Exception("Length Error");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		elementData = new Object[initialCapacity];
	}
	/**
	 * 实现存储
	 * 实现数组的自动扩容
	 * @param obj
	 */
	public void add(Object obj){
		if (size==elementData.length) {
			//数组将要溢出时扩容,扩容大小可指定
			Object[] newArray = new Object[size*2+1];
			//实现数据的转移,已实现的方法
//			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			
			for(int i = 0 ; i < elementData.length ; i++){
				elementData[i] = newArray[i];
			}
			
			elementData = newArray;
		}
		elementData[size++] = obj;
	}
	/**
	 * 利用下标取得数组内容的方法
	 * @param index
	 * @return
	 */
	public Object get(int index){
		rangeCheck(index);
		return elementData[index];
	}
	/**
	 * 删除指定下标位置的数据
	 * @param index
	 */
	public void remove(int index){
		
		rangeCheck(index);
		
		int numMove = size-index-1;
		if (numMove>0) {
			System.arraycopy(elementData, index+1, elementData, index, numMove);
		}
		elementData[--size] = null;
	}
	/**
	 * 删除指定数据对象
	 * @param obj
	 */
	public void remove(Object obj){
		for (int i=0; i<size; i++) {
			if (get(i).equals(obj)) {
				remove(i);
			}
		}
	}
	/**
	 * 修改索引位置的对象值
	 * @param index
	 * @param obj
	 * @return
	 */
	public Object set(int index , Object obj){
		rangeCheck(index);
		
		Object oldValue = elementData[index];
		elementData[index] = obj;
		return oldValue;
	}
	/**
	 * 在指定索引位置添加对象，索引位置之后的数据往后移动一个索引值
	 * 数组扩容
	 * @param index
	 * @param obj
	 */
	public void add(int index , Object obj){
		rangeCheck(index);
		
		ensureCapacity();
		
		System.arraycopy(elementData, index, elementData, index+1,size-index);
		elementData[index] = obj;
		size++;
	}
	/**
	 * 数组扩容，创建一个新数组扩大容量
	 * 把原数组数据遍历进新数组
	 * 新数组对象名赋给原数组对象名
	 * 原数组变为扩容后的数组
	 */
	private void ensureCapacity(){
		if (size==elementData.length) {
			//数组将要溢出时扩容,扩容大小可指定
			Object[] newArray = new Object[size*2+1];
			for(int i = 0 ; i < elementData.length ; i++){
				elementData[i] = newArray[i];
			}
			elementData = newArray;
		}
	}
	/**
	 * 检查操作值是否越界
	 * @param index
	 */
	private void rangeCheck(int index){
		if (index<0 || index>=size) {
			try {
				throw new Exception("超出范围");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
