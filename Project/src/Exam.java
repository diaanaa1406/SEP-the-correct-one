import java.util.ArrayList;
import java.util.InputMismatchException;
public class Exam
{
private String type;
private MyDate date;
private Clock startTime;
private Clock endTime;
private Classroom classroom;
private CourseList courseList;
private TeacherList teacherList;

public Exam(){}

  public String getType()
  {
    return type;
  }

  public MyDate getDate()
  {
    return date;
  }

  public Clock getStartTime()
  {
    return startTime;
  }

  public Clock getEndTime()
  {
    return endTime;
  }

  public Classroom getClassroom()
  {
    return classroom;
  }


  public TeacherList getTeacherList()
  {
    return teacherList;
  }

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
  public void setCourse(CourseList courseList){
    try{this.courseList = courseList;}
    catch(InputMismatchException e){System.out.println("incorrect input");} }
  public void setTeacherList(TeacherList tl){
    try{teacherList = tl;}
    catch(InputMismatchException e){System.out.println("incorrect input");} }



  public boolean equals(Object obj){
  if(!(obj instanceof Exam)){return false;}
  Exam other = (Exam)obj;
  return other.type.equals(type) && other.courseList.equals(courseList) && other.classroom.equals(classroom) &&
      other.date.equals(date) && other.startTime.equals(startTime) && other.endTime.equals(endTime) &&
      other.teacherList.equals(teacherList) && other.courseList.equals(courseList);
  }

  public String toString(){
  return type+date+startTime+endTime+classroom+courseList+teacherList+courseList;
  }
}

