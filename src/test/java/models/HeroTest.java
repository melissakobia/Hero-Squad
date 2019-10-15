package models;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;


public class HeroTest {
    @Test
    public void HeroInstantiatesCorrectly_true() throws Exception {
        Hero myHero = new Hero("CatWoman", 23, "Climbing", "Dogs");
        assertTrue(true);
    }

    public Hero setUpNewHero() {
        return new Hero("CatWoman", 23, "Climbing", "Dogs");
    }

    @Test
    public void HeroInstantiatesWithName_true() throws Exception {
        Hero myHero = setUpNewHero();
        assertEquals("CatWoman", myHero.getName());
    }

    @Test
    public void HeroInstantiatesWithAge_23() throws Exception {
        Hero myHero = setUpNewHero();
        assertEquals(23, myHero.getAge());
    }

    @Test
    public void HeroInstantiatesWithSpecialPower_climbing() throws Exception {
        Hero myHero = setUpNewHero();
        assertEquals("Climbing", myHero.getSpecialPower());
    }

    @Test
    public void HeroInstantiatesWithWeakness_Dogs() throws Exception {
        Hero myHero = setUpNewHero();
        assertEquals("Dogs", myHero.getWeakness());
    }

    @After
    public void tearDown() throws Exception {
        Hero.clearAllHeroes();

    }

    @Test
    public void AllHeroesAreCorrectlyReturned_2() {
        Hero myHero = setUpNewHero();
        Hero otherHero = setUpNewHero();
        assertEquals(2, Hero.getAll().size());
    }

    @Test
    public void AllHeroesContainsAllHeroes() {
        Hero myHero = setUpNewHero();
        Hero otherHero = setUpNewHero();
        assertTrue(Hero.getAll().contains(myHero));
        assertTrue(Hero.getAll().contains(otherHero));

    }
}