package quiz;

import java.util.Objects;
import java.util.Scanner;

/**
 * To create a quiz and give the final score
 * <p>
 * Quiz should be minimum of 5 questions
 * For each right answer = 1 point
 * For each negative answer = 0 points
 * Finally, you have to display the correct answers for each question and the total score.
 * Display the Result. PASS OR FAIL?
 * <p>
 * <p>
 * Quiz example:
 * Display question to user like this
 * a. What is the capital city of Estonia?
 * 1. Tallinn
 * 2. Tartu
 * 3. Parnu
 * 4. Viljandi
 * Enter your answer: 2
 * Invalid answer, please enter the given option only.
 * <p>
 * <p>
 * b. Wat...?
 * <p>
 * <p>
 * <p>
 * Total score: 4
 * The correct answers:
 * a. Tallinn
 * b.
 *
 *
 *
 *
 * HW:
 * 1. Display the correct answers for each question
 * 2. Calculate total score.
 */
public class Quiz {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE QUIZ");
        System.out.println("-------------------");

        int totalScore = 0;
        int rightAnswer = 1;
        int wrongAnswer = 0;
        boolean hasPassed;

        Question[] questions = getRandomQuestions();
        Answer[] userAnswers = new Answer[questions.length];

        // Display questions and options
        for (int j = 0; j < questions.length; j++) {
            Question question = questions[j];
            System.out.println(question.getDescription());

            for (int i = 0; i < question.getOptions().length; i++) {
                System.out.println(i + ". " + question.getOptions()[i]);
            }

            System.out.println("Choose an option from above:");

            //Creating a user answer object and assign it to the userAnswer array
            Answer answer = new Answer();
            answer.setQuestionId(question.getId());
            answer.setCorrectOptionIndex(getAnswerOption(question.getOptions().length - 1));
            userAnswers[j] = answer;

            System.out.println();
        }

        Answer[] correctAnswers = getAnswers();

        // Total Score Calculation: Compare answerOptions of CorrectAnswer and the userAnswer
        for (Answer userAnswer : userAnswers) {
            for (Answer correctAnswer : correctAnswers) {
                if (Objects.equals(correctAnswer.getQuestionId(), userAnswer.getQuestionId())) {
                    totalScore += correctAnswer.getCorrectOptionIndex() == userAnswer.getCorrectOptionIndex() ? rightAnswer : wrongAnswer;
                    break;
                }
            }
        }

        System.out.println("Total score: " + totalScore);

        //Pass score is 50%
        hasPassed = totalScore >= (double) questions.length / 2;

        System.out.println(hasPassed ? "PASSED!" : "FAILED!!");

        printCorrectAnswers(questions, correctAnswers);
    }


    private static Question[] getRandomQuestions() {
        Question question1 = new Question();
        question1.setId(10000L);
        question1.setDescription("What is the capital of Estonia?");
        question1.setOptions(new String[]{"Tallinn", "Tartu", "Parnu"});

        Question question2 = new Question();
        question2.setId(100001L);
        question2.setDescription("How many wonders in the world?");
        question2.setOptions(new String[]{"3", "8", "7"});

        Question question3 = new Question();
        question3.setId(100002L);
        question3.setDescription("What is the favourite car of Estonia?");
        question3.setOptions(new String[]{"Skoda", "Toyota", "Lexus"});

        return new Question[]{question2, question1, question3};
    }

    private static Answer[] getAnswers() {
        Answer answer1 = new Answer();
        answer1.setId(20000L);
        answer1.setQuestionId(10000L);
        answer1.setCorrectOptionIndex(0);

        Answer answer2 = new Answer();
        answer2.setId(20001L);
        answer2.setQuestionId(100001L);
        answer2.setCorrectOptionIndex(2);

        Answer answer3 = new Answer();
        answer3.setId(20002L);
        answer3.setQuestionId(100002L);
        answer3.setCorrectOptionIndex(1);

        return new Answer[]{answer1, answer2, answer3};
    }

    private static int getAnswerOption(int limit) {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect option! Please enter again:";
        int option = limit + 1;

        do {
            if (!scanner.hasNextInt()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                option = scanner.nextInt(); // correct input

                if (option > limit) {
                    System.out.println(errorMessage);
                }
            }
        } while (option > limit);

        return option;
    }

    private static void printCorrectAnswers(Question[] questions, Answer[] correctAnswers){
        System.out.println("CORRECT ANSWERS:");
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1)  + ". "+ questions[i].getDescription());

            for(Answer answer: correctAnswers) {
                if(Objects.equals(questions[i].getId(), answer.getQuestionId())) {
                    System.out.println("Answer: " + questions[i].getOptions()[answer.getCorrectOptionIndex()]);
                    break;
                }
            }
            System.out.println();
        }
    }
}
