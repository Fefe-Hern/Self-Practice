package chapter3;

import javax.swing.JOptionPane;

public class AdditionQuiz {
    public static void main(String[] args) {
        int firstNumber = (int)(Math.random() * 100); // Create two numbers to add together
        int secondNumber = (int)(Math.random() * 100);
        int answer = Integer.parseInt(JOptionPane.showInputDialog("What is " + firstNumber + " + " +
                secondNumber + " ?"));
        JOptionPane.showMessageDialog(null, firstNumber + " + " + secondNumber + " = " + answer + " is " +
                (answer == (firstNumber + secondNumber)));
    }
    
}
