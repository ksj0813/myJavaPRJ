package JAVACLASS;

class Rabbit4{ //this임
    private String shape;
    // private int xPos; // private이라는 접근 제한 지시자로 '변수'를 설정하였기 때문에 rabbit 클래스 안에서만 사용가능
     public int xPos; // public : 어떠한 java객체든지 가져다 쓸 수 있다.
    // int xPos; // default : 같은 패키지안에 있으면 접근이 가능하다.
    private int yPos;

    void setPosition(int xPos, int yPos) { // 함수
        this.xPos = xPos; //rabbit4클래스 안에서만 함수 사용 할 수 있다.
        this.yPos = yPos;

    }
}
public class Code07_12 {
    public static void main(String[] args) {
        Rabbit4 r = new Rabbit4();

        r.xPos = 100; //에러 why? private 걸려있어서 다른 클래스에서는 접근할 수가 없다. 에러해결방법은 접근제한을 public or default 로 변경하여 같은 패키지 안에것들을 접근하게 하여라
        r.setPosition(100, 200);
    }
}
