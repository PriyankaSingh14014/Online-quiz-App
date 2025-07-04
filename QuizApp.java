import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();

        // Add questions
        questions.add(new Question("What is Java?", new String[]{
                "A type of coffee", "A programming language", "A database", "A browser"
        }, 2));

        questions.add(new Question("Which loop is used when number of iterations is known?", new String[]{
                "while", "do-while", "for", "if"
        }, 3));

        questions.add(new Question("Which collection class allows duplicates?", new String[]{
                "HashSet", "TreeSet", "ArrayList", "Map"
        }, 3));

        questions.add(new Question("What is the correct syntax of the main method?", new String[]{
                "public static void main()", "public void main(String[] args)", 
                "public static void main(String[] args)", "void main()"
        }, 3));

        questions.add(new Question("Which keyword is used to create an object?", new String[]{
                "class", "new", "this", "create"
        }, 2));

        int score = 0;
        int questionNumber = 1;

        System.out.println("===== Welcome to the Java Quiz App =====");
        for (Question q : questions) {
            System.out.println("\nQ" + questionNumber + ":");
            q.displayQuestion();
            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();
            if (q.isCorrect(answer)) {
                System.out.println("✔ Correct!");
                score++;
            } else {
                System.out.println("✘ Wrong!");
            }
            questionNumber++;
        }

        System.out.println("\n===== Quiz Completed =====");
        System.out.println("Your Score: " + score + "/" + questions.size());

        if (score == questions.size()) {
            System.out.println("Excellent! 🎉");
        } else if (score >= 3) {
            System.out.println("Good job! 👍");
        } else {
            System.out.println("Keep practicing! 💡");
        }

        scanner.close();
    }
}