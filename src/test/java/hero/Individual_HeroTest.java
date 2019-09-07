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
    public void newHeroObjectIsCorrectlyCreated() throws Exception {
        Individual_Hero hero = setUpNewHero();
        assertEquals(true, hero instanceof Individual_Hero);

    }

    @Test
    public void HeroInstantiateWithName_true() throws Exception {
        Individual_Hero hero = setUpNewHero();
        assertEquals(true,hero.getName());
    }



    public Individual_Hero setUpNewHero(){
        return new Individual_Hero("Batman",22);
    }
}