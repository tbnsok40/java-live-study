package java_basic.week5;

import java_basic.week5.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
    Node root;

    public void setRoot(Node root) {
        this.root = root;
    }

    // return 해야하는 유형(NODE)를 써준다.
    public Node getRoot() {
        return root;
    }
    // BFS는 pre, in, post order라는게 없다
    public List<Integer> bfs(Node node) {
        Queue<Node> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        queue.add(node);
        while (queue.size() != 0) {
            Node pollNode = queue.poll(); // 가장 먼저의 노드를 반환(꺼냄)
            result.add(pollNode.getValue());
            if (!pollNode.isNullLeft()) {
                queue.add(pollNode.getLeft());
            }
            if (!pollNode.isNullRight()) {
                queue.add(pollNode.getRight());
            }
        }
        return result;
    }
    public void preorderDFS(Node node, List<Integer> list){
        list.add(node.getValue());
        if (!node.isNullLeft()) {
            preorderDFS(node.getLeft(), list);
        }
        if (!node.isNullRight()) {
            preorderDFS(node.getRight(), list);
        }
    }

    public void inorderDFS(Node node, List<Integer> list){
        if (!node.isNullLeft()) {
            inorderDFS(node.getLeft(), list);
        }
        list.add(node.getValue());
        if (!node.isNullRight()) {
            inorderDFS(node.getRight(), list);
        }
    }

    public void postorderDFS(Node node, List<Integer> list){
        if (node.getLeft() != null){
            postorderDFS(node.getLeft(), list);
        }
        if(node.getRight() != null){
            postorderDFS(node.getRight(), list);
        }
        list.add(node.getValue());
    }
}