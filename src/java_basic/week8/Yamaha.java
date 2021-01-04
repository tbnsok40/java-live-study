package java_basic.week8;

public class Yamaha implements Speaker{
    @Override
    public void name() {
        System.out.println("Yamaha Speaker");
    }

    public void high(){
        System.out.println("yamaha is for higher pitch");
    }
}
