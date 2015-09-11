package marshmellow.model;

public class MarshmallowMonster
{
private String monsterName;
private int monsterEyes;
private int monsterNose;
private double monsterHair;
private double monsterLegs;
private boolean monsterBellyButton; 
// int, doubles, and booleans are primitives which means they can only hold value


private  MarshmallowMonster()
{
	
} 
public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNose, double monsterHair, double monsterLegs,boolean monsterBellyButton)
{
this.monsterName = monsterName;
this.monsterEyes = monsterEyes;
this.monsterNose = monsterNose;
this.monsterHair = monsterHair;
this.monsterLegs = monsterLegs;
this.monsterBellyButton = monsterBellyButton;

}
	public String toString()
{
		String monster =" this has " + monsterEyes +"and it's name is" + monsterName;
		return monster;
		}







}
