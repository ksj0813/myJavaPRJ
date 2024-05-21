package JAVACLASS;

    abstract class Rabbit8 { //단독으로 메모리 올릴 수 없다.
        int xPos;
        int yPos;

        void main(int x, int y){
            this.xPos = x;
            this.yPos = y;
        }
        abstract void sleep(); //기능만 정의할때, 공통로직, 설계자들이 많이 사용 : 기능내용 비우고, 함수명만 작성 ==> 메모리 올릴 수 x , 기능 x
    }
    class HouseRabbit3 extends Rabbit8{ //상속 필수 why? 상속해서 기능구현
        void sleep(){ //실제 기능은 여기서 구현됨
            System.out.println("집토끼가 우리에서 잠자고 있습니다.");
        }
    }
    class MountainRabbit3 extends Rabbit8{
        void sleep(){
            System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
        }
    }
    public class Code08_08 {
        public static void main (String[] args){
            HouseRabbit3 hr = new HouseRabbit3();
            MountainRabbit3 mr = new MountainRabbit3();

            hr.sleep();
            mr.sleep();

        }

    }

