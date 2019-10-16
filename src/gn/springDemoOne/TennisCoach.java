package gn.springDemoOne;

public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach() {
    }

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDayilyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
