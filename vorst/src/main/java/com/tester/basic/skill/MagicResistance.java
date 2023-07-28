package com.tester.basic.skill;

import com.tester.basic.Skill;

public class MagicResistance extends Skill {

    public MagicResistance() {
        super("Magic Resistance A", 1);
    }

    @Override
    public void activate() {
        int result = (getServant().getDefense()*20)/100;
        getServant().setDefense(getServant().getDefense() + result);
    }
}