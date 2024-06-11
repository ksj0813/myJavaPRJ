package JAVACLASS;

public class Code10_03 {
    public static int plus(int v1, int v2) { // 접근 제한 지시자를 써주자
        int result;
        result = v1 + v2; //void가 아닌것들은 반드시 result가 있어야 한다.
        return result;
    }

    public static void main(String[] args) {  //static이 있어야 메모리로 올릴 수 있음 없으면 메모리로 안올라감 , 안쓰고 싶으면 클래스 단위(통)로 new를 써줘서 메모리에 올려준다.
        int hap;
        hap = plus(100, 200);
        System.out.println("100과 200의 plus() 메서드 결과 : " + hap);
    }
}
