package JAVACLASS;

import java.util.Scanner;

public class Code09_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numary = new int[4]; // 난 4개 숫자를 저장한다.
        int hap = 0;

        System.out.printf("숫자 : ");
        numary[0] = s.nextInt();

        System.out.printf("숫자 : ");
        numary[1] = s.nextInt();

        System.out.printf("숫자 : ");
        numary[2] = s.nextInt();

        System.out.printf("숫자 : ");
        numary[3] = s.nextInt();

        for(int i=0; i < numary.length; i++) { // 배열이 몇개인지 세는과정이 반드시 들어감 (속도가 두배)
                hap += numary[i];
        }

        for(int i : numary){ // while문의 방식을 for문화 시킨것이다. / for which구문이다.
            hap += i;
        }
        System.out.println("합계 ==> " + hap);

    }
}
