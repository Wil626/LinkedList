package BagLinkedList;

public class TestBag {
    public static void main(String[] args) {
        BagImplementation b1 = new BagImplementation();

        b1.put(8);
        b1.put(9);
        b1.put(85);
        b1.put(93);
        b1.put(28);
        System.out.println(b1.size());
        b1.display();
        System.out.println("Check");
        b1.get(9);
        System.out.println("Check");
//        b1.clear();
//        b1.display();
//        b1.search(9);
        b1.display();
        System.out.println(b1.size());
    }



}
