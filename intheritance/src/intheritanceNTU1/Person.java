package intheritanceNTU1;

public class Person {

	private String name = "Jack";
	private String address = "46 Century st.MA";

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;

	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Person[name: " + name + " ,adress: " + address + "]";
	}
}
