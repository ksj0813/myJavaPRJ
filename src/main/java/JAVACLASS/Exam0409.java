package JAVACLASS;

import java.util.Scanner;

// 숫자 입력 받아서 첫번째 시작값, 두번째가 끝나는 값까지 반복
// Q2. 첫번째 200, 100이라면, 첫번째 수가 크다면...200,199,198,,,,
// Q3 . Q2만족하는 상태에서 출력되는 값이 3의 배수만 출력
public class Exam0409 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if(a<b) {
            for (int i = a; i <= b; i++) {
                if(i%3==0)
                System.out.println(i);
            }
        }
        else {
            for(int i =a; i>=b; i--){
                if (i%3==0)
                System.out.println(i);
            }

        }
    }
}
