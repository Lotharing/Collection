package top.lothar.collection;


public class ArrayListDemo /*implements List*/{
	/**
	 * ͨ��JDKԴ�룬ʵ��ArrayList�ĵײ�ṹ
	 * @param args
	 * @author Lothar
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
	
	//�ײ��������
	private Object[] elementData;
	//���鳤��
	private int size;
	/**
	 *�������鳤�� 
	 */
	public int size(){
		return size;
	}
	/**
	 * �ж������Ƿ�Ϊ��
	 * @return
	 */
	public boolean isEmpty(){
		return size == 0;
	}
	/**
	 * �޲ι��죬�ڲ������вι���
	 */
	public ArrayListDemo(){
		//���ñ����вι��촫�ݲ���
		this(10);
	}
	/**
	 * �вι��죬���������鳤��,����object������
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
	 * ʵ�ִ洢
	 * ʵ��������Զ�����
	 * @param obj
	 */
	public void add(Object obj){
		if (size==elementData.length) {
			//���齫Ҫ���ʱ����,���ݴ�С��ָ��
			Object[] newArray = new Object[size*2+1];
			//ʵ�����ݵ�ת��,��ʵ�ֵķ���
//			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			
			for(int i = 0 ; i < elementData.length ; i++){
				elementData[i] = newArray[i];
			}
			
			elementData = newArray;
		}
		elementData[size++] = obj;
	}
	/**
	 * �����±�ȡ���������ݵķ���
	 * @param index
	 * @return
	 */
	public Object get(int index){
		rangeCheck(index);
		return elementData[index];
	}
	/**
	 * ɾ��ָ���±�λ�õ�����
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
	 * ɾ��ָ�����ݶ���
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
	 * �޸�����λ�õĶ���ֵ
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
	 * ��ָ������λ����Ӷ�������λ��֮������������ƶ�һ������ֵ
	 * ��������
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
	 * �������ݣ�����һ����������������
	 * ��ԭ�������ݱ�����������
	 * ���������������ԭ���������
	 * ԭ�����Ϊ���ݺ������
	 */
	private void ensureCapacity(){
		if (size==elementData.length) {
			//���齫Ҫ���ʱ����,���ݴ�С��ָ��
			Object[] newArray = new Object[size*2+1];
			for(int i = 0 ; i < elementData.length ; i++){
				elementData[i] = newArray[i];
			}
			elementData = newArray;
		}
	}
	/**
	 * ������ֵ�Ƿ�Խ��
	 * @param index
	 */
	private void rangeCheck(int index){
		if (index<0 || index>=size) {
			try {
				throw new Exception("������Χ");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
