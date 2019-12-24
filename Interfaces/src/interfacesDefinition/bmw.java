package interfacesDefinition;

public  class bmw extends car implements chargerable {

	

	@Override
	public void ch() {
		System.out.println(getClass().getName() + " is chargeble");
		
	}

}
