package com.learning.wumpus.hunt.the.wumpus;

public class GameGrid {

	private int width;
	private int height;
	private Room[] rooms;
	
	public GameGrid(int i, int j)
	{
		this.width = i;
		this.height = j;
		rooms = new Room[i*j];
		for( int k = 0; k < i*j; k++ )
		{
			Room room = new Room();
			System.out.println(room);
			rooms[k] = room;
			
		}
	}

	public String explainYourself() 
	{
		// TODO Auto-generated method stub
		
		StringBuilder retval = new StringBuilder();
		
		retval.append("I am a " + this.width + "x" + this.height + " grid ");
				
		for( Room room: this.rooms )
		{
			if( room.contents != null )
			{
				retval.append( "with a " + room.contents );
			}
		}

		return retval.toString();
	}

	public int place(Hero bat, long seed)
	{
		// figure out which room
		// put the bat in the room
		// set the room's contents
		int whichroom = 0;
		Room room = rooms[whichroom];
		room.contents = bat;
		bat.loc = whichroom;
		
		return whichroom;
	}

}
