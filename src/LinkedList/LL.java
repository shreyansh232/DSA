package LinkedList;

public class LL {


    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }
    public LL(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 1;

    }
    public void insertFirst(int val){
        Node newNode = new Node(val);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }

        if(tail == null){
            tail = head;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size += 1;
    }

    public Node removeFirst(){
        Node temp = head;
        if(size == 0) return null;
        head = head.next;
        temp.next = null;
        size--;
        if(size == 0){
            tail = null;
        }
        return temp;

    }
    public void append(int value){
        Node newNode = new Node(value);
        if(size == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            newNode.next = null;
        }
        size++;

    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node removeLast(){
        if(size == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        size--;
        if(size == 0){ //when only one node
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= size){
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value){
        Node temp = get(index);
    if(temp != null){
        temp.value = value;
        return true;
    }
    return false;
    }
    public boolean insert(int index, int value){
        if(index < 0 || index > size){
            return false;
        }
        if(index == 0){
            insertFirst(value);
            return true;
        }
        if(index == size){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return true;
    }
    public Node remove(int index){
        if(index < 0 || index > size){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == size){
            return removeLast();
        }
        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        size--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i = 0; i < size; i++){
            after = temp.next;
            temp.next = before; //pointer changes to before
            before = temp;
            temp = after;
        }
    }

    public static class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

}
