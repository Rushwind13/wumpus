package com.learning.wumpus.hunt.the.wumpus;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWumpus {
    
	@Test
	public void testDrawMap()
    {
        WumpusMap map = new WumpusMap(2,2);
        assertEquals("I am a 2x2 grid with no characters", map.explainYourself());
    }
}
