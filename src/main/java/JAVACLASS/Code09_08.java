package JAVACLASS;

import java.util.Arrays;
import java.util.Collections;

public class Code09_08 {
    public static void main(String[] args) {
        int[] numAry = {44,98,23,43,45,56,54};
        Arrays.sort(numAry);
        for(int data : numAry) {
            System.out.println(data + " ");
        }
        System.out.println();
        String[] strAry = {"한빛", "아카데미", "난생", "자바", "열공"};
        Arrays.sort(strAry, Collections.reverseOrder());
        for(String data : strAry) {
            System.out.print(data + " ");
        }
    }

}
