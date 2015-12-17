package com.learning.wumpus.hunt.the.wumpus;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestWumpus {
    
	
	private WumpusMap map;

	@Before
	public void setUp(){
		this.map = new WumpusMap(2,2);
	}
	@Test
	public void testDrawMap()
    {
        assertEquals("I am a 2x2 grid ", this.map.explainYourself());
    }
	
//	double randomGenerator(long seed) {
//	    Random generator = new Random(seed);
//	    double num = generator.nextDouble() * (0.5);
//
//	    return num;
//	}
	
	@Test
	//you could write a bat test separatly at this point but...for now its ok
	public void testAddABat()
	{
		long seed = System.currentTimeMillis();
		WumpusBat bat = new WumpusBat();
		int loc = this.map.place(bat, seed);
		assertEquals("I am a 2x2 grid with a " + bat, this.map.explainYourself());
		System.out.println(this.map.explainYourself());
	}
}
