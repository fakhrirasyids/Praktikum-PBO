package praktikum7;

public class GradedActivity {
    private double score;
    private String name;

    public GradedActivity() {

    }

    public GradedActivity(String n) {
        this.name = n;
    }

    void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public char getGrade() {
        if (this.score > 85) {
            return 'A';
        } else if (this.score > 75) {
            return 'B';
        } else if (this.score > 65) {
            return 'C';
        } else {
            return 'D';
        }
    }
}

class FinalExam extends GradedActivity {
    private int numberOfQuestions;
    private int numberMissed;
    private double pointsPerQuestions;

    FinalExam(int questions, int missed) {
        super();
        this.numberOfQuestions = questions;
        this.numberMissed = missed;
    }

    double getPointsPerQuestions() {
        return pointsPerQuestions;
    }

    public int getNumberMissed() {
        return numberMissed;
    }
}

class PassFailActivity extends GradedActivity {
    private double minimumPassingScore;

    PassFailActivity(double min) {
        super();
        this.minimumPassingScore = min;
    }

    public double getMinimumPassingScore() {
        return minimumPassingScore;
    }
}

class PassFailExam extends PassFailActivity {
    private int numberOfQuestions;
    private int numberMissed;
    private double pointsPerQuestions;
    PassFailExam(int questions, int missed, double minPassing) {
        super(minPassing);
        this.numberOfQuestions = questions;
        this.numberMissed = missed;
    }

    public double getPointsEach() {
        return pointsPerQuestions;
    }

    public int getNumMissed() {
        return numberMissed;
    }
}