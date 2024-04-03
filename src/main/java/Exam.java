import java.util.Scanner;

//3의 배수?
//5의 배수?
//3의 배수와 5의 배수를 모두 만족하는지?
public class Exam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;
        a = s.nextInt();

        if ((a % 3 == 0) && (a % 5 == 0)) { // if(num%15 == 0)
            System.out.print(" 3의배수,5의배수 모두 만족합니다.");
        } else if (a % 3 == 0) {
            System.out.print(" 3의 배수입니다.");
        } else if (a % 5 == 0) {
            System.out.print(" 5의 배수입니다.");

        }
    }
}
