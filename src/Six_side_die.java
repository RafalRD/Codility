
// A six-side die is a small cub with a different number of
// of pips on each face(side), ranging 1 to 6.
// You wont to show the same number of pips on the top faces of all N dice
// count the minimum number of moves to get the equal faces.
public class Six_side_die {

    public int solution(int[] A) {
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;

        int result_one_six;
        int result_two_five;
        int result_three_four;

        int result;

        for (int aA : A) {
            if (aA == 1)
                one++;
            else if (aA == 2)
                two++;
            else if (aA == 3)
                three++;
            else if (aA == 4)
                four++;
            else if (aA == 5)
                five++;
            else if (aA == 6)
                six++;
            else return -1; // wrong input
        }

        if(one>=six)
        {
            result_one_six = A.length-one-six+six*2;
        }
        else {
            result_one_six = A.length-six-one+one*2;
        }
        if (two>=five)
        {
            result_two_five = A.length-two-five+five*2;
        }
        else {
            result_two_five = A.length-five-two+two*2;
        }
        if (three>=four)
        {
            result_three_four = A.length-three-four+four*2;
        }
        else {
            result_three_four = A.length-four-three+three*2;
        }

        result = Math.min(result_one_six,Math.min(result_three_four,result_two_five));

        return result;
    }
}
