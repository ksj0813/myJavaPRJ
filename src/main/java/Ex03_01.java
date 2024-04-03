public class Ex03_01 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();

        turtle.width(5);
        turtle.penColor("red");

        turtle.right(45);

        for(int i =0; i<4; i++){
        turtle.up();
        turtle.forward(20);
        turtle.down();
        turtle.forward(20);}

    }
}
