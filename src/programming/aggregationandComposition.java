package programming;

class Charger{
	
	private String Brand;
	private float voltage;
	
	
	public Charger(String brand, float voltage) {
		super();
		Brand = brand;
		this.voltage = voltage;
	}


	public String getBrand() {
		return Brand;
	}


	public float getVoltage() {
		return voltage;
	}
	
}

class OS{
	private String name;
	private int size;
	
	
	public OS(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
	
}
class mobile
{
	
	OS os= new OS("android",512);
	
	void hasA(Charger c) 
	{
		
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
	
}


public class aggregationandComposition {

	public static void main(String[] args) {
		
		
		Charger c = new Charger("samsung",4.6f);
		mobile m  = new mobile();
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		m.hasA(c);
		

	}

}








































