package UseBean;
import java.io.Serializable;
public class Student implements Serializable
{
	private String S_name;
	private int Roll;
	public Student()
	{
		
	}
	public void setSname(String name)
	{
		S_name=name;
	}
	public String getSname()
	{
		return S_name;
	}
	public void setRoll(int r)
	{
		Roll=r;
	}
	public int getRoll()
	{
		return Roll;
	}
}
