package baitapqueue;

import queue.Node;

public class Queue {
    private queue.Node head;
    private queue.Node tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key) {
        queue.Node temp = new queue.Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public queue.Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
