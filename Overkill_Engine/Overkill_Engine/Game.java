package Overkill_Engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private Character player;
    private List<Quest> quests;
    private List<RandomEvent> randomEvents;

    public Game() {
        this.player = new Character();
        this.quests = new ArrayList<>();
        this.randomEvents = new ArrayList<>();
    }

    public void startGame() throws IOException {
        Print.header("Welcome to the Overkill Engine Game!");
        Print.textln("Please enter your character's name:");
        String name = Input.String();
        player.setName(name);
        Print.textln("Hello, " + player.getName() + "! Let's start your adventure.");
        mainGameLoop();
    }

    private void mainGameLoop() throws IOException {
        while (true) {
            Print.header("Main Menu");
            Print.textln("1. View Quests");
            Print.textln("2. Customize Character");
            Print.textln("3. Trigger Random Event");
            Print.textln("4. Interact with NPC");
            Print.textln("5. Exit Game");
            int choice = Input.Int();

            switch (choice) {
                case 1:
                    viewQuests();
                    break;
                case 2:
                    customizeCharacter();
                    break;
                case 3:
                    triggerRandomEvent();
                    break;
                case 4:
                    interactWithNPC();
                    break;
                case 5:
                    Print.textln("Thank you for playing! Goodbye.");
                    return;
                default:
                    Print.textln("Invalid choice. Please try again.");
            }
        }
    }

    private void viewQuests() throws IOException {
        Print.header("Quests");
        if (quests.isEmpty()) {
            Print.textln("No quests available.");
        } else {
            for (Quest quest : quests) {
                Print.textln(quest.toString());
            }
        }
        Print.textln("Press Enter to return to the main menu.");
        Input.String();
    }

    private void customizeCharacter() throws IOException {
        Print.header("Character Customization");
        Print.textln("1. Change Name");
        Print.textln("2. Change Appearance");
        Print.textln("3. Change Attributes");
        Print.textln("4. Return to Main Menu");
        int choice = Input.Int();

        switch (choice) {
            case 1:
                Print.textln("Enter new name:");
                String newName = Input.String();
                player.setName(newName);
                Print.textln("Name changed to " + player.getName());
                break;
            case 2:
                // Add code for changing appearance
                break;
            case 3:
                // Add code for changing attributes
                break;
            case 4:
                return;
            default:
                Print.textln("Invalid choice. Please try again.");
        }
    }

    private void triggerRandomEvent() throws IOException {
        Print.header("Random Event");
        if (randomEvents.isEmpty()) {
            Print.textln("No random events available.");
        } else {
            Random random = new Random();
            RandomEvent randomEvent = randomEvents.get(random.nextInt(randomEvents.size()));
            Print.textln(randomEvent.toString());
        }
        Print.textln("Press Enter to return to the main menu.");
        Input.String();
    }

    private void interactWithNPC() throws IOException {
        Print.header("NPC Interaction");
        // Add code for AI-driven NPC interactions using OpenAI GPT-3 API
        Print.textln("Press Enter to return to the main menu.");
        Input.String();
    }

    public void addQuest(Quest quest) {
        quests.add(quest);
    }

    public void addRandomEvent(RandomEvent randomEvent) {
        randomEvents.add(randomEvent);
    }
}
