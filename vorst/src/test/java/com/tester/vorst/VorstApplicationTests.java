package com.tester.vorst;

import com.tester.basic.Servant;
import com.tester.basic.Skill;
import com.tester.basic.skill.*;
import com.tester.basic.skill.MagicResistance;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class VorstApplicationTests {

	@Test
	void contextLoads() {
		testCreateServant();
		System.out.println("Los test salieron correctamente");
	}
	@Test
	void testCreateServant() {
		Servant servant = new Servant("Artoria Pendragon", "Saber", 100, 1000, 500, 10000, "Excalibur", new Skill[]{new MagicResistance(), new Riding()});

		assertEquals("Artoria Pendragon", servant.getName());
		assertEquals("Saber", servant.getServantClass());
		assertEquals(100, servant.getLevel());
		assertEquals(1000, servant.getAttack());
		assertEquals(500, servant.getDefense());
		assertEquals(10000, servant.getHealth());
		assertEquals("Excalibur", servant.getNoblePhantasm());
		assertNotNull(servant.getSkills());
		assertEquals(2, servant.getSkills().length);
	}
}
