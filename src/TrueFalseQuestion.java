
import javax.swing.*;
public class TrueFalseQuestion extends  Question {
    public TrueFalseQuestion(String question, String answer){
       super(question);
        JPanel buttons=new JPanel();
        addButton(buttons,"True");
        addButton(buttons,"False");
        this.question.add(buttons);
       initQuestionDialog();

        answer = answer.toUpperCase();
        if (answer.equals("T") || answer.equals("Y") || answer.equals("YES") || answer.equals("TRUE")) {
            super.correctAnswer = "TRUE";
        } else if (answer.equals("F") || answer.equals("N") || answer.equals("NO") || answer.equals("FALSE")) {
        super.correctAnswer = "FALSE";
        }
    }
    void addButton(JPanel buttons, String label){
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
    }

}


