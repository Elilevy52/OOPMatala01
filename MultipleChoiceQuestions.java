import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
public class MultipleChoiceQuestions extends Question {
	public String MCQuestion;
	public MultipleChoiseAnswer[] MCAnswer;
	
	
	public MultipleChoiceQuestions(String question, String answer) {
		super(question, answer);
		this.question = MCQuestion;
		this.MCAnswer = new MultipleChoiseAnswer[10];
	}
	MangerClass manger = new MangerClass();
	public String getMCQuestion() {
		return MCQuestion;
	}
	public void setMCQuestion(String mCQuestion) {
		MCQuestion = mCQuestion;
	}
	@Override
	public String toString() {
		return "MultipleChoiceQuestions [MCQuestion=" + MCQuestion + ", MCAnswer=" + Arrays.toString(MCAnswer) + "]";
	}
	
}
