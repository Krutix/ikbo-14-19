package pr7.ex3;

import pr7.IDrunkardGame;
import pr7.ResultDrunkard;

import javax.xml.transform.Result;
import java.util.ArrayDeque;
import java.util.Deque;

public class DrunkardGameDequeue implements IDrunkardGame {
    private Deque<Integer> firPlayer;
    private Deque<Integer> secPlayer;
    private Deque<Integer> battle;
    private int step = 0;

    private int winner(Integer fir, Integer sec)
    {
        if (fir.equals(9) || sec.equals(9))
            if (fir.equals(0) || sec.equals(0))
                return fir.equals(0) ? -1 : 1;
        return sec.compareTo(fir);
    }

    @Override
    public ResultDrunkard Solution(int[] firPlayerStart, int[] secPlayerStart)
    {
        ResultDrunkard res = new ResultDrunkard();
        res.drunkardLog += "Game start\n";
        firPlayer= new ArrayDeque<>();
        secPlayer= new ArrayDeque<>();
        battle = new ArrayDeque<>();
        for (int el : firPlayerStart)
            firPlayer.offer(el);
        for (int el : secPlayerStart)
            secPlayer.offer(el);
        while ((firPlayer.size() > 0 && secPlayer.size() > 0) && step < 10000)
        {
            Integer fir = firPlayer.poll();
            Integer sec = secPlayer.poll();
            int win = winner(fir, sec);
            if (win < 0)
            {
                res.drunkardLog += "Win 1 player: f:" + fir + " x s:" + sec + "\n";
                res.fpWins++;
                while (battle.size() > 0)
                    firPlayer.offer(battle.poll());
                firPlayer.offer(fir);
                firPlayer.offer(sec);
            }
            else if (win > 0)
            {
                res.drunkardLog += "Win 2 player: f:" + fir + " x s:" + sec + "\n";
                res.spWins++;
                while (battle.size() > 0)
                    secPlayer.offer(battle.poll());
                secPlayer.offer(fir);
                secPlayer.offer(sec);
            }
            else
            {
                res.drunkardLog += "Draw: f:" + fir + " x s:" + sec + "\n";
                battle.offer(fir);
                battle.offer(sec);
            }
            step++;
        }
        res.drunkardLog += "Game end\n";
        res.Win = firPlayer.size() - secPlayer.size();
        res.steps = step;
        return res;
    }
}
