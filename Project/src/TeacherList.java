import java.util.ArrayList;
import java.util.InputMismatchException;

public class TeacherList
{

  private ArrayList<Teacher> teachers;

  public int getNumberOfTeachers(){return teachers.size();}

  public void addTeacher(Teacher teacher){
    try
    { teachers.add(teacher); }
    catch (InputMismatchException e)
    { System.out.println("That is not an exam"); }
  }

  public void removeTeacher(Teacher teacher){
    for(int i=0;i<teachers.size();i++){
      if (teachers.get(i).equals(teacher)){teachers.remove(i);};
    }
  }

  public String getAllTeachers(){
    String Str = "";
    for (int i=0;i<teachers.size();i++)
    {Str += teachers.get(i);}
    return Str;
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof TeacherList)){return false;}
    TeacherList other = (TeacherList)obj;
    boolean sameteachers = true;
    for (int i=0; i<teachers.size();i++){if(!(teachers.get(i).equals(other.teachers.get(i)))){sameteachers = false;}}
    return sameteachers;
  }

}
