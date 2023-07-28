package com.tester.basic.skill;

import com.tester.basic.Skill;

public class IndependentAction extends Skill {

    public IndependentAction() {
        super("Independent Action", 1);
    }

    @Override
    public void activate() {
        getServant().setAttack(getServant().getAttack() + 12);
    }
}