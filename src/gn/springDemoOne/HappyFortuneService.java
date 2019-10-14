package gn.springDemoOne;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {

        String [] fortunes = {
                "Today is your lucky day!",
                "Today you'll get a hit on your face by ball!",
                "Today you'll brake your lag!"
        };

        return fortunes[(int)(Math.random() * 3)];
    }
}
