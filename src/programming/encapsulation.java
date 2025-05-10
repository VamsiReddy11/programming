package programming;

class Customer{
	private int id;
	private String name;
	private long number;
	
	public void setData(int id,String name,long number)
	{
		this.id=id;
		this.name=name;
		this.number=number;
		
	}
	
	public int getid()
	{
		return id;
		
	}
	public String getName()
	{
		return name;
		
	}
	public long getnumber()
	{
		return number;
		
	}
	
	
}



public class encapsulation {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		c.setData(1, "vamsi", 9014747542L);
		
	
	}

}
