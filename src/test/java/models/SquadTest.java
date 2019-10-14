package models;


import org.junit.After;
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
        assertEquals("Peace Makers", mySquad.getSquadName());
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

    @After
    public void tearDown() throws Exception {
        Squad.clearAllSquads();

    }

    @Test
    public void AllSquadsAreCorrectlyReturned_true() {
        Squad mySquad = new Squad("Peace Makers", "Peace",3 );
        Squad otherSquad = new Squad("Peace Makers", "Peace",3 );
        assertEquals(2, Squad.getAll().size());

    }

    @Test
    public void AllSquadsContainsAllSquads_true() {
        Squad mySquad = new Squad("Peace Makers", "Peace",3 );
        Squad otherSquad = new Squad("Peace Makers", "Peace",5 );

        assertTrue(Squad.getAll().contains(mySquad));
        assertTrue(Squad.getAll().contains(otherSquad));

    }

    @Test
    public void getId_squadInstantiatesWithAnID_1() throws Exception {
        Squad.clearAllSquads();
        Squad mySquad = new Squad("Peace Makers", "Peace",5 );
        assertEquals(1, mySquad.getId());
    }

    @Test
    public void findReturnsCorrectSquad() throws Exception {
        Squad mySquad = new Squad("Peace Makers", "Peace",5);
        assertEquals(1, Squad.findById(mySquad.getId()).getId());
    }

    @Test
    public void findReturnsCorrectSquadWhenMoreThanOneSquadExists_2() throws Exception {
        Squad mySquad = new Squad("Peace Makers", "Peace",5);
        Squad otherSquad = new Squad("Peace Makers", "Peace",3);
        assertEquals(2, Squad.findById(otherSquad.getId()).getId() );
    }
}