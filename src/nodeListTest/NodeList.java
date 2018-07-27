package nodeListTest;

import java.util.LinkedList;

public class NodeList {
    LinkedList<Integer> linkedList;
    Node first;
    int size;


    public void insert (int position, int value) throws IndexOutOfBoundsException{
        if (position < 0 && position > size){
            throw new IndexOutOfBoundsException();
        }
        else {
            if(isEmpty()){
                first = new Node();
                first.value = value;
                first.next = null;
                size++;
                System.out.println(size);
            }
            else{
                if (position == size){
                    throw new IndexOutOfBoundsException();
                } else if(position == 0){
                    Node another = new Node();
                    another = first;
                    first.value = value;
                    first.next = another;
                    size++;
                    System.out.println(size);
//                } else if (position == size-1){
//                    Node another = new Node();
//                    another.value = value;
//                    another.next = null;
////                    Node.get(position-1).next = another;
//                    size++;
//                    System.out.println(size);
                } else {
                    Node another = new Node();
                    another.value = value;
//                    another.next = Node.get(position);
//                    Node.get(position-1).next = another;
                    size++;
                    System.out.println(size);
                }
            }
        }
    }


//    public Node get(int position){
//        return Node(position);
//    }

    public boolean isEmpty() {
        return size == 0;
    }

    static class Node {
        int value;
        Node next;
    }

}
