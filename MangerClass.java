import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MangerClass {
	private Question[] allQustions;
	private MultipleChoiseAnswer[] allMultipleChoiseAnswer;
	private MultipleChoiceQuestions[] allMultipleChoiceQuestions;
	private OpenQuestion[] allOpenQuestions;
	private int size;

	public MangerClass() {
		this.size = 5;
		this.allQustions = new Question[size]; 
		this.allMultipleChoiseAnswer = new MultipleChoiseAnswer[size];
		this.allOpenQuestions = new OpenQuestion[size];
		this.allMultipleChoiceQuestions = new MultipleChoiceQuestions[size];
	}
	public void getAllMultipleChoiceQuestions() {
		if(allMultipleChoiceQuestions[0] == null) {
			System.out.println("No Multiple Choice Questions to show\nPlease add Question fist.");
		}
		else {
			for(int i = 0; i < size; i++) {
				System.out.println(allMultipleChoiceQuestions[i].getMCQuestion() + allMultipleChoiseAnswer[i].isTrueAnswer());
			}
		}
	}
	public void getAllOpenQuestions() {
	if(allOpenQuestions[0] == null) {
		System.out.println("No Open Questions to show\nPlease add Qustion first.");
		}
	else {
		for(int i = 0; i < size; i++) {
			System.out.println(allOpenQuestions[i].getOpenQuestion());
		}
	}
	}
	public void getAllMultipleChoiseAnswer() {
		if(allMultipleChoiseAnswer[0] == null) {
			System.out.println("No Multiple Choise Answers to show\nPlease add Answers first.");
		}
		else {
			for(int i = 0; i < size; i++) {
				System.out.println(allMultipleChoiseAnswer[i].getMultipleChoiseAnswer());
			}
		}
	}
	public void getAllAnswers() {
		if (allQustions[0].getAnswer() == null) {
			System.out.println("No Answers to show.\nPlease add Answers first.");
		} else {
			for(int i = 0; i < size; i++) {
				System.out.println(allQustions[i].getAnswer() + allQustions[i].getId());
			}
		}
	}

	public void getAllQuestion() {
		if (allQustions[0] == null) {
			System.out.println("No Questions to show.\nPlease add questions first.");
		} else {
			for (int i = 0; i < size; i++) {
				System.out.println(allQustions[i].getQuestion() + allQustions[i].getId());
			}
		}
	}

	public Question getQuestionById(int id) {
		for (int i = 0; i < size; i++) {
			if (allQustions[i].getId() == id) {
				return allQustions[i];
			}
		}
		return null;
	}

	public void removeQuestionById(int id) {
		for (int i = 0; i < size; i++) {
			if (allQustions[i].getId() == id) {
				allQustions[i] = allQustions[--size];
			}
		}
		System.out.println("Question Removed.");
	}

	public void addOpenQuestion(String question, String answer) {
		OpenQuestion openQuestion = new OpenQuestion(question, answer);
		if (size == allQustions.length ||size ==  allOpenQuestions.length) {
			extendsAllQustionsArray();
			extendsOpenQuestionArray();
			System.out.println("Array extened Successfully");
		}
		allQustions[size++] = openQuestion;
		allOpenQuestions[size++] = openQuestion;
		System.out.println("Open Question added Successfully");

	}
	
	public void addMultipleChoiseQuestion(String question, String answer, boolean isTrueAnswer) {
		MultipleChoiceQuestions MCQuestion = new MultipleChoiceQuestions(question, answer);
		MultipleChoiseAnswer MCAnswer = new MultipleChoiseAnswer(answer, isTrueAnswer);
		if (size == allQustions.length) {
			extendsAllQustionsArray();
			extendsAllMultipleChoiceQuestionsArray();
			System.out.println("Array extened Successfully");
		}
		allQustions[size++] = MCQuestion;
		allMultipleChoiceQuestions[size++] = MCQuestion;
		if (allMultipleChoiseAnswer.length == 10) {
			System.out.println("Cant add more then 10 answers.");
		} else {
			extendsAnswerArray();
			allMultipleChoiseAnswer[size++] = MCAnswer;
		}
		
	}

	private void extendsAnswerArray() {
		MultipleChoiseAnswer[] newAnswerArray = new MultipleChoiseAnswer[allMultipleChoiseAnswer.length * 2];
		for (int i = 0; i < allMultipleChoiseAnswer.length; i++) {
			newAnswerArray[i] = allMultipleChoiseAnswer[i];
		}
		allMultipleChoiseAnswer = newAnswerArray;
		System.out.println("Multiple Choise Answer Array extend Successfully");
	}

	private void extendsAllQustionsArray() {
		Question[] newArray = new Question[allQustions.length * 2];
		for (int i = 0; i < allQustions.length; i++) {
			newArray[i] = allQustions[i];
		}
		allQustions = newArray;
		
	}
	public void extendsAllMultipleChoiceQuestionsArray() {
		MultipleChoiceQuestions[] MultipleChoiceQuestionsArray = new MultipleChoiceQuestions[allMultipleChoiceQuestions.length * 2];
		for(int i = 0; i < allMultipleChoiceQuestions.length; i++) {
			MultipleChoiceQuestionsArray[i] = allMultipleChoiceQuestions[i]; 
		}
		allMultipleChoiceQuestions = MultipleChoiceQuestionsArray;
		
	}
	public void extendsOpenQuestionArray() {
		OpenQuestion[] OpenQuestionsArray = new OpenQuestion[allOpenQuestions.length * 2];
		for(int i = 0; i < allOpenQuestions.length; i++) {
			OpenQuestionsArray[i] = allOpenQuestions[i];
		}
		allOpenQuestions = OpenQuestionsArray;
		
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < size; i++) {
			sb.append(allQustions[i].toString() + " ");
		}
		return sb.toString();
	}
}
