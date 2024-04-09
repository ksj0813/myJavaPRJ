package JAVACLASS;

public class Code06_06 {
    // 변수선언 가능위치 (클래스 끝났을때 죽는다.)
    public static void main(String[] args) {

         int hap=0; // 전역변수 : main함수 영역에서 변수 선언
        //for문이 끝나는것과 상관없이 main함수 끝나면 메모리가 지워짐 (그러므로 누적값이 저장되어짐)


        for (int i = 1; i <= 10; i++) {
            // hap += i;
           // int hap = 0; // 지역변수 : 함수범위안에서 사용하는 변수 선언
            hap += i;      // 영역={ } 안에서 살아있음 // hap메모리 올림 => 범위안에서는 누적핪을 살릴길이 없음

            System.out.println("hap : " + hap);  // 실행한뒤에 메모리가 지워짐 , 범위끝나면 죽임
        }
        System.out.println("1부터 10까지의 합계는 " + hap);
    }
}