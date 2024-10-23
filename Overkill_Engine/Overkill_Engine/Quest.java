package Overkill_Engine;

import java.util.ArrayList;
import java.util.List;

public class Quest {
    private String title;
    private String description;
    private boolean completed;

    public Quest(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Quest: " + title + "\nDescription: " + description + "\nCompleted: " + completed;
    }

    public static List<Quest> createSampleQuests() {
        List<Quest> sampleQuests = new ArrayList<>();
        sampleQuests.add(new Quest("Find the Lost Sword", "Retrieve the legendary sword from the ancient ruins."));
        sampleQuests.add(new Quest("Rescue the Villagers", "Save the villagers from the bandit attack."));
        sampleQuests.add(new Quest("Defeat the Dragon", "Slay the dragon terrorizing the kingdom."));
        return sampleQuests;
    }
}
