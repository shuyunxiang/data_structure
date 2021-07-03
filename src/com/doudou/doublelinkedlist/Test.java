package com.doudou.doublelinkedlist;

public class Test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNodeByOrder(new Node(4,"第四"));
        linkedList.addNodeByOrder(new Node(1,"第一"));
        linkedList.addNodeByOrder(new Node(3,"第三"));
        linkedList.addNodeByOrder(new Node(2,"第二"));

        linkedList.showList();
    }
}
