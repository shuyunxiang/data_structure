package com.doudou.linkedlist;

public class Test {
    public static void main(String[] args) {
        // 链表顺序添加
//        Node first = new Node(1, "一号");
//        Node second = new Node(2, "二号");
//        Node third = new Node(3, "三号");
//
//        LinkedList linkedList = new LinkedList();
//        linkedList.addNode(first);
//        linkedList.addNode(second);
//        linkedList.addNode(third);
//        linkedList.showList();

        // 链表排序添加
        Node first1 = new Node(1, "一号");
        Node second1 = new Node(2, "二号");
        Node third1 = new Node(3, "三号");

        LinkedList linkedList1 = new LinkedList();
        linkedList1.addNodeByOrder(third1);
        linkedList1.addNodeByOrder(first1);
        linkedList1.addNodeByOrder(second1);
        linkedList1.showList();
    }
}
