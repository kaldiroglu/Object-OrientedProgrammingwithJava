package org.javaturk.oopj.hw.ch08.refactoring;

import java.util.ArrayList;
import java.util.List;

// ============================================================================
// STARTER CODE — full of duplication. Refactor into an abstract Animal class.
// ============================================================================

class Dog {
    private String name;
    private int ageMonths;
    private int energy;
    private int hunger;
    private boolean asleep;
    private final List<String> log = new ArrayList<>();

    public Dog(String name, int ageMonths) {
        this.name = name;
        this.ageMonths = ageMonths;
        this.energy = 50;
        this.hunger = 50;
        this.asleep = false;
    }

    public String getName() { return name; }
    public int getAgeMonths() { return ageMonths; }
    public int getEnergy() { return energy; }
    public int getHunger() { return hunger; }
    public boolean isAsleep() { return asleep; }
    public List<String> getLog() { return log; }

    public String makeSound() {
        return "Woof!";
    }

    public String eat(String food) {
        if (asleep) {
            log.add(name + " is asleep, cannot eat");
            return name + " is asleep";
        }
        if (!food.equals("kibble") && !food.equals("meat")) {
            log.add(name + " refuses " + food);
            return name + " refuses " + food;
        }
        hunger = Math.max(0, hunger - 30);
        energy = Math.min(100, energy + 10);
        log.add(name + " ate " + food);
        return name + " ate " + food;
    }

    public String sleep() {
        asleep = true;
        energy = Math.min(100, energy + 40);
        log.add(name + " is sleeping");
        return name + " is sleeping";
    }

    public String wakeUp() {
        asleep = false;
        log.add(name + " woke up");
        return name + " woke up";
    }

    public String describe() {
        return "Dog " + name + " (" + ageMonths + "mo) energy=" + energy
                + " hunger=" + hunger + " sound=" + makeSound();
    }

    public void ageOneMonth() {
        ageMonths++;
        hunger = Math.min(100, hunger + 5);
    }
}

class Cat {
    private String name;
    private int ageMonths;
    private int energy;
    private int hunger;
    private boolean asleep;
    private final List<String> log = new ArrayList<>();

    public Cat(String name, int ageMonths) {
        this.name = name;
        this.ageMonths = ageMonths;
        this.energy = 50;
        this.hunger = 50;
        this.asleep = false;
    }

    public String getName() { return name; }
    public int getAgeMonths() { return ageMonths; }
    public int getEnergy() { return energy; }
    public int getHunger() { return hunger; }
    public boolean isAsleep() { return asleep; }
    public List<String> getLog() { return log; }

    public String makeSound() {
        return "Meow!";
    }

    public String eat(String food) {
        if (asleep) {
            log.add(name + " is asleep, cannot eat");
            return name + " is asleep";
        }
        if (!food.equals("fish") && !food.equals("meat")) {
            log.add(name + " refuses " + food);
            return name + " refuses " + food;
        }
        hunger = Math.max(0, hunger - 30);
        energy = Math.min(100, energy + 10);
        log.add(name + " ate " + food);
        return name + " ate " + food;
    }

    public String sleep() {
        asleep = true;
        energy = Math.min(100, energy + 40);
        log.add(name + " is sleeping");
        return name + " is sleeping";
    }

    public String wakeUp() {
        asleep = false;
        log.add(name + " woke up");
        return name + " woke up";
    }

    public String describe() {
        return "Cat " + name + " (" + ageMonths + "mo) energy=" + energy
                + " hunger=" + hunger + " sound=" + makeSound();
    }

    public void ageOneMonth() {
        ageMonths++;
        hunger = Math.min(100, hunger + 5);
    }
}

class Bird {
    private String name;
    private int ageMonths;
    private int energy;
    private int hunger;
    private boolean asleep;
    private final List<String> log = new ArrayList<>();

    public Bird(String name, int ageMonths) {
        this.name = name;
        this.ageMonths = ageMonths;
        this.energy = 50;
        this.hunger = 50;
        this.asleep = false;
    }

    public String getName() { return name; }
    public int getAgeMonths() { return ageMonths; }
    public int getEnergy() { return energy; }
    public int getHunger() { return hunger; }
    public boolean isAsleep() { return asleep; }
    public List<String> getLog() { return log; }

    public String makeSound() {
        return "Tweet!";
    }

    public String eat(String food) {
        if (asleep) {
            log.add(name + " is asleep, cannot eat");
            return name + " is asleep";
        }
        if (!food.equals("seeds") && !food.equals("worms")) {
            log.add(name + " refuses " + food);
            return name + " refuses " + food;
        }
        hunger = Math.max(0, hunger - 30);
        energy = Math.min(100, energy + 10);
        log.add(name + " ate " + food);
        return name + " ate " + food;
    }

    public String sleep() {
        asleep = true;
        energy = Math.min(100, energy + 40);
        log.add(name + " is sleeping");
        return name + " is sleeping";
    }

    public String wakeUp() {
        asleep = false;
        log.add(name + " woke up");
        return name + " woke up";
    }

    public String describe() {
        return "Bird " + name + " (" + ageMonths + "mo) energy=" + energy
                + " hunger=" + hunger + " sound=" + makeSound();
    }

    public void ageOneMonth() {
        ageMonths++;
        hunger = Math.min(100, hunger + 5);
    }
}
