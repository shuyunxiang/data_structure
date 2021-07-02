package com.doudou.linkedlist;

public class Node {

    // 内容
    public int num;
    public Object content;

    // 指针
    public Node nextNode;

    public Node(int num, Object content) {
        this.num = num;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Node{" +
                "num=" + num +
                ", content=" + content +
                '}';
    }
}
