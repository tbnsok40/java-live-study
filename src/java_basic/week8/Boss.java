package java_basic.week8;

public class Boss implements Speaker {
    @Override
    public void name() {
        System.out.println("Boss Speaker");
    }

    public void base(){
        System.out.println("Boss is for lower pitch");
    }
}
