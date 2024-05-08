package JAVACLASS;

public class Code07_05 {
    public static void main(String[] args) { // 객체라는것은 메모리에 올라간 자바파일을 의미하고
        Turtle turtle1 = new Turtle(); // 자바 클래스를 생성해서 new를 만나서 인스턴스화(객체화) 메모리로 올라가면 객체
        Turtle turtle2 = new Turtle(); // new메소드 만나서 변수명만 다르다면 클래스로부터 여러개의 객체를 사용할 수 있다.
        Turtle turtle3 = new Turtle(); // 객체를 메모리에 올려놓고, 형틀은 똑같지만, 객체는 다 독릭접이기 때문에 각각 따로 따로 메모리에 올라간것이고, 각각 명령어 or 기능을 줄 수 있다.

        turtle1.shape("circle"); // 속성(동그라미) 지정하고
        turtle1.setPosition(100,100); // 이동해라
        turtle2.shape("turtle");
        turtle2.setPosition(0,-100);
        turtle3.shape("triangle");
        turtle3.setPosition(-100,100);


    }

}
