class Queue {
    int arr[] = new int[5];
    int front = -1, rear = -1;
    void enqueue(int data) {
        if (rear == arr.length - 1) {
            System.out.println("Queue Full");
        } else {
            if (front == -1)
                front = 0;
            arr[++rear] = data;
        }
    }
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Empty");
        } else {
            System.out.println("Deleted: " + arr[front++]);
        }
    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(10);
        q.dequeue();
    }
}
