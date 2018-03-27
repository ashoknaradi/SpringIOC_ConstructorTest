package Pojos;

import java.util.List;
import java.util.Map;

public class QuestionCon {
	public int id;
	public String name;
	private List<AnswerCon> answer;
	private Map<String, String> mapAnswers;

	public QuestionCon(int id, String name, List<AnswerCon> answer, Map<String, String> mapAnswers) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
		this.mapAnswers = mapAnswers;
		System.out.println("Parameterized QuestionCon Constructor Called");
	}

	@Override
	public String toString() {
		return "QuestionCon [id = " + id + ", name = " + name + ", List Answers = " + answer + ", Map Answers = " + mapAnswers + "]";
	}
}