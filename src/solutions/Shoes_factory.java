package solutions;

// Given a string s of letters "L" and "R", denoting the types of shoes
// in line(left or right), returns the maximum number of intervals such
// that each interval contains an equal number of left end right shoes.
// For example s="RLRRLLRLRRLL" return 4 because S can be split
// into intervals: "RL", "RRLL", "RL", "RRLL"
public class Shoes_factory {

    public int solution(String s) {

        int L=0;
        int R=0;
        int result=0;

        for (int i = 0; i<s.length(); i++)
        {
            if (s.charAt(i) == 'L')
                L++;
            else R++;
            if(R==L)
            {
                result++;
                L=0;
                R=0;
            }
        }
        return result;
    }
}
