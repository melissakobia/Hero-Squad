package models;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SquadTest {
    @Test
    public void SquadIntantiatesCorrectly_true() throws Exception {
        Squad mysquad = new Squad();
        assertTrue(mysquad instanceof Squad);

    }
}