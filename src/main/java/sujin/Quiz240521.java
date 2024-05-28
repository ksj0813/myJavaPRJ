package sujin;

public class Quiz240521 {
    public static void main(String[] args) {
        for (int i = 1, j = 2; j < 10; i++) { // 변수 i,j 두가지를 주어 for반복문을 실행함 , i=1,j=2부터 하나씩 증가하며 반복됨
            if (i > 9) { // i>9일때, i=0 이고, j는 하나씩 늘어남
                i = 0;
                j++;
                System.out.println(); // 옆칸으로 줄바꿈 역할
            } else { // i<9일때, j x i = j*i 값을 출력한다.
                System.out.printf("%d * %d = %2d ", j, i, i * j); //구구단 출력됨
            }
        }
    }
}
