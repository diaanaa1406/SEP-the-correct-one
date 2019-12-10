import java.util.ArrayList;
import java.util.InputMismatchException;
public class Exam
{
private String type;
private MyDate date;
private Clock startTime;
private Clock endTime;
private ClassroomList classroomList;
private CourseList courseList;
private TeacherList teacherList;

public Exam(String type, MyDate date, Clock startTime, Clock endTime, ClassroomList classroomList, CourseList courseList, TeacherList tl){

    try{this.type = type;}
    catch(InputMismatchException e){System.out.println("incorrect input");}
    try{this.date = date;}
    catch(InputMismatchException e){System.out.println("incorrect input");}
    try{this.startTime = startTime;}
    catch(InputMismatchException e){System.out.println("incorrect input");}
    try{this.endTime = endTime;}
    catch(InputMismatchException e){System.out.println("incorrect input");}
    try{this.classroomList = classroomList;}
    catch(InputMismatchException e){System.out.println("incorrect input");}
    try{this.courseList = courseList;}
    catch(InputMismatchException e){System.out.println("incorrect input");}
    try{teacherList = tl;}
    catch(InputMismatchException e){System.out.println("incorrect input");}
}

  public String getType() { return type; }

  public MyDate getDate() { return date; }

  public Clock getStartTime() { return startTime; }

  public Clock getEndTime() { return endTime; }

  public ClassroomList getClassroomList() { return classroomList; }

  public TeacherList getTeacherList() { return teacherList; }

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
    try{endTime = clock;}
    catch(InputMismatchException e){System.out.println("incorrect input");} }
  public void setClassroom(ClassroomList classroomList){
    try{this.classroomList = classroomList;}
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
  return other.type.equals(type) && other.courseList.equals(courseList) && other.classroomList.equals(classroomList) &&
      other.date.equals(date) && other.startTime.equals(startTime) && other.endTime.equals(endTime) &&
      other.teacherList.equals(teacherList) && other.courseList.equals(courseList);
  }

  public String toString(){
  return "type: "+type+"\n date: "+date+"\n startTime: "+startTime+"\n endTime: "+endTime+"\n clasroomList: "+classroomList+"\n courseList: "+courseList+"\n teacherList: "+teacherList+courseList;
  }
}

