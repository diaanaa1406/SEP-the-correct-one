import java.util.InputMismatchException;
import java.util.ArrayList;
public class Teacher
    /**
     *
     * @author
     * @version
     */
{
  private String name;
  private String initial;
  private ArrayList<MyDate> availability;

  /**
   *
   * @param name the name of the teacher
   * @param initial
   */
  public Teacher(String name, String initial)
  {
    try{
      availability=new ArrayList<MyDate>();
      this.initial=initial;
      this.name=name;
    }
    catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public void setInitial(String initial)
  {
    this.initial=initial;
  }
  public void addAvailability(MyDate dateInterval)
  {
    availability.add(dateInterval);
  }
 public void removeAvailability(MyDate dateInterval)
 {
   availability.remove(dateInterval);
 }
  public String getInitial()
  {
    return initial;
  }

  public String getName()
  {
    return name;
  }

  public MyDate getAvailability(int index)
  {
    return availability.get(index);
  }
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Teacher))
      return false;
    Teacher other=(Teacher)obj;
    for(int i=0;i<availability.size();i++)
      if(!(availability.get(i).equals(other.availability.get(i))))
        return false;
    return name.equals(other.name)&&initial.equals(other.initial);
  }
  public String toString()
  {
    String s="";
    for(int i=0;i<availability.size();i++)
      s=s+availability.get(i)+" ";
     s=name+" "+initial+" ";
     return s;
  }
}
