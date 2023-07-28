package com.tester.basic;

public class Servant extends Character {

    private String noble_phantasm;
    private Skill[] skills;

    public Servant(String name, String servantClass, int level, int attack, int defense, int health, String noble_phantasm, Skill[] skills) {
        super(name, servantClass, level, attack, defense, health);
        this.noble_phantasm = noble_phantasm;
        this.skills = skills;
    }

    public String getNoblePhantasm() {
        return noble_phantasm;
    }

    public void setNoblePhantasm(String noble_phantasm) {
        this.noble_phantasm = noble_phantasm;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }

    public void activateSkill(int skillIndex) {
        skills[skillIndex].activate();
    }

    public void attack(Servant servant) {
        int damage = getAttack() - servant.getDefense();
        servant.setHealth(servant.getHealth() - damage);
    }

    public boolean isDead() {
        return getHealth() <= 0;
    }

    @Override
    public String toString() {
        return "Servant{" +
                "name='" + getName() + '\'' +
                ", class='" + getServantClass() + '\'' +
                ", level=" + getLevel() +
                ", attack=" + getAttack() +
                ", defense=" + getDefense() +
                ", health=" + getHealth() +
                ", noble_phantasm='" + noble_phantasm + '\'' +
                ", skills=" + skills +
                '}';
    }
}
