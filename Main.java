import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		MangerClass manger = new MangerClass();
		int op;
		String menu = ("Exam Creator Program. \n" + 
		"Please select one of the following options:\n" + 
				"1) Show all questions and answers. \n" + 
				"2) Add new question/answer. \n" + 
				"3) Edit an existing question. \n" +
				"4) Edit an existing answer. \n" + 
				"5) Delete an existing answer. \n");
		
		System.out.println(menu);
		op = scan.nextInt();
		while (op != 8) {
			
			switch (op) {
			case 1:
				int caseOneOp = 0;
				System.out.println("___all questions and answers___");
				System.out.println("Show all Open Qusetion and their answers. Type -> '1'." + 
						"\nShow all Multiple Choice Questions and their answers. Type -> '2'." + 
						"\nShow all Questions. Type -> '3'." +
						"\nShow all Answers. Type -> '4'." + 
						"\nGo back to Main Menu. Type -> '-1'.\n");
				caseOneOp = scan.nextInt();
				while(caseOneOp >= 1 && caseOneOp <= 4) {
					if(caseOneOp == 1) { 
						System.out.println("Printing all Open Questions and thier answers.");
						manger.getAllOpenQuestions();
					}
					if(caseOneOp == 2) {
						System.out.println("Printing all Multiple Choice Questions and their answers.");
					manger.getAllMultipleChoiceQuestions();
					}
					if(caseOneOp == 3) {
						System.out.println("Printing all Questions.");
					manger.getAllQuestion();
					}
					if(caseOneOp == 4) {
						System.out.println("Printing all Answers.");
					manger.getAllAnswers();
					}
					break;
				}
				if(caseOneOp == -1) {
					System.out.println(menu);
				}
				break;
			case 2:
				int caseTwoOp = 0;
				System.out.println("___Add new question/answer___");
				System.out.println("To add an new Open Question. Type -> '1'." + "\nTo add an new Multiple Choice Questions Type -> '2'." + "\nGo back to Main Menu Type -> '-1'.\n");
				caseTwoOp = scan.nextInt();
				while(caseTwoOp == 1 || caseTwoOp == 2) {
					if(caseTwoOp == 1) {
						System.out.println("Please enter Question: ");
						String openQuestion = scan.next();
						System.out.println("Please enter the correct answer: ");
						String openAnswer = scan.next();
						manger.addOpenQuestion(openQuestion, openAnswer);
						break;
					}
					if(caseTwoOp == 2) {
						char resume = 0; 
						System.out.println("Please enter Multiple Choice Questions: ");
						String MultipleChoiceQuestions = scan.nextLine();
						for(int i = 0; i < 10 && (resume == 'y' || resume == 'Y'); i++) {
							System.out.println("Please enter an answer: ");
							String multipleChoiceAnswer = scan.nextLine();
							System.out.println("Is this the correct answer? (true/false): ");
							boolean trueAnswer = scan.nextBoolean();
							manger.addMultipleChoiseQuestion(MultipleChoiceQuestions, multipleChoiceAnswer, trueAnswer);
							System.out.println("\nDo you want to add another answer? (y/n) ");
							resume = scan.next().charAt(0);
							if(resume != 'y' && resume != 'Y') {
								break;
							}
							break;
						}
					}
				}
				if(caseTwoOp == -1) {
					System.out.println(menu);
				}
				break;
			case 3:
				int caseThreeOp = 0;
				int questionNumber = 0;
				System.out.println("___Edit an existing question___");
				System.out.println("To edit an Open Question Please type -> '1'." + "\nTo edit an Multiple Choice Questions Please type -> '2'." + "\nGo back to Main Menu Type -> '-1'.\n");
				caseThreeOp = scan.nextInt();
				while(caseThreeOp == 1 || caseThreeOp == 2) {
					if(caseThreeOp == 1) 
						System.out.println("Please Chose one of the Following Question (Type its number): ");
							questionNumber = scan.nextInt();
								//need to add method body.
					if(caseThreeOp == 2)
						System.out.println("Please Chose one of the Following Question (Type its number): ");
							questionNumber = scan.nextInt();
								//need to add method body.
					break;
				}
				if(caseThreeOp == -1) {
					System.out.println(menu);
				}
				break;
			case 4:
				int caseFourOp = 0;
				int answerNumber = 0;
				System.out.println("___Edit an existing answer___");
				System.out.println("To edit an Open Question - Answer Please type -> '1'." + 
						"\nTo edit an Multiple Choice Questions - Answer Please type -> '2'." + 
						"\nGo back to Main Menu Type -> '-1'.\n");
				caseFourOp = scan.nextInt();
				while(caseFourOp == 1 || caseFourOp == 2) {
					if(caseFourOp == 1)
						System.out.println("Please Chose one of the Following Answer (Type its number): ");
							answerNumber = scan.nextInt();
								//need to add method body.
					if(caseFourOp == 2)
						System.out.println("Please Chose one of the Following Answer (Type its number): ");
							answerNumber = scan.nextInt();
								//need to add method body.
							break;
				}
				if(caseFourOp == -1) {
					System.out.println(menu);
				}
				break;
			case 5:
				int caseFiveOp = 0;
				int deleteAnswerNumber = 0;
				System.out.println("___Delete an existing answer__");
				System.out.println("To delete an Open Question - Answer Please type -> '1'." + 
						"\nTo delete an Multiple Choice Questions - Answer Please type -> '2'." + 
						"\nGo back to Main Menu Type -> '-1'.\n");
				caseFiveOp = scan.nextInt();
				while(caseFiveOp == 1 || caseFiveOp == 2) {
					if(caseFiveOp == 1 )
					System.out.println("Please Chose one of the Following Answer (Type its number): ");
						deleteAnswerNumber = scan.nextInt();
					if(caseFiveOp == 2)
					System.out.println("Please Chose one of the Following Answer (Type its number): ");
							deleteAnswerNumber = scan.nextInt();
						break;
				}
				if(caseFiveOp == -1) {
					System.out.println(menu);
				}
				break;
			default:
				System.out.println("EXIT");
			}
			System.out.println("\nDo you want to go back to the menu? (y/n)");
			char resume = scan.next().charAt(0);
			if (resume == 'y' || resume == 'Y') {
				System.out.println(menu);
				op = scan.nextInt();
			} else {
				System.out.println("Exiting program...");
				System.exit(0);
			}
		}
		while (op != 8)
			;
		System.out.println("Exiting program, thank you!");
		scan.close();
	}
}
