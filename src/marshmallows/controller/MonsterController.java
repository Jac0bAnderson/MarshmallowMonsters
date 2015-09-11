package marshmallows.controller;

import marshmallow.view.MarshmallowOutput;
import marshmellow.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster jakeMonster;
	private MarshmallowOutput myOutput;
	
	public MonsterController() 
	{
		int eyes = 3;
		double legs = 2;
		double hair = .5;
		int noses = 0;
		boolean hasBellyButton = false;
		String name= "Supa Maario";
		
		jakeMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
		
	}
	public void start()
	{
		myOutput.displayMonsterInfo(jakeMonster.toString());
	}
}
 