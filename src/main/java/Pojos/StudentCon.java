package Pojos;

public class StudentCon {
	private int id;
	private String name;
	private AddressCon address;

	public StudentCon(int id, String name, AddressCon address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public StudentCon(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentCon [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
