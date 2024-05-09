package JAVACLASS;

class Rabbit2{ // JAVA클래스 안에서는 클래스명은 겹치지 않게, 여러개 하려면 번호 붙이기!
    String Shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y) {
        this.xPos = x; // this는 클래스를 의미 rabbit이라는 클래스를 의미
        this.yPos = y;

        System.out.println("xPos : " + this.xPos + " / yPos : " + this.yPos);
    }
}


public class Code07_09{
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit(); // 클래스명은 동일하지만 레빗1.2.3 모두 독립적으로 각 객체로 올라가게됨
        Rabbit rabbit2 = new Rabbit();
        Rabbit rabbit3 = new Rabbit();

        rabbit1.Shape = "원";
        rabbit2.Shape = "삼각형";
        rabbit3.Shape = "토끼";

        System.out.println("rabbit1.shape : " + rabbit1.Shape);
        System.out.println("rabbit2.shape : " + rabbit2.Shape);
        System.out.println("rabbit3.shape : " + rabbit3.Shape);

        rabbit1.setPosition(100, 100);
        rabbit2.setPosition(-100, 100);
        rabbit3.setPosition(0, 100);

    }
}