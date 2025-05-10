package programming;



abstract class plane
{
	 abstract void takeoff();
	 abstract void fly();
	 abstract void land();
}


class cargoplane extends plane
{
	void takeoff() {
		System.out.println("cargo plane is taking off");
	}
	void fly() {
		System.out.println("Cargo plane is flying");
	}
	void land() {
		System.out.println("cargo plane is landing");
	}
	
}

class passengerplane extends plane
{
	void takeoff() {
		System.out.println("passengerplane is taking off");
	}
	void fly() {
		System.out.println("passengerplane is flying");
	}
	void land() {
		System.out.println("pasengerplane is landing");
	}
	
}

class airport{
	
	void permit(plane ref) {
		
		ref.takeoff();
		ref.fly();
		ref.land();
		
	}
}




public class abstraction
{

	public static void main(String[] args)
	{
		
		cargoplane cp = new cargoplane();
		passengerplane pp = new passengerplane();
		
		airport a = new airport();
		
		a.permit(pp);
		a.permit(cp);
		
		
	}

}
