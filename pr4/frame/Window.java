package frame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window extends JFrame {
    private int scoreT1 = 0;
    private int scoreT2 = 0;

    private JButton increaseScoreT1 = new JButton("AC Milan");
    private JButton increaseScoreT2 = new JButton("Real Madrid");
    private JLabel score = new JLabel("Score: 0x0");
    private JLabel lastScorer = new JLabel("Last: ");
    private JLabel winner = new JLabel("Winner: DRAW");

    public Window(){
        super("Match");
        setSize(660,70);
        setLayout(new FlowLayout());
        add(increaseScoreT1);
        add(increaseScoreT2);
        add(score);
        add(lastScorer);
        add(winner);

        increaseScoreT1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreT1++;
                lastScorer.setText("Last Scorer: " + increaseScoreT1.getText());
                updateScore();
            }
        });

        increaseScoreT2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreT2++;
                lastScorer.setText("Last Scorer: " + increaseScoreT2.getText());
                updateScore();
            }
        });
    }

    private void updateScore(){
        score.setText("Score: " + scoreT1 + "x" + scoreT2);
        winner.setText("Winner: " +
                (scoreT1 == scoreT2 ? "DRAW" :
                        (scoreT1 > scoreT2 ? increaseScoreT1.getText() :
                                increaseScoreT2.getText())));
    }
}
