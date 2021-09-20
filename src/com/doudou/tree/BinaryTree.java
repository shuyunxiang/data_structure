package com.doudou.tree;

public class BinaryTree {
}

class BinaryNode {

        private int no;
        private BinaryNode left;
        private BinaryNode right;

        public int getNo() {
                return no;
        }

        public void setNo(int no) {
                this.no = no;
        }

        public BinaryNode getLeft() {
                return left;
        }

        public void setLeft(BinaryNode left) {
                this.left = left;
        }

        public BinaryNode getRight() {
                return right;
        }

        public void setRight(BinaryNode right) {
                this.right = right;
        }

        @Override
        public String toString() {
                return "BinaryNode{" +
                        "no=" + no +
                        '}';
        }

        /**
         * 前序遍历
         */
        public void preOrder() {
                // 当前结点
                System.out.println(this);

                // 左结点
                if (this.left != null) {
                        this.left.preOrder();
                }

                // 右结点
                if (this.right != null) {
                        this.right.preOrder();
                }
        }

        /**
         * 中序遍历
         */
        public void infixOrder() {
                if (this.left != null) {
                        this.left.infixOrder();
                }

                System.out.println(this);

                if (this.right != null) {
                        this.right.infixOrder();
                }
        }

        /**
         * 后序遍历
         */
        public void postOrder() {
                if (this.left != null) {
                        this.left.postOrder();
                }

                if (this.right != null) {
                        this.right.postOrder();
                }

                System.out.println(this);
        }
}