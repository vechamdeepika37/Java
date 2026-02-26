package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

class Quiz {
    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer == question.getCorrectAnswer()) {
                score++;
            }
        }
        displayResult();
        System.out.print("Do you want to restart the quiz? (yes/no): ");
        String restart = scanner.next();
        if (restart.equalsIgnoreCase("yes")) {
            score = 0;
            startQuiz();
        } else {
            System.out.println("Thank you for participating in the quiz!");
        }
        scanner.close();
    }

    private void displayResult() {
        System.out.println("Your score: " + score + "/" + questions.size());
        if (score >= 9) {
            System.out.println("Excellent");
        } else if (score >= 6) {
            System.out.println("Good");
        } else if (score >= 3) {
            System.out.println("Average");
        } else {
            System.out.println("Poor");
        }
    }
}
