package BagLinkedList;

import MyLinkList.Node;

public class BagImplementation implements BagInterface{
    private Node head, tail;
    private int count;
    @Override
    public boolean put(Object item) {
        boolean retVal = false;
        Node temp = new Node(item, null);
        if (isEmpty()) {
            head = tail = temp;
        } else {
            tail.setNext(temp);
            tail = temp;



        }count++;
        retVal = true;
        return retVal;
    }


    public boolean get(Object item) {
        boolean retVal = false;
        Node prev = null;
        Node temp =head;
        if (isEmpty()) {
            System.out.println("Cannot get the item the bag is empty!");
        }
        if(temp != null &&temp.getData() == item){
            head = temp.getNext();
        }
     while(temp.getNext() != null){
        prev = temp;
        temp = temp.getNext();
         if(temp.getData().equals(item)){
             temp.setData(null);
         }



     }  //prev.setNext(temp.getNext());
        count --;
     retVal = true;
        return retVal;
        }


    @Override
    public boolean contains(Object item) {
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public int capacity() {
        return 0;
    }

    @Override
    public boolean isEmpty() {

        return(count ==0);
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void clear() {
    Node temp = head;

    while(temp != null){
        head = head.getNext();
        temp.setNext(null);
        temp = head;
    }

    }



    @Override
    public void display() {
        StringBuffer sb = new StringBuffer();
        Node temp = head;
        sb.append("[");
        while(temp != null){
            sb.append(temp.getData());
            if(temp.getNext() != null){
                sb.append(",");
            }
            temp = temp.getNext();
        }
        sb.append("]");
        System.out.println("BagList:"+sb.toString());

    }

    @Override
    public int search(Object item) {
        int loc = -1;

        int index = 0;
        Node temp = head;

        while (temp.getData() != item){
            temp = temp.getNext();
            if(temp == null){
                loc = -1;
            }
        }
        if (loc == -1) System.out.println("Item " + temp +" is not located in the array!");
        return loc;
    }
}
