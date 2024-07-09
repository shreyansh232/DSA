package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL(4);
        list.append(5);
        list.append(6);
//        list.removeLast();
        list.reverse();
//        list.insertFirst(10);
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(9);
//        list.insertFirst(4);

        list.display();
    }
}
