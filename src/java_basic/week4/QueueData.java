package java_basic.week4;

public class QueueData {
    private final int EXTEND_SIZE = 10;
    private int[] myQueue;
    private int headPos;
    private int tailPos;

    public QueueData(){
        this.myQueue = new int[EXTEND_SIZE];
        this.headPos = 0;
        this.tailPos = 0;
    }

    public void resetQueue(){
        for(int i = headPos, j = 0; i <= tailPos;) myQueue[j++] = myQueue[i++];
        tailPos -= headPos;
        headPos = 0;
    }


}
