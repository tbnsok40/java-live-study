package java_basic.week4;

public class QueueData {

    private final int EXTEND_SIZE = 10; // 배열의 size 먼저 규정
    private int[] myQueue; // 배열 선언
    private int headPos;
    private int tailPos;

    public QueueData(){ // 생성자
        this.myQueue = new int[EXTEND_SIZE]; // 배열 정의
        this.headPos = 0;
        this.tailPos = 0;
    }

    public void resetQueue(){
        for(int i = headPos, j = 0; i <= tailPos;) myQueue[j++] = myQueue[i++];
        tailPos -= headPos;
        headPos = 0;
    }

    public int[] extendQueue(){
        int[] newQueue = new int[myQueue.length + EXTEND_SIZE];
        for(int i = 0; i < myQueue.length; ++i) newQueue[i] = myQueue[i];
        return newQueue;
    }

    public void push(int data){
        if(tailPos + 1 == myQueue.length) myQueue = extendQueue();
        this.myQueue[tailPos++] = data;
    }

    public int pop(){
        if(headPos == tailPos) return -1;
        if(headPos > EXTEND_SIZE) resetQueue();
        return myQueue[headPos++];
    }

    public int size(){
        return this.tailPos - this.headPos;
    }
}
