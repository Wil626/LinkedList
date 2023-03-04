package BagLinkedList;

public interface BagInterface {
    boolean put(Object item); // places item in the bag and returns true if successful, returns false otherwise.
    boolean get(Object item); // removes item in the bag if it is present and returns true, otherwise, the bag is unchanged and method returns false.
    boolean contains(Object item); // returns true if items is in the bag, returns false otherwise.
    int size(); // returns the number of items in the bag.
    int capacity(); //returns the numbre of items that can be placed in the bag.
    boolean isEmpty(); //returns true if bag is empty, returns false otherwsie.
    boolean isFull(); //returns true if bag is full, returns false otherwise.
    void clear(); //makes the bag empty.
    public void display();
   int search(Object item);
}