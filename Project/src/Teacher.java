import java.util.InputMismatchException;
public class Teacher
{
  private String name;
  private String initial;
  private DateInterval availability;
  public Teacher(String name, String initial, DateInterval availability)
  {
    try{
      this.availability=availability;
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
  public void setIntial(String initial)
  {
    this.initial=initial;
  }
  public void setAvailability(DateInterval availability)
  {
    this.availability=availability;
  }

  public String getIntial()
  {
    return initial;
  }

  public String getName()
  {
    return name;
  }

  public DateInterval getAvailability()
  {
    return availability;
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
    return name+" "+initial+" "+availability;
  }
}
