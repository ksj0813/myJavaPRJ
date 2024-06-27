package JAVACLASS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListExam {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //<String> 써도 되고, 안써도 되는데 써주면 형변환이 편하다. , new뒤에 함수만 바꿔주면됨
//        List 객체에 데이터 추가하기
        list.add("김수진");
        list.add("김소연");
        list.add("김태승");
        list.add("이재성"); //데이터에 대해서, 수정하기 편리하기 때문에 프레임워크를 사용한다.
//      List 저장된 데이터 수
        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);
//      일반적인 반복문 -- 1세대
//      단점 : 반드시 반복의 횟수를 알고 있어야 사용 가능함
        System.out.println("1세대 반복문");

        for (int i = 0; i < listSize; i++) {
            System.out.println("이름 : " + list.get(i)); //list.get -> 값을 가져와라
        }
//      개선된 For 반복문 -- 2세대
//      장점 : 1세대 반복문의 단점인 반드시 반복의 횟수를 알고 있어야 하는 반복문의 문제점을 개선함
        System.out.println("2세대 반복문");

        for (String name : list) {
            System.out.println("이름 : " + name);
        }
//      개선된 For 반복문 -- 3세대
//      장점 : 2세대보다 코딩해야 하는 줄(라인)이 감소함, 람다식 적용, 자바 1.8부터 사용 가능
        System.out.println("3세대 반복문"); //람다라는 개념 , 2세대와 성능측면에서는 괜찮은데 코드길이 줄어듬 , 컬렉션에서도 반복문을 사용할거라고 생각해서 람다라는 개념이 나옴
        // 별도의 타입을 지정하지 않는다. 이 안의 값들을 하나하나꺼냄, 꺼내서 너 뭐할건데 -> 프린트 할거야 , 람다식은 코테에 많이 나오니깐 외우자
        list.forEach(name -> System.out.println("name : " + name));
//      개선된 For 반복문 -- 4세대
//      장점 : 3세대에 비동기식 처리 방법 적용
//      단점 : 처리 완료가 누가 먼저 될지 알 수가 없음. 따라서 모든 경우에 다 쓸 수 없음
        System.out.println("4세대 반복문"); //어떻게 하면 속도를 빠르게 할 수 있을까
        // 시작은 알 수 있으나 끝은 알 수 없음, 언제 끝나는지 알지 못함 , 순서가 바뀐다.
        list.parallelStream().forEach(name -> System.out.println("name : " + name)); //프로세스 안에서 작동되는 한개한개(스레드) - 싱글스레드 , 병렬처리방식(병렬스레드)_양이 많으면 많을수록 빨리짐 => 대신 결과에서의 순서를 알 수 가 없다.
//      while 반복문 -- 1.5세대 -- for 반복문 1세대보다 처리 속도가 빠름
//      자바 1.7까지 가장 많이 쓰던 반복문
//      단점 : 코드가 길어짐
        System.out.println("1.5세대 반복문");

        Iterator<String> it = list.iterator(); // 리스트라는 기능에 반복이라는 기능을 추가하겠다.

        // for반복의 횟수알때 vs while 반복의 횟수모를때

        while (it.hasNext()) { // hasNext => 다음에 값을 갖고 있니? 포인터 위치 옆으로 가렴 / 2세대와 로직은 동일함
            String name = it.next(); // next 이동 한다음에 name을 데려와
            System.out.println("이름 : " + name);
        }
    }

}
