

/**
 * Write a description of class numericQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class numericQuestion extends Question
{
    /** description of instance variable x (add comment for each instance variable) */
    private double answer;

    public void setAnswer( double correctResponse)
    {
        this.answer = correctResponse;
    }
    
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble( response );
        return Math.abs( responseAsDouble - answer) <= 0.01;
    }
    
    
}
  