import java.util.Scanner;

public class Quiz240403 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //변수의 값을 키보드로 입력받도록 도와주는 Scanner 클래스 s 객체 준비
        int num;
        //변수 선언(정수 : 아무숫자나 입력가능)
        num = s.nextInt();
        //사용자로부터 정수를 입력받을 때 사용하는 메서드, 키보드로 변수의 값을 입력받는다.
        if(num%21==0) {
            //조건1 만약 정수가 3과7의 최소공배수인 21로 나누었을때 나머지가 0이라면
            System.out.println("3과7의 배수 모두 만족합니다.");
            //괄호안의 문장을 출력합니다.
        }else if(num%7==0) {
            //조건2 조건1을 만족하지 않고, 만약 7로 나누었을때 나머지가 0이라면
            System.out.println("7의 배수 만족합니다.");
            //괄호안의 문장을 출력합니다.
        }else if(num%3==0){
            //조건3 조건1,조건2를 만족하지 않고, 만약 3으로 나누었을때 나머지가 0이라면
            System.out.println("3의 배수 만족합니다.");
            //괄호안의 문장을 출력합니다.
        }else if (num!=0){
            //조건4 조건1,조건2,조건3을 만족하지 않고, 정수가 0이 아니라면
            System.out.println("아무일도 일어나지 않습니다.");
            //괄호안의 문장을 출력합니다.
        }
    }
}
