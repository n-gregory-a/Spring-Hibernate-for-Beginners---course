package gn.springDemoOne;

public class BaseballCoach implements Coach{

    @Override
    public String getDayilyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
