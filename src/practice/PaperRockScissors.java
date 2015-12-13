/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javax.swing.JOptionPane;

/**
 *
 * @author fefe
 */
public class PaperRockScissors {

    static String[] options = {"Rock", "Paper", "Scissors"};
    static String playerChoiceString;
    static String randChoiceString;

    public static void main(String[] args) {
        while (true) {
            int playerChoice = getPlayerHand();
            int randChoice = (int) (Math.random() * 10) % 3;
            playerChoiceString = options[playerChoice];
            randChoiceString = options[randChoice];
            switch (playerChoice) {
                case 0:
                    if (randChoice == 0) {
                        displayTie();
                    } else if (randChoice == 1) {
                        displayLoss();
                    } else {
                        displayWin();
                    }
                    break;
                case 1:
                    if (randChoice == 0) {
                        displayWin();
                    } else if (randChoice == 1) {
                        displayTie();
                    } else {
                        displayLoss();
                    }
                    break;
                case 2:
                    if (randChoice == 0) {
                        displayLoss();
                    } else if (randChoice == 1) {
                        displayWin();
                    } else {
                        displayTie();
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private static int getPlayerHand() {
        int playerChoice = JOptionPane.showOptionDialog(
                null, "Pick your hand!", "Paper, Rock, Scissors", 0, 3, null, options, 0);
        if(playerChoice == -1) System.exit(0);
        return playerChoice;
    }

    private static void displayTie() {
        JOptionPane.showMessageDialog(null, "You've tied! "
                + playerChoiceString + " ties with " + randChoiceString);
    }

    private static void displayLoss() {
        JOptionPane.showMessageDialog(null, "You've lost! "
                + playerChoiceString + " loses to " + randChoiceString);
    }

    private static void displayWin() {
        JOptionPane.showMessageDialog(null, "You've won! "
                + playerChoiceString + " beats " + randChoiceString);
    }
}
