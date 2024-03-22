public class Star01 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {

            if (i < 4) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            }

            if (i >= 4) {
                for (int j = 0; j<7-i ; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}

        /****
         *  for문은
         *  for (조건) {
         *      코드
         *  }
         *  조건만큼 코드를 반복
         *
         *  int i = 0; 초기화했다
         *  변수; 시작점
         *  변수 < 값; 끝점
         *  변수++ / -- 증가냐 감소냐
         *
         *  별찍기 힌트
         *
         *  1번 for문 (조건) {
         *       if (별이 더 증가하지 않는 구간까지) {
         *          2번 for문 (별이 늘어나는 조건) {
         *              별을 찍는 코드
         *          }
         *       } else {
         *          3번 for문 (별이 감소하는 조건) {
         *              별을 찍는 코드
         *          }
         *       }
         *  }
         *
         *
         */
