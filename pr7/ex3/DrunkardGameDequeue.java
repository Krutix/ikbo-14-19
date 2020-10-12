package pr7.ex3;

import pr7.IDrunkardGame;

import java.util.ArrayDeque;
import java.util.Deque;

public class DrunkardGameDequeue implements IDrunkardGame {
    private Deque<Integer> firPlayer = new ArrayDeque<>();
    private Deque<Integer> secPlayer = new ArrayDeque<>();
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
            firPlayer.offer(el);
        for (int el : secPlayerStart)
            secPlayer.offer(el);
        while ((firPlayer.size() > 0 && secPlayer.size() > 0) && step < 106)
        {
            Integer fir = firPlayer.poll();
            Integer sec = secPlayer.poll();
            if (winner(fir, sec) > 0)
            {
                firPlayer.offer(fir);
                firPlayer.offer(sec);
            }
            else
            {
                secPlayer.offer(fir);
                secPlayer.offer(sec);
            }
            step++;
        }
        int[] res = new int[2];
        res[0] = firPlayer.size() - secPlayer.size();
        res[1] = step;
        return res;
    }
}
