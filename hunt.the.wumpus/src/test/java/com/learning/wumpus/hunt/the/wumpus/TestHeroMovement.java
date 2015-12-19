package com.learning.wumpus.hunt.the.wumpus;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHeroMovement {
	public GameGrid grid;

	@Before
	public void setup(){
		grid = new GameGrid(4,5);
	}

	@Test
	public void testPlaceHero_at7()
	{
        // spawn character
        // randomely place character within grid
        // get character location
        // move character left one room
        // assert that character is placed one room to the left

        Hero hero = new Hero();
		int loc = grid.place(hero, 7);
		assertEquals("I am a 4x5 grid with a " + hero, grid.explainYourself());
		System.out.println(grid.explainYourself());
        assertEquals("I am a hero at location: 7", hero.explainYourself());
	}
}