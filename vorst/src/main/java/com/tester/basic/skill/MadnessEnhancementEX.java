package com.tester.basic.skill;

import com.tester.basic.Skill;

public class MadnessEnhancementEX extends Skill {

    public MadnessEnhancementEX() {
        super("Madness Enhancement EX", 1);
    }

    @Override
    public void activate() {
        getServant().setAttack(getServant().getAttack() + 12);
    }

}
