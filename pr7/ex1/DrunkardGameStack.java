package pr7.ex1;

import pr7.IDrunkardGame;
import pr7.ResultDrunkard;

import java.util.*;

public class DrunkardGameStack implements IDrunkardGame {
    private Stack<Integer> firPlayer;
    private Stack<Integer> secPlayer;
    private Stack<Integer> firDischarge;
    private Stack<Integer> secDischarge;
    private Stack<Integer> battle;
    private int step;

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
        firPlayer = new Stack<>();
        secPlayer = new Stack<>();
        firDischarge = new Stack<>();
        secDischarge = new Stack<>();
        battle = new Stack<>();
        step = 0;
        for (int el : firPlayerStart)
            firDischarge.push(el);
        for (int el : secPlayerStart)
            secDischarge.push(el);
        while (((firPlayer.size() > 0 || firDischarge.size() > 0) &&
                (secPlayer.size() > 0 || secDischarge.size() > 0)) && step < 10000)
        {
            if (firPlayer.size() == 0)
                while (firDischarge.size() > 0)
                    firPlayer.push(firDischarge.pop());
            if (secPlayer.size() == 0)
                while (secDischarge.size() > 0)
                    secPlayer.push(secDischarge.pop());
            Integer fir = firPlayer.pop();
            Integer sec = secPlayer.pop();
            int win = winner(fir, sec);
            if (win < 0)
            {
                res.drunkardLog += "Win 1 player: f:" + fir + " x s:" + sec + "\n";
                while (battle.size() > 0)
                    firDischarge.push(battle.remove(0));
                firDischarge.push(fir);
                firDischarge.push(sec);
            }
            else if (win > 0)
            {
                res.drunkardLog += "Win 2 player: f:" + fir + " x s:" + sec + "\n";
                while (battle.size() > 0)
                    secDischarge.push(battle.remove(0));
                secDischarge.push(fir);
                secDischarge.push(sec);
            }
            else
            {
                res.drunkardLog += "Draw: f:" + fir + " x s:" + sec + "\n";
                battle.push(fir);
                battle.push(sec);
            }
            step++;
        }
        res.drunkardLog += "Game end\n";
        res.Win = firPlayer.size() + firDischarge.size() - secPlayer.size() - secDischarge.size();
        res.steps = step;
        return res;
    }
}
