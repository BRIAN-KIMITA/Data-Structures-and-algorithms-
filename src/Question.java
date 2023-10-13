import java.awt.*;
import javax.swing.*;

public abstract class Question {
    static int nQuestions = 0;
    static int nCorrect = 0;
    QuestionDialog question;
    String correctAnswer;
    Question(String question){
        this.question =new QuestionDialog();
        this.question.setLayout(new GridLayout(0,1));
        this.question.add(new JLabel("     "+question+"    ",JLabel.CENTER));
    }
    void initQuestionDialog(){
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
    }

    void check() {
        nQuestions++;
        String answer = ask();
        if (answer.equals(correctAnswer)) {
            nCorrect++;
            JOptionPane.showMessageDialog(null, "correct!");
        } else if (answer.equals("A")) {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is" +correctAnswer);

        } else if (answer.equals("B")) {
            JOptionPane.showMessageDialog(null, "Incorrect.The correct answer is. " + correctAnswer);

        } else if (answer.equals("C")) {
            JOptionPane.showMessageDialog(null, "Incorrect.The correct answer is." + correctAnswer);

        } else if (answer.equals("D")) {
            JOptionPane.showMessageDialog(null, "Incorrect.The correct answer is. " + correctAnswer);

        } else if (answer.equals("E")) {
            JOptionPane.showMessageDialog(null, "Incorrect.The correct answer is. " + correctAnswer);

        } else {
            JOptionPane.showMessageDialog(null, "Incorrect.The correct answer is. " + correctAnswer);

        }
    }

    void showResults() { // here is the showResults method
        JOptionPane.showMessageDialog(null, "you got " + nCorrect + "correct out of " + nQuestions + "questions");
    }
    String ask() {
        question.setVisible(true);
        return question.answer;
    }
}
