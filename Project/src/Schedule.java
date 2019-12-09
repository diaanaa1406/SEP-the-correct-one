import java.util.ArrayList;
import java.util.InputMismatchException;

public class Schedule
{
  private ArrayList<Exam> exams;

  public Schedule(){

  }

  public void addExam(Exam exam){
    exams.add(exam);
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
