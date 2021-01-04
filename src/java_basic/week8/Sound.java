package java_basic.week8;

public class Sound {
    public static void main(String[] args) {
        // case 1
        Speaker boss = new Boss();
        Speaker yamaha = new Yamaha();
//         사용불가 -> boss, yamaha 변수는 Speaker interface의 생성자(?)이기 때문
//        boss.base();
//        yamaha.high();
        boss.name();
        yamaha.name();
        ((Boss) boss).base();
        ((Yamaha) yamaha).high();

        // case 2
//        Boss boss = new Boss();
//        Yamaha yamaha = new Yamaha();
//        boss.name();
//        yamaha.name();
//        boss.base();
//        yamaha.high();



    }
}
