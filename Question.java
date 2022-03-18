import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
public abstract class Question {
	protected String question;                                     
	protected String answer;
	private static int idGenrator = 0;
	protected int id;
	
	
	public Question(String question, String answer) {
		this.question = question;
		this.answer = answer;
		this.id = idGenrator++;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public int getId() {
		return id;
	}
}
