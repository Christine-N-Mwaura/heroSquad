package dao;

import models.Individual_Hero;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.*;


import static org.junit.Assert.*;


public class Sql2oHeroDaoTest {
    private Sql2oHeroDao heroDao;
    private Connection con;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString,"","");
        heroDao = new Sql2oHeroDao(sql2o);
        con =  sql2o.open();

    }

    @After
    public void tearDown() throws Exception {
        con.close();
    }

    @Test
    public void addingHeroSetsId() throws Exception {
        Individual_Hero hero = new Individual_Hero("Superman",12);
        heroDao.add(hero);

        Individual_Hero foundHero = heroDao.findById(hero.getId());
        assertEquals(hero, foundHero);
    }

}