package ID_206946790_ELI_LEVY;

public abstract class Question {
	protected String question;
	private static int idGen = 1;
	private int id;
	
	public Question(String question) {
		this.question = question;
		id = idGen++;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getId() {
		return id;
	}
	public String printQuestionNumber() {
		return "[" + id + "]" + toString(); 
	}

	@Override
	public String toString() {
		return "Question [" + question + "]" + "\n";
	}
}
