package com.tester.basic;

public abstract class Skill {

    private String name;
    private int level;
    protected Servant servant;

    public Skill(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    protected Servant getServant() {
        return servant;
    }

    protected void setServant(Servant servant) {
        this.servant = servant;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    public abstract void activate();
}
