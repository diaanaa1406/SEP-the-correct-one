import java.util.InputMismatchException;

public class MyDate
{
  private int day;
  private int month;
  private int year;
  public MyDate(int day,int year,int month)
  {
    try
    {
      this.day = day;
    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
    try
    {
      this.month=month;
    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
    try{
      this.year=year;
    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
  }
  public void setDay(int day)
  {
    try{
      this.day=day;
    }
    catch (InputMismatchException e){
      System.out.println("Incorrect input");
    }
  }
  public void setMonth(int month)
  {
    try{
      this.month=month;
    }
    catch (InputMismatchException e){
      System.out.println("Incorrect input");
    }
  }
  public void setYear(int year)
  {
    try{
      this.year=year;
    }
    catch (InputMismatchException e){
      System.out.println("Incorrect input");
    }
  }
  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }
  public boolean equals(Object obj)
  {
    if(!(obj instanceof MyDate))
      return false;
    MyDate other=(MyDate)obj;
    return day==other.day&&month==other.month&&year==other.year;
  }
  public String toString()
  {
    return day+"."+month+"."+year;
  }
}
