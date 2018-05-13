package top.lothar.collection;

public class Node {
	//上一个结点
	public Node previous;
	//当前结点对象
	public Object obj;
	//下一个结点
	public Node next;
	
	public void Node(){
		
	}
	public void Node(Node previous , Object obj , Node last){
		this.previous = previous;
		this.obj = obj;
		this.next = next;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
