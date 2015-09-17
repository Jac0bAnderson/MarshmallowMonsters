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
	public String getMonsterName()
{
	return monsterName;
}
	public int getMonsterEyes()
{
	return monsterEyes;
}
	public int monsterNose()
{
	return monsterNose;
}
	public double getMonsterHair()
{
	return monsterHair;
}
	public double getMonsterLegs()
{
	return monsterLegs;
}
	public boolean getMonsterBellyButton()
{
	return monsterBellyButton;
}
	public void setMonsterName(String monsterName)
{
	this.monsterName = monsterName;
}
	public void setMonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public void setMonsterNose(int monsterNose)
	{
		this.monsterNose = monsterNose;
	}
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	public void setMonsterBellyButton(boolean monsterBellyButton)
	{
		this.monsterBellyButton = monsterBellyButton;
	}
	
	
	
	
	
	

	public String toString()
{
		String monster ="" + monsterEyes +" Eyes and it has " + monsterNose + " nose(s), it also has " + monsterHair + " hairs, and its name is " + monsterName;
		return monster;
		}







}
