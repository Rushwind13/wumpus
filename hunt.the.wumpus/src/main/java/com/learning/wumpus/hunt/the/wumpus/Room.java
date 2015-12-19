package com.learning.wumpus.hunt.the.wumpus;

public class Room
{
	public Object contents;
	public Room()
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
