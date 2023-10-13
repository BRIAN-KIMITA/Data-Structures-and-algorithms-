
//This is the Quiz file
public class Quiz {

public static void main(String[] args) {
   MultipleChoiceQuestion question =new MultipleChoiceQuestion("How would you describe Noah",
           "honest and skillfull",
           "self-condident and friendly",
            "hardworking and loving",
           "kind and funny",
           "all of the above",
           "e"
           );
   question.check();
   MultipleChoiceQuestion question1 =new MultipleChoiceQuestion("which is the biggest continent in the world",
           "Asia",
           "Africa",
           "Australia",
           "North America",
           "all of the above",
           "a"
   );
   question1.check();
   MultipleChoiceQuestion question2 =new MultipleChoiceQuestion("which is the biggest currency",
           "dollar",
           "Africa",
           "Euro",
           "Rupee",
           "pound",
           "c"
   );
   question2.check();
   MultipleChoiceQuestion question3 =new MultipleChoiceQuestion("which of the following are part of the sense organ",
           "eye",
           "skin",
           "nose",
           "ear",
           "all of the above",
           "e"
   );
   question3.check();
   MultipleChoiceQuestion question4 =new MultipleChoiceQuestion("which one of the following is always in the table",
           "television set",
           "passat",
           "toilet",
           "plates",
           "pot",
           "a"
   );
   question4.check();
   Question question5=new TrueFalseQuestion("am brian","true");
   question5.check();
   Question question6=new TrueFalseQuestion("am brown in color","no");
   question6.check();
   Question question7=new TrueFalseQuestion("i love swimming yes","no");
   question7.check();
   Question question8=new TrueFalseQuestion("my name is ambrose","no");
   question8.check();
   Question question9=new TrueFalseQuestion("mary is my sister","no");
   question9.check();
   question.showResults();


}
}
