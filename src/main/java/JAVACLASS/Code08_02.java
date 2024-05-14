package JAVACLASS;

class Rabbit6 {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y) { //덮어쓰기 하는것이다 보니, 자식한테 오버라이드 할때는 대괄호 한줄(변수)이 완전히 똑같이 자식한테 써놔야함
        this.xPos = x;
        this.yPos = y;

    }
}

class HouseRabbit extends Rabbit6 {
    String owner;
    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }

    @Override //(ALT + INSERT) 어노테이션 : 밑에 사용될 함수 혹은 변수에 대한 설명이라던지 정의를 설명 /안써도 되긴하는데 써주는것이 좋다.
    void move(int x, int y) { //부모와 함수명이 완전히 똑같게 만들자
     //   super.move(x, y); // super = Rabbit6 = 부모
        System.out.println("나는 덮어쓰기한 이동 함수 입니다.");
    }
}
class MountainRabbit extends Rabbit6 {
    String mountain;
    void eatWildglass(){
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Code08_02 {
    public static void main(String[] args) {

    }
}
