package JAVACLASS;

interface Car1 { // 인터페이스와 클래스는 다른것 // 인터페이스는 구현 , 클래스는 상속
    void move();
}

interface Cannon{ //인터페이스는 스스로 메모리에 못올라감, 자바17에서는 메모리에 올라감
    void fire();
}

class Tank implements Car1, Cannon{

    @Override
    public void move() { // 인터페이스는 다중 상속 가능 
        System.out.println("탱크가 앞으로 이동합니다.");
    }

    @Override
    public void fire() {
        System.out.println("탱크에서 대포를 발사합니다.");
    }


}
public class Code08_10 {
    public static void main(String[] args){
        Tank tank1 = new Tank();
        tank1.move();
        tank1.fire();

    }

}
