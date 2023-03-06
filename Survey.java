import java.util.ArrayList;

public class SchoolSurvey {
    private ArrayList<School> schools;

    public SchoolSurvey() {
        schools = new ArrayList<>();
    }

    public void addSchool(School school) {
        schools.add(school);
    }

    public double getAverage() {
        double sum = 0;
        int count = 0;
        for (School school : schools) {
            for (Mark mark : school.getMarks()) {
                sum += mark.getScore();
                count++;
            }
        }
        return sum / count;
    }
}
