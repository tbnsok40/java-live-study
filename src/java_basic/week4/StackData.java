package java_basic.week4;

public class StackData {
    int[] stackData;
    int stackSize;
    int currPos;

    public StackData(int data){
        this.stackSize = 10;
        this.currPos = 1;
        this.stackData = new int[stackSize];
        this.stackData[0] = data;
    }
    // 위하고 데이터는 스택 길이 처리 어떻게 하지?
    public void push(int data){
        if(this.stackSize == this.currPos + 1){ //datacount가 stackSize보다 1만큼 작을 때
            int[] newStack = new int[stackSize + 10]; //새로운 스택 생성
            for (int i = 0; i < stackSize; ++i) newStack[i] = this.stackData[i]; //기존 스택의 데이터를 새로운 스택에 할당(복사 개념)
            stackSize += 10; //stackSize도 업데이트
            this.stackData = newStack;
        } // 위의 과정은 stack이 꽉 차기 직전의 경우에만 해당

        this.stackData[this.currPos++] = data; // datacount값은 data할당 후에 +1 증가
    }

    public int pop(){
        if (this.currPos == 0){
            System.out.println("no more data exists");
            return -1;
        }
        return stackData[--this.currPos];
    }
    public void print(){
        for (int i = 0; i < this.currPos; ++i){ //datacount는 결국 현재 위치를 말한 것
            System.out.println(i + " :: " + stackData[i]);
        }
    }
}
