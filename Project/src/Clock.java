import java.util.InputMismatchException;

public class Clock
{
  private int hour;
  private int minute;
  public Clock(int hour, int minute)
  {
    try
    {
      this.hour = hour;
    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
    try
    {
      this.minute=minute;
    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
  }
  public void setHour(int hour)
  {
    try
    {
      this.hour = hour;
    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }

  }

  public void setMinute(int minute)
  {
    try
    {
      this.minute=minute;
    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Clock))
      return false;
    Clock other=(Clock)obj;
    return hour==other.hour && minute==other.minute;
  }
}
