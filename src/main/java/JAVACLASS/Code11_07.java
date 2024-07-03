package JAVACLASS;

public class Code11_07 {
    public static void main(String[] args) {
        int [] ary = {10 ,20, 30};

        try { // try안에 있는 구문에서 에러가 발생한다 하며는
            ary[3] = 1234 / 0; // 에러코드
            ary[3] = 1234; // 에러코드


        } catch (ArrayIndexOutOfBoundsException e) { // catch가 잡히는 부분이 있으면 출력됨, try {} 에러발생시 에러를 순서대로 잡아준다. 에러가 가장 작은것부터 사용한다.
            System.out.println("배열 첨자 오류입니다." + e);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누는 등의 수식 오류입니다." + e);
        } catch (Exception e) { // 제일 마지막에는 이 문장이 나와줘야함 에러의 시조임, 예상치 못한 장애발생시 catch안하면 스레드가 죽어버림
            System.out.println("난 자바 에러 최초 조상: " + e);
        } finally { // 실제 코딩을 하다보면은 finally를 쓸 확률이 매우 높아짐, 에러나면 메모리 못 비워주니깐 여기서 메모리를 비워주는 역할을 함
            System.out.println("이 부분은 무조건 보여요.");
        }
    }
}
