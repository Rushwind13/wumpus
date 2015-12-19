package com.learning.wumpus.hunt.the.wumpus;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHeroMovement {
	public GameGrid grid;
    private Hero hero;
    private int loc;

    @Before
	public void setup(){
		grid = new GameGrid(4,5);
        hero = new Hero();
        loc = grid.place(hero, 7);
	}

	@Test
	public void testPlaceHeroAt7()
	{
		assertEquals("I am a 4x5 grid with a " + hero, grid.explainYourself());
		System.out.println(grid.explainYourself());
        assertEquals("I am a hero at location: 7", hero.explainYourself());
	}

    @Test
    public void testMoveHeroLeftOne()
    {
        int loc = hero.move("Left");
        assertEquals("I am a 4x5 grid with a " + hero, grid.explainYourself());
        System.out.println(grid.explainYourself());
        assertEquals("I am a hero at location: " + loc, hero.explainYourself());
    }
}