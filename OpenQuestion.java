import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
public class OpenQuestion extends Question{
	public String openAnswer;
	public String openQuestion;
	
	MangerClass manger = new MangerClass();
	public OpenQuestion(String question, String answer) {
		super(question, answer);
		this.answer = openAnswer;
		this.question = openQuestion;
	
		
	}
	public String getOpenAnswer() {
		return openAnswer;
	}


	public void setOpenAnswer(String openAnswer) {
		this.openAnswer = openAnswer;
	}


	public String getOpenQuestion() {
		return openQuestion;
	}


	public void setOpenQuestion(String openQuestion) {
		this.openQuestion = openQuestion;
	}


	@Override
	public String toString() {
		return "OpenQuestion [openAnswer=" + openAnswer + ", openQuestion=" + openQuestion 
				+", getOpenAnswer()=" + getOpenAnswer() + ", getOpenQuestion()=" + getOpenQuestion()
				+ ", getOpenQuestionId()=" + "]";
	}
}
