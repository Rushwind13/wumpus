package com.learning.wumpus.hunt.the.wumpus;

public class Hero
{
	int loc;

	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + " at loc: " + this.loc;
	}

	public String explainYourself() {
        return "I am a hero at location: " + this.loc;
	}

    public int move(String direction) {
		String dir = direction.toLowerCase();

		if(dir.equals("left")){
			this.loc -= 1;
			return this.loc;
		} else {
			this.loc += 1;
			return this.loc;
		}
    }
}
