package JAVACLASS;

class Rabbit5 {
    String shape;
    int xPos;
    int yPos;
    static int count; // static : 변수,함수자체를 올리고 싶다일때 사용.(메모리 저장장소 다름) //
    Rabbit5() { //생성자
        count++; //new 함수로 메모리 올라갈때마다 실행

    }
}
public class Code08_01 {
    public static void main(String[] args) { //.java -> .class 파일 메모리올라갈때 static적용된것
        System.out.println("객체 생성 전의 총 토끼 수 ==>" + Rabbit5.count); //new(메소드)쓴적 없는데 갖고 올 수 있었던 것 은
        // static으로 선언되었기 때문에 java파일 컴파일 실행될때 자동으로 메모리 올라감

        Rabbit5 rabbit5 = new Rabbit5(); //클래스 단위로 메모리에 올림_위에 class Rabbit5가 new를 만나서 통으로 메모리에 올라가나,
        //단, static으로 선언된 아이들은 new를 만나지 않아도 컴파일될때 얘네는 무조건 자동으로 메모리에 올라감
        System.out.println("토끼 객체1 생성 후의 총 토끼 수 ==>" + Rabbit5.count);

        Rabbit5 rabbit51 = new Rabbit5();
        System.out.println("토끼 객체2 생성 후의 총 토끼 수 ==>" + Rabbit5.count);
    }

}
