public class Question {
    String question;
    public String getQuestion() {
        return question;
    }
    String answer;
    public String getAnswer() {
        return answer;
    }
    Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    boolean checkAnswer(String reply) {
        if (reply.equals(answer)) return true;
        return false;
    }
}
