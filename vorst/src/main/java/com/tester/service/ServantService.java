package com.tester.service;

import java.util.List;

import com.tester.basic.Servant;
import com.tester.basic.Skill;
import com.tester.basic.skill.*;
import org.springframework.stereotype.Service;


@Service
public class ServantService {

    private List<Servant> servants = List.of(
            new Servant("Artoria Pendragon", "Saber", 100, 1000, 500, 10000, "Excalibur", new Skill[]{new MagicResistance(), new Riding()}),
            new Servant("Scathach", "Lancer", 100, 900, 600, 9000, "Gae Bolg", new Skill[]{new MagicResistance(), new Riding()}),
            new Servant("Gilgamesh", "Archer", 100, 1100, 400, 11000, "Enkidu", new Skill[]{new MagicResistance(), new Riding()})
    );

    public List<Servant> getServants() {
        return servants;
    }


}
