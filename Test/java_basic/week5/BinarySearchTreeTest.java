package java_basic.week5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    static Node node0;
    static Node node1;
    static Node node2;
    static Node node3;
    static Node node4;
    static Node node5;
    static Node node6;
    static Node node7;
    static Node node8;
    static Node node9;
    static Node node10;
    static BinarySearchTree binarysearchtree = new BinarySearchTree();

    @BeforeAll
    static void binarytreeSetting(){
        node10 = new Node(10);
        node9 = new Node(9);
        node8 = new Node(8);
        node7 = new Node(7);
        node6 = new Node(6);
        node5 = new Node(5);
        node4 = new Node(4);
        node3 = new Node(3);
        node2 = new Node(2);
        node1 = new Node(1);
        node0 = new Node(0);
        binarysearchtree.setRoot(node0);
    }


    @Test
    void bfs() {
    }

    @Test
    void preorderDFS() {
    }

    @Test
    void inorderDFS() {
    }

    @Test
    void postorderDFS() {
    }

}