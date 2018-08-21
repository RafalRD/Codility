import solutions.Shoes_factory;
import solutions.Six_side_die;

public class Main {

    public static void main(String[] args) {

        int[]  a = {1,1,1,6,6,6,3,2,1,5,4,4,5,5};
        String s="RLRRLLRLRRLL";

        Six_side_die six_side_die = new Six_side_die();
        Shoes_factory shoes_factory = new Shoes_factory();

//      zad1
//        System.out.println(six_side_die.solution(a));
//      zad2
        System.out.println(shoes_factory.solution(s));

    }



}
