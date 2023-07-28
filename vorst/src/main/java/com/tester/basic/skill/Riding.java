package com.tester.basic.skill;

import com.tester.basic.Skill;

public class Riding extends Skill {

    public Riding() {
        super("Riding EX", 1);
    }

    @Override
    public void activate() {
        getServant().setAttack(getServant().getAttack() + 12);
    }
}