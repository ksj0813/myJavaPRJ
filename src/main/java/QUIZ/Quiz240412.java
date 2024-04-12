package QUIZ;

import java.util.Scanner;

public class Quiz240412 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Scanner 클래스를 사용해서 값을 입력받을 수 있게함
        int a = s.nextInt(); //사용자로부터 정수를 입력받을 때 사용하는 메서드 a로선언
        int b = s.nextInt(); //사용자로부터 정수를 입력받을 때 사용하는 메서드 b로선언
        int hap = 0; //hap이라는 변수 선언 & 초기화

        for (int i = a ; i <= b; i++) //for문을 사용해서 조건을 걸어준다. a 값부터 b값까지 i+1 되면서 조건식을 반복된다.
        {
            if (i % 2 != 0) { //i를 2로 나눴을때 0이 아닌 숫자 , 즉 홀수 값
                hap += i; // for문이 끝날때까지 i값이 계속 누적됨

            }
        }
        System.out.println( hap ); //a~b까지 홀수의 핪 값이 출력된다.
    }
}
