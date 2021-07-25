package com.doudou.stack;

public class ArrayStack {
    /**
     * 栈大小
     */
    private int maxSize;

    /**
     * 栈顶
     */
    private int top = -1;

    /**
     * 容器
     */
    private int[] stack;

    /**
     * 构造方法
     */
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    /**
     * 判断栈是否满
     */
    public boolean isFull() {
        return top == maxSize - 1;
    }

    /**
     * 判断栈是否为空
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 入栈
     *
     * @param value 入栈数据
     */
    public void push(int value) {
        if (isFull()) {
            throw new RuntimeException("栈已经满");
        }

        top++;
        stack[top] = value;
    }

    /**
     * 出栈
     *
     * @return 出栈的值
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈无数据");
        }

        int topValue = stack[top];
        top--;

        return topValue;
    }

    /**
     * 栈的遍历展示
     */
    public void showStack() {
        if (isEmpty()) {
            System.out.println("无数据");
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
