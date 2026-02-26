package Quiz;


public class OnlineQuizApplication {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        String[] q1Options = { "int", "float", "boolean", "char" };
        Question q1 = new Question("Which data type is used to create a variable that should store text?", q1Options,
                4);
        quiz.addQuestion(q1);

        String[] q2Options = { "for", "while", "do-while", "foreach" };
        Question q2 = new Question("Which loop is guaranteed to execute at least once?", q2Options, 3);
        quiz.addQuestion(q2);

        String[] q3Options = { "int", "double", "String", "char" };
        Question q3 = new Question(
                "Which data type is used to create a variable that should store numbers with decimal points?",
                q3Options, 2);
        quiz.addQuestion(q3);

        String[] q4Options = { "interface", "class", "package", "import" };
        Question q4 = new Question("Which keyword is used to create a class?", q4Options, 2);
        quiz.addQuestion(q4);

        String[] q5Options = { "public", "private", "protected", "default" };
        Question q5 = new Question("Which access modifier makes the variable visible to all classes?", q5Options, 1);
        quiz.addQuestion(q5);

        String[] q6Options = { "null", "void", "abstract", "static" };
        Question q6 = new Question("Which keyword is used to declare a method that does not return a value?", q6Options,
                2);
        quiz.addQuestion(q6);

        String[] q7Options = { "null", "new", "delete", "malloc" };
        Question q7 = new Question("Which keyword is used to create a new object?", q7Options, 2);
        quiz.addQuestion(q7);

        String[] q8Options = { "finally", "final", "finishes", "last" };
        Question q8 = new Question("Which keyword is used to define a constant variable?", q8Options, 2);
        quiz.addQuestion(q8);

        String[] q9Options = { "break", "return", "continue", "exit" };
        Question q9 = new Question(
                "Which statement is used to stop the current iteration of a loop and move to the next iteration?",
                q9Options, 3);
        quiz.addQuestion(q9);

        String[] q10Options = { "Error", "Exception", "Throw", "Catch" };
        Question q10 = new Question("Which keyword is used to handle an exception in Java?", q10Options, 4);
        quiz.addQuestion(q10);

        quiz.startQuiz();
    }
}
