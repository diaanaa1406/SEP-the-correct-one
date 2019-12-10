import java.util.ArrayList;
public class ClassroomList
{
  private ArrayList<Classroom> classrooms;


  public ClassroomList()
 {
   classrooms=new ArrayList<Classroom>();
 }
  public void addClassroom(Classroom classroom)
  {
    classrooms.add(classroom);
  }
  public void removeClassroom(Classroom classroom)
  {
    classrooms.remove(classroom);
  }
  public Classroom getClassroom(int index)
  {
    return classrooms.get(index);
  }
  public String[] getAllClassrooms()
  {
    String[] classes=new String[classrooms.size()];
    return classrooms.toArray(classes);
  }
}
