package package1;

public class MultilpeChoiceQuestion extends Question{
	
	
	public static final int MAX_ANS_ARRAY_SIZE = 10;
	private MultipeChoiseAnswer[] choiseAnswer;
	private int answerNumber;
	
	public MultilpeChoiceQuestion(String question) {
		super(question);
		choiseAnswer = new MultipeChoiseAnswer[MAX_ANS_ARRAY_SIZE];
		answerNumber =  0;
	}
	public String addAnswer(MultipeChoiseAnswer answer) {
		if(answerNumber == MAX_ANS_ARRAY_SIZE) {
			return "Can't add more then 10 Answers." + "\nPlease delete an answers first and then try again.";
		}
		for(int i = 0; i <= answerNumber; i++) {
			if(choiseAnswer[i] != null) {
				if(choiseAnswer[i].getChoiseAnswer().equals(answer.getChoiseAnswer())) {
					return "Answer already exist.";
				}
			}
		}
		for(int i = 0; i < choiseAnswer.length; i++) {
			if(choiseAnswer[i] == null) {
				choiseAnswer[i] = answer;
				break;
			}
		}
		answerNumber++;
		return "Answer added successfully";
	}
	public void deleteAnswer(int index) {
		choiseAnswer[index - 1] = null;
		answerNumber--;
	}
	public void updateAnswer(int index, String Answer) {
		choiseAnswer[index - 1].setChoiseAnswer(Answer);
	}
	public MultipeChoiseAnswer getChoiseAnswer(int index) {
		return choiseAnswer[index];
	}
	public int getAnswerNumber() {
		return answerNumber;
	}
	public String getQuestion() {
		return question;
	}
	public static int getMaxAnsArraySize() {
		return MAX_ANS_ARRAY_SIZE;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[" + getAnswerNumber() + "] Multipe Choise Question: \n" + getQuestion() + "\n");
		for(int i = 0; i < choiseAnswer.length; i++) {
			if(choiseAnswer[i] != null) {
				sb.append("Answer number: [" + (i + 1) + "] " + choiseAnswer[i].toString());
				sb.append("[Correct or not]: " + choiseAnswer[i].isTrue() + "\n");
			}
		}
		return sb.toString();
	}
}
