package com.learning.wumpus.hunt.the.wumpus;

public class Hero
{
	public int loc;
	
	
	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + " at loc: " + this.loc;
	}
}
