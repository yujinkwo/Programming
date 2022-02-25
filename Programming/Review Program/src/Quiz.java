import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
    static String[] quests = {"What is the capital of  Canada?","What is the capital of United States?", "What is the capital of England?", "What is the capital of Germany?"};
    static String[] answers = {"Ottawa", "Washington D.C.", "London", "Berlin"};
    static int count = 4;
    ArrayList questions = new ArrayList();
    Quiz() {
        Random r = new Random();
        for (int i=0; i<count; i++) {
            int rand = r.nextInt(quests.length);
            String q = quests[rand];
            String a = answers[rand];
            questions.add(new Question(q, a));
        }
    }
    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("start questions");
        int correct = 0;
        int i;
        for (i = 0; i < questions.size(); i++) {
            Question q = (Question) questions.get(i);
            System.out.printf("question%d. %s\n", i+1, q.question);
            System.out.println("answer: ");
            String a = sc.next();
            sc.nextLine();
            if (a.equals(q.answer)) {
                System.out.println("That's right.");
                correct++;
            }
            else {
                System.out.println("Wrong answer.");
            }
        }
        System.out.printf("Number of questions:%d, correct answers:%d\n", i, correct);
    }
}
