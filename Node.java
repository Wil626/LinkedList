package BagLinkedList;


public class Node {
    private Object data;
    private  Node next;

    //constructors
    public Node() {
        data = null;
        next = null;
    }
    public Node(Object data) {
        this.data = data;
        next = null;
    }
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    //setters
    public void setData(Object data) {
        this.data = data;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    //getters
    public Object getData() {

        return data;
    }
    public Node getNext() {
        return next;
    }

    //toString
    public String toString() {
        return (data.toString());
    }

    public boolean equals(Node temp) {
        return (data.equals(temp.getData()));
    }



}
