package java_basic.week4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackDataTest {
    StackData stackdata;

    //what is before Each
    @BeforeEach
    public void before(){
        stackdata = new StackData(1);
        for (int i = 2; i< 10; i+=1) stackdata.push(i);
    }

    @Test
    void pushTest() {
        stackdata.push(4);
        System.out.println(stackdata);

    }

    @Test
    void pop() {
        int a = stackdata.pop();
        System.out.println(a);
    }

    @Test
    void print() {
//        System.out.println(stackdata);
    }
}