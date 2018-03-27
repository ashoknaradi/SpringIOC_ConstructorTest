package Pojos;

public class AnswerCon {
	private int id;
	private String name;
	private String by;

	public AnswerCon(int id, String name, String by) {
		super();
		this.id = id;
		this.name = name;
		this.by = by;
		System.out.println("Parameterized AnswerCon Constructor Called");
	}

	@Override
	public String toString() {
		return "AnswerCon [id=" + id + ", name=" + name + ", by=" + by + "]";
	}

}
