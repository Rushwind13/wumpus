package com.learning.wumpus.hunt.the.wumpus;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestInitializeGame {
    
	private GameGrid grid;

	@Before
	public void setUp(){
		this.grid = new GameGrid(2,2);
	}
	
	@Test
	public void testDrawGrid()
    {
        assertEquals("I am a 2x2 grid ", this.grid.explainYourself());
    }

	
	@Test
	public void testAddABat()
	{
		long seed = System.currentTimeMillis();
		Hero hero = new Hero();
		int loc = this.grid.place(hero, seed);
		assertEquals("I am a 2x2 grid with a " + hero, this.grid.explainYourself());
		System.out.println(this.grid.explainYourself());
	}
}
