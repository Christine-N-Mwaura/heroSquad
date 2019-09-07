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
    public void newHeroObjectIsCorrectlyCreated() {
        Individual_Hero hero = new Individual_Hero("Batman");
        assertEquals(true, hero instanceof Individual_Hero);

    }
}