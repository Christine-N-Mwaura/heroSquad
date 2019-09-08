package models;


import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void newSquadInstantiatesCorrectly_true() {
        Squad mySquad = new Squad("Justice League",7,"Fighting Evil");
        assertEquals(true,mySquad instanceof Squad);
    }

}