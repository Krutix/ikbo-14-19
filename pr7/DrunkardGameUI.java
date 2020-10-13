package pr7;

import pr7.ex1.DrunkardGameStack;
import pr7.ex2.DrunkardGameQueue;
import pr7.ex3.DrunkardGameDequeue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class DrunkardGameUI {
    private IDrunkardGame game = new DrunkardGameStack();
    private int enterData = 0;
    private int[] firstCards;
    private int[] secondCards;
    private Pattern split = Pattern.compile(" ");

    private JTextField enterCardsField;
    private JButton enterButton;
    private JComboBox dataStorage;
    private JButton randomButton;
    private JTextArea fightResult;
    private JSpinner randomSize;
    private JLabel enterCardsLabel;
    public JPanel mainPanel;
    private JLabel fpCards;
    private JLabel spCards;
    private JLabel fpWins;
    private JLabel spWins;

    private static int[] toIntArray(String[] array)
    {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++)
            result[i] = Integer.parseInt(array[i]);
        return result;
    }

    public DrunkardGameUI()
    {
        dataStorage.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String storage = (String)dataStorage.getSelectedItem();
                if (storage.compareTo("Stack") == 0)
                    game = new DrunkardGameStack();
                else if (storage.compareTo("Queue") == 0)
                    game = new DrunkardGameQueue();
                else if (storage.compareTo("Deque") == 0)
                    game = new DrunkardGameDequeue();
            }
        });
        randomButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int randomSizeValue = (int) randomSize.getValue();
                if (randomSizeValue < 1)
                    randomSizeValue = 1;
                StringBuilder randomCards = new StringBuilder();
                for (int i = 0; i < randomSizeValue; i++) {
                    randomCards.append((int) (Math.random() * randomSizeValue * 2));
                    if (i != randomSizeValue - 1)
                        randomCards.append(" ");
                }
                enterCardsField.setText(randomCards.toString());
            }
        });
        enterButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (enterData)
                {
                    case 0:
                        try {
                            firstCards = toIntArray(split.split(enterCardsField.getText()));
                            fpCards.setText(enterCardsField.getText());
                            enterData++;
                        }
                        catch (Exception ignored) { }
                        break;
                    case 1:
                        try {
                            secondCards = toIntArray(split.split(enterCardsField.getText()));
                            spCards.setText(enterCardsField.getText());
                            enterData++;
                        }
                        catch (Exception ignored) { }
                    case 2:
                        ResultDrunkard res = game.Solution(firstCards, secondCards);
                        fpWins.setText(String.valueOf(res.fpWins));
                        spWins.setText(String.valueOf(res.spWins));
                        fightResult.setText(res.drunkardLog);
                        if (res.Win != 0)
                            fightResult.append("\nWinner is " + (res.Win < 0 ? "first" : "second") + " for " + res.steps + " steps\n");
                        else
                            fightResult.append("\n Draw for " + res.steps + " steps\n");
                        enterData = 0;
                        break;
                }
            }
        });
    }

}
