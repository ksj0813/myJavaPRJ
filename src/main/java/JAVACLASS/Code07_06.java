package JAVACLASS;

class Rabbit{
    String Shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y) {
        this.xPos = x; // this는 클래스를 의미 rabbit이라는 클래스를 의미
        this.yPos = y;

        System.out.println("xPos : " + this.xPos + " / yPos : " + this.yPos);
    }
}


public class Code07_06 {
    public static void main(String[] args) {
        Rabbit rb1 = new Rabbit();
        rb1.setPosition(100, 100);

    }
}
