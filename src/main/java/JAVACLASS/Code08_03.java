package JAVACLASS;

class Rabbit7 { //공통적인 기능 클래스
    //private (상속 안시킬 수 있음)
    String shape;
    //private
    int xPos;
    //private
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        System.out.println("xPOS : " + xPos + " /yPos : " + yPos); // 공통적인 내용 출력 둘다됨


    }
}

class HouseRabbit1 extends Rabbit7 { //공통기능
    String owner;
    void eatFeed() { //고유기능
        System.out.println("집토끼가 사료를 먹습니다.");
    }
}
class MountainRabbit1 extends Rabbit7 { //공통기능 , java 부모가 only 한명이다, if,c++에서는 부모가 여러개일수있다._다양한 공통기능을 상속해줄 수 있다. but, 코드가 복잡해진다.
    String mountain;
    void eatWildglass(){ //고유기능
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Code08_03 {
    public static void main(String[] args) {
        HouseRabbit1 hRabbit = new HouseRabbit1(); // 자식클래스로 메모리 올리겠습니다. 생성자도 상속받은애로 메모리 올리겠습니다.
        MountainRabbit1 mRabbit = new MountainRabbit1();

        hRabbit.shape = "삼각형"; //클래스 공통 토끼에서 상속받은 shape
        hRabbit.owner = "난생이"; // 본인자체에 있던것
        hRabbit.move(100, 100); //공통에 있던 함수
        hRabbit.eatFeed(); //본인자체에 있던것

        mRabbit.shape = "네모"; // 클래스 공통 토끼에서 상속받은 shape
        mRabbit.mountain = "설악산"; //본인자체에 있던것
        mRabbit.move(200,200); // 공통에 있던 함수
        mRabbit.eatWildglass(); // 본인자체에 있던것
    }
}
