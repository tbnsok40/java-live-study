package java_basic.week4;

import java.util.Objects;

public class ListNode {
    private int data;
    private ListNode next;
    private boolean isHead;

    public int getData() {
        return this.data;
    }

    public ListNode(){
        this.data = 0;
        this.next = null;
        this.isHead = true;
    }

    public ListNode(int data){
        this.data = data;
        this.next = null;
        this.isHead = false;
    }

    public int size(){
        if(!this.isHead){
            System.out.println("head 노드가 아니므로 길이 반환 X");
            return -1;
        }

        int size = 0;
        ListNode ln = this;
        while(ln.next != null){
            ++ size;
            ln = ln.next;
        }
        return size;
    }

    private boolean basicValidation(int pos){
        if(!this.isHead || pos < 0 || size() < pos){
            System.out.println("적절하지 않은 위치입니다.");
            return false;
        }
        return true;
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position){
        if(!basicValidation(position)){
            return null;
        }
        while(--position >= 0){
            head = head.next;
        }
        nodeToAdd.next = head.next;
        head.next = nodeToAdd;
        return nodeToAdd;
    }

    public ListNode remove(ListNode head, int positionToRemove){
        if (!basicValidation(positionToRemove) || size() == 0){
            return null;
        }
        ListNode deleteNode = head.next, beforeNode = head;
        while(--positionToRemove > 0){
            beforeNode = deleteNode;
            deleteNode = deleteNode.next;
        }
        beforeNode.next = deleteNode.next;
        return deleteNode;
    }

    public boolean contains(ListNode head, ListNode nodeToCheck){
        boolean result = false;
        if(!head.isHead){
            return result;
        }
        do{
            if(head.equals(nodeToCheck)){
                result = true;
                break;
            }
            head = head.next;
        }while(head != null);
        return result;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        ListNode listNode = (ListNode) o;
        return this.data == listNode.data && Objects.equals(this.next, listNode.next);
    }
}
