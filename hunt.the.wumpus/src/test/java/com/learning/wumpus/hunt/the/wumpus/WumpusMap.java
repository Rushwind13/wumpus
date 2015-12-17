package com.learning.wumpus.hunt.the.wumpus;

public class WumpusMap {

	private int width;
	private int height;
	private WumpusRoom []rooms;
	
	public WumpusMap(int i, int j) 
	{
		this.width = i;
		this.height = j;
		rooms = new WumpusRoom[i*j];
		for( int k = 0; k < i*j; k++ )
		{
			WumpusRoom room = new WumpusRoom();
			System.out.println(room);
			rooms[k] = room;
			
		}
	}

	public String explainYourself() 
	{
		// TODO Auto-generated method stub
		
		StringBuilder retval = new StringBuilder();
		
		retval.append("I am a " + this.width + "x" + this.height + " grid ");
				
		for( WumpusRoom room: this.rooms )
		{
			if( room.contents != null )
			{
				retval.append( "with a " + room.contents );
			}
		}

		return retval.toString();
	}

	public int place(WumpusBat bat, long seed) 
	{
		// figure out which room
		// put the bat in the room
		// set the room's contents
		int whichroom = 0;
		WumpusRoom room = rooms[whichroom];
		room.contents = bat;
		bat.loc = whichroom;
		
		return whichroom;
	}

}
