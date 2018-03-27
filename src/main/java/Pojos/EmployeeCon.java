package Pojos;

public class EmployeeCon {
	private int empId;
	private String empName;
	private AddressCon address;// Aggregation

	public EmployeeCon(int empId, String empName, AddressCon address) {
		System.out.println("Parameterized EmployeeCon Constructor Called");
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	public EmployeeCon(int empId, String empName) {
		System.out.println("Parameterized EmployeeCon Constructor Called");
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "EmployeeCon [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
}