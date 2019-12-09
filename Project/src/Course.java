import java.awt.event.WindowStateListener;
import java.util.ArrayList;

public class Course
{
  private ArrayList<Teacher> teachers;
  private String name;
  private String id;
  private int numberOfStudents;
  private String typeOfExam;
  public Course(String name, String id, Teacher teacher, int numberOfStudents, String typeOfExam)
  {
    this.name = name;
    this.id = id;
    this.numberOfStudents = numberOfStudents;
    this.typeOfExam = typeOfExam;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public void setID(String id)
  {
    this.id = id;
  }
  public void setNumberOfStudents(int numberOfStudents)
  {
    this.numberOfStudents = numberOfStudents;
  }
  public void setTypeOfExam(String typeOfExam)
  {
    this.typeOfExam = typeOfExam;
  }
  public String getName()
  {
    return name;
  }
  public String getId()
  {
    return id;
  }
  public int getNumberOfStudents()
  {
    return numberOfStudents;
  }
  public String getTypeOfExam()
  {
    return typeOfExam;
  }
  public String toString()
  {
    return "Name: " + name + ", ID: " + ",  Nr. of students: " + numberOfStudents + ", Type of exam: " + typeOfExam;
  }
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Course))
    {
      return false;
    }
    Course temp = (Course) obj;
    return name.equals(temp.name) && id.equals(temp.id) && numberOfStudents == temp.numberOfStudents && typeOfExam.equals(temp.typeOfExam);
  }
  public int getNumberOfTeachers()
  {
    return teachers.size();
  }
  public void addTeacher(Teacher teacher)
  {
    teachers.add(teacher);
  }
  public void removeTeacher(Teacher teacher)
  {
    teachers.remove(teacher);
  }
  public String[] getAllTeachers()
  {
    String[] temp = new String[teachers.size()];
    return teachers.toArray(temp);
  }
}
