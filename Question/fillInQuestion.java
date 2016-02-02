import java.util.Scanner;

/**
 * Write a description of class fillInQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fillInQuestion extends Question
{
   //override the settext method to extract the answer from the question text
   public void setText( String questionText )
   {
       Scanner parser = new Scanner(questionText);
       parser.useDelimiter( "_");
       String question = parser.next();
       String Answer = parser.next();
       question += "_________" + parser.next();
       
       //have to call the method from the parent class
       super.setText(question);
       // we dont have to put anything before setAnswer
       this.setAnswer(Answer);
       
       
   }
    

}