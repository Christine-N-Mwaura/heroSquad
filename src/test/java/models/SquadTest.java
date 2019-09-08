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
    public void newsquadNameisinstantiated() {
        Squad mySquad = setUpNewSquad();
        assertEquals("Justice League", mySquad.getSquadName());
    }



    public Squad setUpNewSquad(){
        return new Squad("Justice League",7,"Fighting Evil");
    }
}