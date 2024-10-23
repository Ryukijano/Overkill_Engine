package Overkill_Engine;

import java.util.HashMap;
import java.util.Map;

public class Character {
    private String name;
    private Map<String, Integer> attributes;
    private String appearance;

    public Character() {
        this.name = "Unnamed";
        this.attributes = new HashMap<>();
        this.appearance = "Default";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Integer> attributes) {
        this.attributes = attributes;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public void customizeCharacter(String newName, String newAppearance, Map<String, Integer> newAttributes) {
        setName(newName);
        setAppearance(newAppearance);
        setAttributes(newAttributes);
    }

    public String interactWithNPC(String npcName, String npcMessage) {
        // Placeholder for AI-driven NPC interactions using OpenAI GPT-3 API
        return "Interacting with " + npcName + ": " + npcMessage;
    }

    @Override
    public String toString() {
        return "Character: " + name + "\nAppearance: " + appearance + "\nAttributes: " + attributes.toString();
    }
}
