package marshmallows.controller;


import marshmellow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster jakeMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController() 
	{
		int eyes = 3;
		double legs = 2;
		double hair = .5;
		int noses = 0;
		boolean hasBellyButton = false;
		String name= "Supa Maario";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		jakeMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
		
	}
	public void start()
	{
		myOutput.displayMonsterInfo(jakeMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("My Muncher has " + jakeMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("type in a better name for the monster ");
		String betterMonsterName = monsterScanner.next();
		jakeMonster.setMonsterName(betterMonsterName);
		System.out.println("type in the amount of eyes ");
		int betterMonsterEyes = monsterScanner.nextInt();
		jakeMonster.setMonsterEyes(betterMonsterEyes);
		
	}

	

	
	
	
}
 