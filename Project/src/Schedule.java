import java.util.ArrayList;
import java.util.InputMismatchException;

public class Schedule
{
  private ArrayList<Exam> exams;

  public Schedule(){
    try
    {
      exams = new ArrayList<Exam>();
    }
    catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
    }

  public void addExam(Exam exam){
  try
  {
    exams.add(exam);
  }
    catch (InputMismatchException e)
  {
    System.out.println("That is not an exam");
  }
  }

  public void removeExam(Exam exam){
    for(int i=0;i<exams.size();i++){
      if (exams.get(i).equals(exam)){exams.remove(i);};
    }
  }

  public String getAllExams(){
    String Str = "";
    for (int i=0;i<exams.size();i++)
    {Str += exams.get(i);}
    return Str;
  }
}
