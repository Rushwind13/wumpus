package com.learning.wumpus.hunt.the.wumpus;

public class WumpusRoom 
{
	public WumpusCharacter contents;
	public WumpusRoom()
	{
		contents = null;
	}
	
	@Override
	public String toString()
	{
		if( this.contents != null)
		{
			return contents.toString();
		} else {
			return "";
		}
		
	}
}
