package java_basic.week5;

public class Node {
    private int value;
    private Node left;
    private Node right;


    // cmd + n => 생성자 초기화시 필드 선택할 수 있는데 value를 선택
    public Node(int value) {
        this.value = value;
        left = right = null;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    // class는 getter/setter를 무조건 가질까?
    // ㄴㄴㄴ --> 클래스의 멤버 변수를 private 접근제한자로 설정 후, getter/setter를 통해 member변수의 값을 변경, 호출하게 된다.
    // 클래스의 정보은닉 특성을 보여주는 메서드

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public boolean isNullLeft(){
        return this.left == null;
    }

    public boolean isNullRight() {
        return this.right == null;
    }
}


