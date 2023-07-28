package com.tester.basic;

public class Character {

    private String name;
    private String servantClass;
    private int level;
    private int attack;
    private int defense;
    private int health;

    public Character(String name, String servantClass, int level, int attack, int defense, int health) {
        this.name = name;
        this.servantClass = servantClass;
        this.level = level;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServantClass() {
        return servantClass;
    }

    public void setServantClass(String servantClass) {
        this.servantClass = servantClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "FateGOCharacter{" +
                "name='" + name + '\'' +
                ", class='" + servantClass + '\'' +
                ", level=" + level +
                ", attack=" + attack +
                ", defense=" + defense +
                ", health=" + health +
                '}';
    }
}
