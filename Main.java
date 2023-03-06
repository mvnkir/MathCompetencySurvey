public class Main {
    public static void main(String[] args) {
        School school1 = new School("School A", "Lorong Sentosa", "City A");
        School school2 = new School("School B", "Lorong Damak", "City B");
        School school3 = new School("School C", "Lorong Andalas", "City C");

        school1.addMark(new Mark(75));
        school1.addMark(new Mark(85));
        school1.addMark(new Mark(90));

        school2.addMark(new Mark(80));
        school2.addMark(new Mark(80));
        school2.addMark(new Mark(70));

        school3.addMark(new Mark(90));
        school3.addMark(new Mark(95));
        school3.addMark(new Mark(100));

        SchoolSurvey survey = new SchoolSurvey();
        survey.addSchool(school1);
        survey.addSchool(school2);
        survey.addSchool(school3);

        System.out.println("Average score for all schools: " + survey.getAverage());
    }
}
