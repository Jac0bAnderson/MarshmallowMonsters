package marshmallows.controller;


import marshmellow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster jakeMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController() 

	{
		int eyes = 3;
		double legs = 2;
		double hair = .5;
		int noses = 0;
		boolean hasBellyButton = false;
		
		String name= "Bada Bing Bada Boom, Pizza";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		jakeMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
		
	}
	
	public void start()
	{
		myOutput.displayMonsterConsole(jakeMonster.toString());
		myOutput.displayMonsterCool(jakeMonster.toInt());
		//myOutput.displayMonsterGUI(jakeMonster.toString());
		this.makeUserMonster();
		//myOutput.displayMonsterGUI("Your monster has " + userMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("type in a better name for the monster ");
		String betterMonsterName = monsterScanner.next();
		jakeMonster.setMonsterName(betterMonsterName);
		//name
		
		System.out.println("type in the amount of eyes ");
		int betterMonsterEyes = monsterScanner.nextInt();
		jakeMonster.setMonsterEyes(betterMonsterEyes);
		//eyes
		
		System.out.println(" whats the amount of noses? ");
		int betterMonsterNose = monsterScanner.nextInt();
		jakeMonster.setMonsterNose(betterMonsterNose);
		//nose
		
		System.out.println(" Type in a better hair amount ");
		double betterMonsterHair = monsterScanner.nextDouble();
		jakeMonster.setMonsterHair(betterMonsterHair);
		//hair
		
		}

	/**
	 * This method will get the information to create an instance of a Marshmallow Monster.
	 */
	private void makeUserMonster()
	{
		//Step one: Get variables
		String userName;
		int userEyes;
		int userNoseCount;
		double userHair;
		double userLegs;
		boolean userBellyButton;
		
		
		//Step two: define variables by using Scanner to get user input.
		System.out.println("type in your name for da monster.");
		userName = monsterScanner.nextLine();//nextLine automatically gives you a string
			System.out.println("Type in the number of eyes for da monster");
			userEyes =monsterScanner.nextInt();//you have to use nextInt to get the integer 
		System.out.println(" Type in the number of noses dawg.");
		userNoseCount = monsterScanner.nextInt();
			System.out.println("How much hair dosnt ur monster have dood");
			userHair = monsterScanner.nextDouble();
		System.out.println("how many cooks i, mean legs?");
		userLegs = monsterScanner.nextDouble();
			System.out.println("true or false, does you monster own his very own bellybutton");
			userBellyButton= monsterScanner.nextBoolean();
		
			//Step three: Make a  monster -use the constructor.
			userMonster = new MarshmallowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton); 
			
			
		
		
	}

	
	
	
}
 