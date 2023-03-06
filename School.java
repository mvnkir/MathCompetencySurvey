import java.util.ArrayList;

public class School {
    private String name;
    private String address;
    private String city;
    private ArrayList<Mark> marks;

    public School(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.marks = new ArrayList<>();
    }

    public void addMark(Mark mark) {
        marks.add(mark);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public ArrayList<Mark> getMarks() {
        return marks;
    }

    public double getAverage() {
        double sum = 0;
        for (Mark mark : marks) {
            sum += mark.getScore();
        }
        return sum / marks.size();
    }
}
