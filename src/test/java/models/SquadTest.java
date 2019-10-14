package models;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SquadTest {
    @Test
    public void SquadIntantiatesCorrectly_true() throws Exception {
        Squad mysquad = new Squad("Peace Makers", "Peace",3 );
        assertTrue(true);

    }

    @Test
    public void SquadInstantiatesWithName_true() throws Exception {
        Squad mySquad = new Squad("Peace Makers", "Peace",3 );
        assertEquals("Peace Makers", mySquad.getName());
    }

    @Test
    public void mySquadGetsCause_Peace() throws Exception {
        Squad mySquad = new Squad("Peace Makers", "Peace",3 );
        assertEquals( "Peace", mySquad.getCause());
    }

    @Test
    public void mySquadGetsMaxSize_3() throws Exception {
        Squad mySquad = new Squad("Peace Makers", "Peace",3 );
        assertEquals(3,mySquad.getMaxSize());
    }
}