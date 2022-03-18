import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
public class MultipleChoiseAnswer {
	public String[] multipleChoiseAnswer;
	public boolean trueAnswer;
	private int size;
	
	public MultipleChoiseAnswer(String multipleChoiseAnswer, boolean trueAnswer) {
		this.size = 2;
		this.multipleChoiseAnswer = new String[10];
		this.trueAnswer = trueAnswer;
	}
	
	MangerClass manger = new MangerClass();
	public String[] getMultipleChoiseAnswer() {
		return multipleChoiseAnswer;
	}

	public void setMultipleChoiseAnswer(String[] multipleChoiseAnswer) {
		this.multipleChoiseAnswer = multipleChoiseAnswer;
	}

	public boolean isTrueAnswer() {
		return trueAnswer;
	}
	
	public void setTrueAnswer(boolean trueAnswer) {
		this.trueAnswer = trueAnswer;
	}

	@Override
	public String toString() {
		String s = "Multiple Choise Answer:\n";
		for(int i = 0; i < size; i++) {
			s += multipleChoiseAnswer[i] + "\n";
		}
		return s;
	}
}
