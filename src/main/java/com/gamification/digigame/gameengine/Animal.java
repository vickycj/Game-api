package com.gamification.digigame.gameengine;

public class Animal {

    private int value;
    private String animalName;
    private String animalCategory;

    public Animal(int value, String animalName, String animalCategory) {
        this.value = value;
        this.animalName = animalName;
        this.animalCategory = animalCategory;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalCategory() {
        return animalCategory;
    }

    public void setAnimalCategory(String animalCategory) {
        this.animalCategory = animalCategory;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "value=" + value +
                ", animalName='" + animalName + '\'' +
                ", animalCategory='" + animalCategory + '\'' +
                '}';
    }
}
