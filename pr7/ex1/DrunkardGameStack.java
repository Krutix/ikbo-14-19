package pr7.ex1;

import pr7.IDrunkardGame;

import java.util.*;

public class DrunkardGameStack implements IDrunkardGame {
    private Stack<Integer> firPlayer = new Stack<>();
    private Stack<Integer> secPlayer = new Stack<>();
    private Stack<Integer> firDischarge = new Stack<>();
    private Stack<Integer> secDischarge = new Stack<>();
    private int step = 0;

    private int winner(Integer fir, Integer sec)
    {
        if (fir.equals(9) || sec.equals(9))
            if (fir.equals(0) || sec.equals(0))
                return fir.equals(0) ? -1 : 1;
        return sec.compareTo(fir);
    }

    @Override
    public int[] Solution(int[] firPlayerStart, int[] secPlayerStart)
    {
        for (int el : firPlayerStart)
            firDischarge.push(el);
        for (int el : secPlayerStart)
            secDischarge.push(el);
        while (((firPlayer.size() > 0 || firDischarge.size() > 0) &&
                (secPlayer.size() > 0 || secDischarge.size() > 0)) && step < 106)
        {
            if (firPlayer.size() == 0)
                while (firDischarge.size() > 0)
                    firPlayer.push(firDischarge.pop());
            if (secPlayer.size() == 0)
                while (secDischarge.size() > 0)
                    secPlayer.push(secDischarge.pop());
            Integer fir = firPlayer.pop();
            Integer sec = secPlayer.pop();
            if (winner(fir, sec) > 0)
            {
                firDischarge.push(fir);
                firDischarge.push(sec);
            }
            else
            {
                secDischarge.push(fir);
                secDischarge.push(sec);
            }
            step++;
        }
        int[] res = new int[2];
        res[0] = firPlayer.size() - secPlayer.size();
        res[1] = step;
        return res;
    }
}
