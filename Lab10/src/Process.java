
/**
 * written by Kevin Zheng
 *
 */
public class Process {
	private int priority;
	private double time;
	private String name;
	public Process()
	{
		time=0.0;
		name="";
		priority=0;
	}
	public Process(String aName,int aP, double aTime )
	{
		this.priority=aP;
		this.time=aTime;
		this.name=aName;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		if(priority>0)
		this.priority = priority;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		if(time>=0.0)
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString ()
	{
		return this.name +" "+this.priority+" "+this.time;
	}
	
	
	  public int compareTo(Process pro)
	    {
	        if (this.priority>pro.priority)
	            return 1;
	        else if(this.priority<pro.priority)
	            return -1;
	        else
	            return 0;
	    }
	
	
	
	
	
	
	
	
}
