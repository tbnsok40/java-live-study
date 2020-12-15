package java_basic.week5;

public class Animal {
    private String data;
    public Animal(String data){
        this.data = data;
    }
    public static void main(String[] args) {

        Animal cat = new Animal("HelloKitty");
        System.out.println(cat.data);
        }
}




