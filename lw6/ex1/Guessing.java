package lw6.ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guessing {
    private JLabel info;
    private JButton tryButton;
    private JLabel attempts;
    public JPanel panel;
    private JSpinner guessSpinner;

    private int attemptsCount;
    private int guessNumb;

    public Guessing()
    {
        restartGame();
        info.setText("Guess the number (0 - 20)");
        tryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Integer.parseInt(guessSpinner.getValue().toString()) == guessNumb)
                {
                    JOptionPane.showMessageDialog(panel, "U WIN");
                    restartGame();
                }
                else if (Integer.parseInt(guessSpinner.getValue().toString()) < guessNumb && attemptsCount != 1)
                {
                    info.setText("Guess number higher");
                    attemptsCount--;
                    updateAttemptsLeft();
                }
                else if (attemptsCount != 1)
                {
                    info.setText("Guess number lower");
                    attemptsCount--;
                    updateAttemptsLeft();
                }
                else
                {
                    JOptionPane.showMessageDialog(panel, "U LOSE!");
                    restartGame();
                }
            }
        });
    }

    private void restartGame()
    {
        info.setText("Guess the number (0 - 20)");
        guessNumb = (int)(Math.random() * 20);
        //System.out.println(guessNumb);
        attemptsCount = 3;
        updateAttemptsLeft();
    }

    private void updateAttemptsLeft()
    {
        attempts.setText(String.format("Attempts left: %d", attemptsCount - 1));
    }
}
