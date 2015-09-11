package marshmallows.controller;


import marshmellow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

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
		myOutput.displayMonstersInfo(jakeMonster.toString());
	}
}
 