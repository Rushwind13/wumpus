package com.learning.wumpus.hunt.the.wumpus;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestWumpusMovement {
	public WumpusMap map;

	@Before
	public void setup(){
		
	}
	
	@Test
	public void testMoveBat()
	{
		long seed = System.currentTimeMillis();
		WumpusBat bat = new WumpusBat();
		int loc = map.place(bat, seed);
		assertEquals("I am a 2x2 grid with a " + bat, map.explainYourself());
		System.out.println(map.explainYourself());		
	}
}