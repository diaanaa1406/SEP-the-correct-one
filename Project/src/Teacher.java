import java.util.InputMismatchException;
import java.util.ArrayList;
public class Teacher
{
  private String name;
  private String initial;
  private ArrayList<DateInterval> availability;
  public Teacher(String name, String initial)
  {
    try{
      availability=new ArrayList<DateInterval>();
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
  public void addAvailability(DateInterval dateInterval)
  {
    availability.add(dateInterval);
  }
 public void removeAvailability(DateInterval dateInterval)
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

  public DateInterval getAvailability(int index)
  {
    return availability.get(index);
  }
  public boolean equals(Object obj)
  {
    if(!(obj instanceof Teacher))
      return false;
    Teacher other=(Teacher)obj;
    return name.equals(other.name)&&initial.equals(other.initial)&&availability.equals(other.availability);
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
