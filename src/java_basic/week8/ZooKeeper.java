package java_basic.week8;

public class ZooKeeper {
    //    public void feed(Tiger tiger){
//        System.out.println("food apple");
//    }
//
//    public void feed(Lion lion){
//        System.out.println("food banana");
//    }
    public void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }

    public static void main(String[] args) {

        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}
