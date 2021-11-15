import java.util.ArrayList;
import java.util.List;

public class Weather {

    private String currentWeather;
    private List<Person> people = new ArrayList<>();

    public void subscribe(Person person) {
        this.people.add(person);
    }

    public void unsubscribe(Person person) {
        this.people.remove(person);
    }

    public void setWeather(String weather) {
        this.currentWeather = weather;

        for (Person person : this.people) {
            person.update(this.currentWeather);
        }
    }

}
