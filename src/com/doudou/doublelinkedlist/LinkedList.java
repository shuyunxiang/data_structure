package com.doudou.doublelinkedlist;

public class LinkedList {
    // 初始化头结点,不存数据，头结点标记用
    private Node headNode = new Node(0, "头结点");

    /**
     * 添加链表
     *
     * @param node 链表结点
     */
    public void addNode(Node node) {
        // 用于缓存寻找最后的Node结点
        Node tempNode = headNode;
        // 遍历结点
        while (true) {
            // 找到最后结点
            if (tempNode.nextNode == null) {
                break;
            }
            tempNode = tempNode.nextNode;
        }
        // 将新结点加入到最后的结点中
        tempNode.nextNode = node;
        node.preNode = tempNode;
    }

    /**
     * 添加链表结点（自动排序）
     *
     * @param node 链表结点
     */
    public void addNodeByOrder(Node node) {
        // 用于缓存寻找最后的Node结点
        Node tempNode = headNode;

        while (true) {
            // 结点尾结点
            if (tempNode.nextNode == null) {
                break;
            }
            // 编号相同
            if (tempNode.nextNode.num == node.num) {
                System.out.println("编号相同");
                return;
            }
            // 和下一个结点比较大小
            if (tempNode.nextNode.num > node.num) {
                break;
            }
            tempNode = tempNode.nextNode;
        }

        // 当前结点后一个结点，指向新结点下一个结点
        node.nextNode = tempNode.nextNode;
        // 当前结点指向新结点
        node.preNode = tempNode;

        // 不是最后一个结点， 下一个结点的前结点指向新结点
        if(tempNode.nextNode!=null){
            tempNode.nextNode.preNode = node;
        }
        // 当前结点的下一个结点指向新结点
        tempNode.nextNode = node;
    }

    /**
     * 链表遍历
     */
    public void showList() {
        // 判断链表是否为空
        if (headNode.nextNode == null) {
            System.out.println("链表为空");
            return;
        }

        // 用于缓存寻找最后的Node结点
        Node tempNode = headNode.nextNode;
        while (true) {
            System.out.println(tempNode);
            if (tempNode.nextNode == null) {
                break;
            }
            tempNode = tempNode.nextNode;
        }
    }
}

class Node {
    /**
     * 序号
     */
    int num;

    /**
     * 容器
     */
    Object content;

    /**
     * 指针(前一个结点)
     */
    Node preNode;

    /**
     * 指针(后一个结点)
     */
    Node nextNode;

    Node(int num, Object content) {
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
