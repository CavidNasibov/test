package interfacesDefinition;

public abstract class car implements drivible {
	@Override
	public void drive(double speed) {
		System.out.println(this.getClass().getName()+" is driving by " + speed + "km/h");
		
	}

	@Override
	public void stop() {
		System.out.println(getClass().getName()+" has been stop");
	}

	@Override
	public void park() {
     System.out.println(getClass().getName()+ " has been park");		
	}
}
