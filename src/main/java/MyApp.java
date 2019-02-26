public class MyApp {

    public static void main(String[] args) {

        Coach coach = new BaseballCoach();
        Coach coach1 = new Football();
        Coach coach2 = new TrackCoach();

        coach.getDailyWorkout();
        coach1.getDailyWorkout();

    }
}
