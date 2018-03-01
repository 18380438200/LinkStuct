package com.example.linkstuct;

/**
 * Created by libo on 2018/2/28.
 */

public class Node {
    public Object data;
    //next存储了下一个节点
    public Node next;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
