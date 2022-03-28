package package1;

import java.util.Objects;

public class OpenQuestion extends Question{
	protected String answer;
	
	public OpenQuestion(String question, String openAnswer) {
		super(question);
		this.answer = openAnswer;
		
	}
	public String setAnswer() {
		return answer;
	}
	
	public String getOpenQuestion() {
		return question;
	}

	public String getOpenAnswer() {
		return answer;
	}

	public void setOpenAnswer(String openAnswer) {
		this.answer = openAnswer;
	}
	@Override
	public String toString() {
		return "[" + getId() + "] Open Question: " + getOpenQuestion() + " The answer: " + getOpenQuestion();
	}

}
