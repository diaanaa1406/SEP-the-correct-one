public class Course
{
  private String name;
  private String id;
  private Teacher teacher;
  private int numberOfStudents;
  private String typeOfExam;
  public Course(String name, String id, Teacher teacher, int numberOfStudents, String typeOfExam)
  {
    this.name = name;
    this.id = id;
    this.teacher = teacher;
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
  public void setTeacher(Teacher teacher)
  {
    this.teacher = teacher;
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
  public Teacher getTeacher()
  {
    return teacher;
  }
  public int getNumberOfStudents()
  {
    return numberOfStudents;
  }
  public String getTypeOfExam()
  {
    return typeOfExam;
  }
}
