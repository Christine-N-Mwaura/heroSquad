package models;


import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void newSquadInstantiatesCorrectly_true() {
        Squad mySquad = setUpNewSquad();
        assertEquals(true,mySquad instanceof Squad);
    }

    @Test
    public void newSquadNameIsInstantiated_String() {
        Squad mySquad = setUpNewSquad();
        assertEquals("Justice League", mySquad.getSquadName());
    }

    @Test
    public void newMaxSizeIsInstantiated_Int() {
        Squad mySquad = setUpNewSquad();
        assertEquals(7, mySquad.getMaxSize());

    }

    public Squad setUpNewSquad(){
        return new Squad("Justice League",7,"Fighting Evil");
    }
}