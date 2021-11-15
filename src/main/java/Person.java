public class Person implements WeatherListener {

    @Override
    public void update(String weather) {
        System.out.println("I like " + weather);
    }
}
