import java.util.InputMismatchException;
public class ExternalPort
{
  private String type;
  private int number;
  public ExternalPort(String type, int number)
  {
    try
    {
      this.type=type;

    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
    try
    {
      this.number=number;
    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }

  }
  public void setType(String type)
  {
    try
    {
      this.type=type;

    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }  }
  public void setNumber(int number)
  {
    try
    {
      this.number=number;
    }catch (InputMismatchException e)
    {
      System.out.println("Incorrect input");
    }
  }
  public String getType()
  {
    return type;
  }
  public int getNumber()
  {
    return number;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof ExternalPort))
      return false;
    ExternalPort other=(ExternalPort)obj;
    return type.equals(other.type) && number==other.number;
  }
}
