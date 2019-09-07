package hero;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Individual_HeroTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void newHeroObjectIsCorrectlyCreated_true() throws Exception {
        Individual_Hero hero = setUpNewHero();
        assertEquals(true, hero instanceof Individual_Hero);

    }

    @Test
    public void HeroInstantiateWithName() throws Exception {
        Individual_Hero hero = setUpNewHero();
        assertEquals("Batman",hero.getName());
    }

    @Test
    public void HeroInstantiateWithAge () throws Exception {
        Individual_Hero hero = setUpNewHero();
        assertEquals(22,hero.getAge());
    }

    public Individual_Hero setUpNewHero(){
        return new Individual_Hero("Batman",22);
    }
}