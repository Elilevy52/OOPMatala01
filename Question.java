package package1;

import java.util.Objects;

public abstract class Question {
	protected String question;
	private static int idGen = 1;
	private int id;
	
	public Question(String question) {
		this.question = question;
		this.id = idGen++;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		return Objects.equals(question, other.question);
	}
	
}
