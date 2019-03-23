package 链表.单向链表实现;
/*
 * 
 * 结点类
 */
public class Node {
    private Object data;
    private Node next;
    public Node() {}   
	public Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
    
}
