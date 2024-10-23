package Overkill_Engine;

import java.util.Random;

public class RandomEvent {
    private String description;
    private boolean isPositive;

    public RandomEvent(String description, boolean isPositive) {
        this.description = description;
        this.isPositive = isPositive;
    }

    public String getDescription() {
        return description;
    }

    public boolean isPositive() {
        return isPositive;
    }

    public static RandomEvent generateRandomEvent() {
        String[] eventDescriptions = {
            "You found a hidden treasure chest!",
            "A wild animal attacks you!",
            "You meet a wandering merchant.",
            "You discover a secret passage.",
            "A sudden storm forces you to seek shelter."
        };
        boolean[] eventOutcomes = {true, false, true, true, false};

        Random random = new Random();
        int index = random.nextInt(eventDescriptions.length);

        return new RandomEvent(eventDescriptions[index], eventOutcomes[index]);
    }

    @Override
    public String toString() {
        return "Random Event: " + description + "\nPositive: " + isPositive;
    }
}
