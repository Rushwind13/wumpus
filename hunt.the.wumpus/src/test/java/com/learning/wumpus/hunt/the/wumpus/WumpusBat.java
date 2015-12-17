package com.learning.wumpus.hunt.the.wumpus;

public class WumpusBat implements WumpusCharacter
{
	public int loc;
	
	
	@Override
	public String toString()
	{
		return "WumpusBat at loc: " + this.loc;
	}
}
