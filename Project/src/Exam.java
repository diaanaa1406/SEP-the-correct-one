import java.util.ArrayList;
import java.util.InputMismatchException;
public class Exam
{
private String type;
private MyDate date;
private Clock startTime;
private Clock endTime;
private Classroom classroom;
private Course course;
private ArrayList<Teacher> teachers;

public Exam(){}

  public void setType(String type){
    try{this.type = type;}
    catch(InputMismatchException e){System.out.println("incorrect input");} }
  public void setDate(MyDate date){
    try{this.date = date;}
    catch(InputMismatchException e){System.out.println("incorrect input");} }
  public void setStartTime(Clock clock){
    try{startTime = clock;}
    catch(InputMismatchException e){System.out.println("incorrect input");} }
  public void setEndTime(Clock clock){
    try{startTime = clock;}
    catch(InputMismatchException e){System.out.println("incorrect input");} }
  public void setClassroom(Classroom classroom){
    try{this.classroom = classroom;}
    catch(InputMismatchException e){System.out.println("incorrect input");} }
  public void setCourse(Course course){
    try{this.course = course;}
    catch(InputMismatchException e){System.out.println("incorrect input");} }

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

  public boolean equals(Object obj){
  if(!(obj instanceof Exam)){return false;}
  Exam other = (Exam)obj;
  boolean sameteachers = true;
  for (int i=0; i<teachers.size();i++){if(!(teachers.get(i).equals(other.teachers.get(i)))){sameteachers = false;}}
  return other.type.equals(type) && other.course.equals(course) && other.classroom.equals(classroom) &&
      other.date.equals(date) && other.startTime.equals(startTime) && other.endTime.equals(endTime) && sameteachers;
  }

  public String toString(){
  return type+date+startTime+endTime+classroom+course+getAllTeachers();
  }
}

