import java.util.ArrayList;

public class CourseList
{
  private ArrayList<Course> courses;
  public CourseList()
  {
    courses = new ArrayList<Course>();
  }
  public void addCourse(Course course)
  {
    courses.add(course);
  }
  public void removeCourse(Course course)
  {
    courses.remove(course);
  }
  public Course getCourse(int index)
  {
    return courses.get(index);
  }
  public String[] getAllCourse()
  {
    String[] temp = new String[courses.size()];
    return courses.toArray(temp);
  }
}
