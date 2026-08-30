package QUEUE;

public class queue {
    //    Queue Implementation using Linked List
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node Tail = null;

        public static boolean isEmpty() {
            return head == null && Tail == null;
        }

        //add
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = Tail = newNode;
                return;

            }
            Tail.next = newNode;
            Tail = newNode;
        }

        //Remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = head.data;
//            single element
            if(Tail==head){
                Tail = head= null;
            }else{
                head =head.next;
            }
            return front;
        }
//        peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
