package com.doudou.linkedlist;

public class LinkedList {
    // 初始化头结点,不存数据，头结点标记用
    private Node headNode = new Node(0, "头结点");

    // 添加结点
    public void addNode(Node node) {
        // 用于缓存寻找最后的Node结点
        Node temp = headNode;
        // 遍历结点
        while (true) {
            // 找到最后结点
            if (temp.nextNode == null) {
                break;
            }
            temp = temp.nextNode;
        }
        // 将新结点加入到最后的结点中
        temp.nextNode = node;
    }

    // 顺序插入
    public void addNodeByOrder(Node node) {
        // 用于缓存寻找最后的Node结点
        Node temp = headNode;

        while (true) {
            // 结点尾结点
            if (temp.nextNode == null) {
                break;
            }
            // 编号相同
            if (temp.nextNode.num == node.num) {
                System.out.println("编号相同");
                return;
            }
            // 和下一个结点比较大小
            if (temp.nextNode.num > node.num) {
                break;
            }
            temp = temp.nextNode;
        }

        node.nextNode = temp.nextNode;
        temp.nextNode = node;
    }

    // 遍历链表
    public void showList() {
        // 判断链表是否为空
        if (headNode.nextNode == null) {
            System.out.println("链表为空");
            return;
        }

        // 用于缓存寻找最后的Node结点
        Node temp = headNode.nextNode;
        while (true) {
            System.out.println(temp);
            if (temp.nextNode == null) {
                break;
            }
            temp = temp.nextNode;
        }
    }
}
